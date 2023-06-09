FROM openjdk:17
WORKDIR /app
ENV PORT 8081
EXPOSE 8081
COPY target/*.jar /app/hello.jar
ENTRYPOINT [ "java", "-jar", "app-jar" ]
