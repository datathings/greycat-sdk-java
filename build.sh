#!/bin/bash
set -ex

mvn versions:set -DnewVersion="${VERSION}"
mvn clean package
mkdir -p dist
cp target/sdk-"${VERSION}".jar dist/sdk.jar
cp pom.xml dist/sdk.pom