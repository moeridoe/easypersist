FROM eclipse-temurin:21_35-jre-alpine

ENV EASYPERSIST_VERSION 0.0.9

COPY target/easypersist-${EASYPERSIST_VERSION}-spring-boot.jar easypersist.jar

RUN java -version

ENTRYPOINT [ "java", "-jar", "easypersist.jar"]
EXPOSE 8080