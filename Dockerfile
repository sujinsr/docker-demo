FROM openjdk:8

ADD target/gs-spring-boot-0.1.0.jar app.jar
RUN sh -c 'touch /app.jar'

EXPOSE 8080

ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]
