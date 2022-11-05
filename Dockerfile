FROM openjdk:11
EXPOSE 8080
ADD target/docker-images-test.jar docker-images-test.jar
ENTRYPOINT ["java","-jar","/docker-images-test.jar "]