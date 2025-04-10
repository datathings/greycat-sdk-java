# GreyCat Java SDK

## Prerequisites

- Java >= 8
- Maven 3 or Gradle

## Install

- Maven:
  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <project>
    […]
    <dependencies>
        […]
        <dependency>
            <groupId>ai.greycat</groupId>
            <artifactId>sdk</artifactId>
            <version>7.0.1-testing</version><!-- Check latest version at https://get.greycat.io -->
        </dependency>
    </dependencies>
    […]
    <repositories>
      […]
      <repository>
        <name>GreyCat Java SDK repository</name>
        <id>get.greycat.io</id>
        <url>https://get.greycat.io/files/sdk/java/${greycat.version.branch}/${greycat.version.major}/</url>
        <layout>default</layout>
      </repository>
    </repositories>
    […]
  </project>
  ```

- Gradle
  ```json
  TODO
  ```