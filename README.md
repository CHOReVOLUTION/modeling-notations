# Modeling Notations
This repository contains the metamodels, graphical editors related to the chorevolution studio.
Furthermore, the metamodels are used inside the synthesis processor for synthesizing the artefacts such as Binding Components, Adapters, Security Filters and Coordination Delegates.

## Requirements

* [Apache Maven 3.3.3+](https://maven.apache.org/install.html)
* [Java 8+](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

### Building

To build the project and generate the bundle use Maven

    mvn clean package


## Usage
Inside the pom.xml file add the following repository

```
<repositories>
	<repository>
		<id>chorevolution-modeling-notations</id>
		<layout>p2</layout>
		<url>http://nexus.disim.univaq.it/content/sites/chorevolution-modeling-notations/</url>
	</repository>
</repositories>
```
and the following dependency

```
<dependencies>
	<dependency>
		<groupId>eu.chorevolution.validations</groupId>
		<artifactId>bpmn2choreography-validator</artifactId>
		<version>2.2.0</version>
	</dependency>
</dependencies>
```
