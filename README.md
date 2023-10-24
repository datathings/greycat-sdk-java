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
    <properties>
      […]
        <greycat.version.branch>testing</greycat.version.branch>
        <greycat.version.major>6.4</greycat.version.major>
        <greycat.version.minor>1</greycat.version.minor>
      <greycat.version>${greycat.version.major}.${greycat.version.minor}-${greycat.version.branch}</greycat.version>
    </properties>
    […]
    <dependencies>
        […]
        <dependency>
            <groupId>ai.greycat</groupId>
            <artifactId>sdk</artifactId>
            <version>${greycat.version}</version>
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