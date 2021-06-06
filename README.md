# cowinMgmt

[![Build Status](https://travis-ci.org/codecentric/cowinMgmt.svg?branch=master)](https://travis-ci.org/codecentric/cowinMgmt)
[![Coverage Status](https://coveralls.io/repos/github/codecentric/cowinMgmt/badge.svg?branch=master)](https://coveralls.io/github/codecentric/cowinMgmt?branch=master)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

Wrapper App for existing [Cowin](https://www.cowin.gov.in) App, to provide better filtering functionality 
with additional filters and enhanced query result using [ELK](https://www.elastic.co/what-is/elk-stack) stack.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a CowinMgmt application on your local machine. One way is to execute the `main` method in the `com.cowinMgmt` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
java -jar  cowinMgmt-1.0-SNAPSHOT.jar
```

## Deploying ELK Stack to get the Data of [Cowin](https://www.cowin.gov.in) APP

The easiest way to deploy the ELK stack is to clone [cowin-dockerSolution](https://github.com/MaverickNyk/cowin-dockerSolution) repo and instantiate the docker cluster

```shell
docker-compose up -d
```

This will create:

* An ElasticSearch instance at port 9200
* A Kibana instance at port 5601
* A Logstash instance which will poll the data of vaccination centers every 5 minutes from [Cowin](https://www.cowin.gov.in) App

if you want to access the Kibana dashboard it will be available at localhost:5601



## Copyright

Released under the Apache License 2.0. See the [LICENSE](https://github.com/MaverickNyk/cowinMgmt/blob/master/LICENSE) file.