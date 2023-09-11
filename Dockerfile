FROM openjdk:8

ADD target/spring-kubernetes-example.jar spring-kubernetes-example.jar

ENTRYPOINT ["java","-jar","spring-kubernetes-example.jar"]
