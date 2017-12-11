FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/coffee-machine-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]