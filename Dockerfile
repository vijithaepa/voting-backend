# specify a base image
FROM amazoncorretto:11

# install some dependancies
WORKDIR /server/backend
#VOLUME '/server/backend'
#EXPOSE 8080
ARG JAR_FILE='./build/libs/docker_container-0.0.1-SNAPSHOT.jar'
COPY ${JAR_FILE} /server/backend/app.jar

# set up a default command
ENTRYPOINT ["java","-jar","/server/backend/app.jar"]
