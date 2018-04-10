Followed below steps to create this project

1. Created Spring boot application using Spring initializer page
2. Created BaseTestClass required by the Maven plugin to generate the 
3. Added "spring-cloud-contract-maven-plugin" to the pom.xml in the plugins section and configured Base
4. Created a folder structure 'resources/contracts/'in /src/test/  and the 'shouldReturnEvenWhenRequestParamIsEven.groovy' file in the new folder created
5. Add the test in groovy format
6. Run mvn test command which would generate the test class in target/generated-test-sources folder



Reference - http://www.baeldung.com/spring-cloud-contract 
