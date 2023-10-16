#!/bin/bash
set -e

VERSION_MAJOR_MINOR=`cat VERSION`

echo "${VERSION_MAJOR_MINOR} / ${VERSION}"

sha256_hash=$(echo -n "$GET_GC_CI_PASS" | openssl dgst -sha256 | cut -d ' ' -f2)
base64url_token=$(echo -n "ci:$sha256_hash" | base64 -w 0 )
token=$(curl -s -d "[\"${base64url_token}\", false]" -X POST https://get.greycat.io/runtime::User::login | tr -d '"')

whoami
mkdir -p /root/.m2
cat << EOF > /root/.m2/settings.xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 https://maven.apache.org/xsd/settings-1.0.0.xsd">
  <servers>
    <server>
      <id>deploy</id>
      <configuration>
        <httpConfiguration>
          <all>
            <headers>
              <property>
                <name>Authorization</name>
                <value>${token}</value>
                </property>
            </headers>
          </all>
        </httpConfiguration>
      </configuration>
    </server>
  </servers>
</settings>
EOF

cd dist

mvn deploy:deploy-file -Dfile=sdk.jar -DpomFile=sdk.pom -DrepositoryId=deploy -Durl=https://get.greycat.io/files/sdk/java/"${CI_COMMIT_REF_NAME}"/"${VERSION_MAJOR_MINOR}"/ ||
mvn -X deploy:deploy-file -Dfile=sdk.jar -DpomFile=sdk.pom -DrepositoryId=deploy -Durl=https://get.greycat.io/files/sdk/java/"${CI_COMMIT_REF_NAME}"/"${VERSION_MAJOR_MINOR}"/