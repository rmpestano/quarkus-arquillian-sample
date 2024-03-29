/*
Copyright 2019 JBoss by Red Hat.
 *
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 *
     http://www.apache.org/licenses/LICENSE-2.0
 *
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package io.quarkus.myfaces.runtime;

import javax.enterprise.inject.spi.CDI;
import javax.faces.annotation.FacesConfig;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.myfaces.cdi.config.FacesConfigBeanHolder;

@WebListener
public class QuarkusServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        FacesConfigBeanHolder facesConfigBeanHolder = CDI.current().select(FacesConfigBeanHolder.class).get();
        facesConfigBeanHolder.setFacesConfigVersion(FacesConfig.Version.JSF_2_3);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
