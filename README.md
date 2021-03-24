# SkilloVilla SpringBoot App

This is an minimal [Spring Boot](http://projects.spring.io/spring-boot/) Skillovilla backend application.

## Requirements

For building and running the application you need:

- [Java SE Development Kit 11](https://www.oracle.com/in/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.skillovilla.SkilloVillaApplication.java` class from your [STS](https://spring.io/tools) IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Calling the REST API

To hit get Course Details API using following command which uses courseId = 1

```bash
curl -v http://localhost:8080/course/1
```