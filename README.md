# quarkus-myfaces

Prototype implementation of a JSF / MyFaces Core module for Quarkus. 
It's completely based on MyFaces 3.x as some changes were required.

## Whats not supported?
- JSF: Flows
- JSF: Injection into JSF arftifacts
- Quarkus: src/main/webapp! You need to put your views under src/main/resources/META-INF/resources!
- Quarkus: session replication / passivation / clustering
- some features probably :D


## How to try it?

### Build MyFaces
`git clone https://github.com/apache/myfaces.git && cd myfaces && mvn clean install -DskipTests`

### Build quarkus-myfaces
`mvn clean install -DskipTests`

### Run showcase
* `cd showcase &&  mvn compile quarkus:dev`
* Access http://localhost:8080/index.xhtml



