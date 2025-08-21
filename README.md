# GreyCat Java SDK

## Prerequisites

- Java >= 8
- Maven 3 or Gradle

## Install

- Maven:
  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <project>
    <!-- […] -->
    <properties>
        <!-- […] -->
        <!-- Check latest version at https://get.greycat.io -->
        <greycat.version.branch>testing</greycat.version.branch>
        <greycat.version.major>7.0</greycat.version.major>
        <greycat.version.minor>6</greycat.version.minor>
        <greycat.version>${greycat.version.major}.${greycat.version.minor}-${greycat.version.branch}</greycat.version>
    </properties>
    <!-- […] -->
    <dependencies>
        <!-- […] -->
        <dependency>
            <groupId>ai.greycat</groupId>
            <artifactId>sdk</artifactId>
             <version>${greycat.version}</version>
        </dependency>
    </dependencies>
    <!-- […] -->
    <repositories>
      <!-- […] -->
      <repository>
        <name>GreyCat Java SDK repository</name>
        <id>get.greycat.io</id>
        <url>https://get.greycat.io/files/sdk/java/${greycat.version.branch}/${greycat.version.major}/</url>
        <layout>default</layout>
      </repository>
    </repositories>
    <!-- […] -->
  </project>
  ```

- Gradle
  ```json
  TODO
  ```
  
## Clean

```bash
rm -rf bin/ files/ gcdata/ lib/
```

## Test

- In a first terminal:
  ```bash
  GREYCAT_CORE= greycat codegen java
  greycat install
  greycat serve
  ```
- In a second terminal:
  ```bash
  mvn clean test-compile org.codehaus.mojo:exec-maven-plugin:3.5.1:java -Dexec.mainClass=greycat.Client -Dexec.classpathScope=test
  ```