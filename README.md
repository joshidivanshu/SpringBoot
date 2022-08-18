# SpringBoot
Basic Implementation of Rest APIS, Actuator and Logging using SpringBoot

    1. Spring Boot Started Projects
        1. Help you up and project running  for web we will have web dependency
        2. Auto converts specific bean to json - spring-boot-started-json
        3. We would want to run the application in tomcat - spring-boot-starter-tomcat
        4. For database we have spring boot starter jpa
        5. We mention all the dependencies these are defined by spring boot starters
        6. All the configurations for the dependencies are provided by the spring boot
        7. Embedded Servers
            1. You can just install java
            2. Create a JAR File of your project
            3. And can simply run the project from the JAR File.
        8. SpringBoot Actuator
            1. Add this to pom.xml to use spring-actuator 
                1. <dependency>
                2.             <groupId>org.springframework.boot</groupId>
                3.             <artifactId>spring-boot-starter-actuator</artifactId>
                4.         </dependency>
            2. Monitor and manage your application in production
            3. Beans, health , metrics and request mappings
            4. Actuator is present at localhost:8080/actuator
            5. If you want more urls in the actuator go to application.properties and add this line management.endpoints.web.exposure.include=*
            6. Now you will observe more number of endpoints in the actuator url which u can use for metrics and performance logging.
        9. Spring Boot Dev Tools
            1. Add this to pom.xml to use Spring Boot Developer Tools
                1. <dependency>
                2.             <groupId>org.springframework.boot</groupId>
                3.             <artifactId>spring-boot-tools</artifactId>
                4.         </dependency>
            2. Now after adding this whatever changes you make to the spring applications will automatically be picked up by the developer tools and the server will be restarted accordingly.
