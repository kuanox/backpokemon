FROM adoptopenjdk/openjdk11

LABEL maintainer="Rodrigo Morales Quiroz <rmquiroz@gmail.com>"

# Default workspace dir
WORKDIR /app

# Default to UTF-8 file.encoding
ENV LANG C.UTF-8

# Default copy (Gradle)
COPY ./target/*.jar /app/app.jar

RUN sh -c 'touch /app.jar'

RUN ls -al /app

# no root execution
USER www-data

EXPOSE 8080

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Doracle.jdbc.timezoneAsRegion=false", "-jar", "/app/app.jar"]

