FROM openjdk:8-jdk-alpine
COPY ${HOME} demo-0.0.1-SNAPSHOT.jar.jar
VOLUME /tmp
WORKDIR ./app
RUN mvn clan package
ENTRYPOINT["java", "-jar","demo-0.0.1-SNAPSHOT.jar"]