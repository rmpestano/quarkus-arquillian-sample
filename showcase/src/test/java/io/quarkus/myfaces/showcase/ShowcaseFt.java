package io.quarkus.myfaces.showcase;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.net.URL;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(Arquillian.class)
public class ShowcaseFt {

	@ArquillianResource
	URL url;

	@Drone
	WebDriver browser;

	@Deployment
	public static JavaArchive deploy() {
		return ShrinkWrap.create(JavaArchive.class, "test.jar")
				.addPackages(true, "io.quarkus.myfaces.showcase.view")
				.addClass(StartupListener.class);

	}


	@Test
	public void shouldOpenIdndexPage() {
		assertThat(browser).isNotNull();
		browser.get(url + "/index.xhtml");
	}
}
