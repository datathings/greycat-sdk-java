#!/bin/bash
set -ex

mvn versions:set -DnewVersion="${PROJECT_VERSION_SIMPLE}"
mvn clean package
mkdir -p dist
cp target/sdk-"${PROJECT_VERSION_SIMPLE}".jar dist/sdk.jar
cp pom.xml dist/sdk.pom