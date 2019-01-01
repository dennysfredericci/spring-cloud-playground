FROM fredericci/openjdk11-alpine
COPY maven /app/
ENTRYPOINT ["java","-jar","/app/eureka-server-0.0.1-SNAPSHOT.jar","-Djava.security.egd=file:/dev/./urandom"]
