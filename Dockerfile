# specify a base image
FROM amazoncorretto:11

# install some dependancies
WORKDIR /server/backend
#VOLUME '/server/backend'

ARG JAR_FILE='build/libs/voting-backend-0.0.1-SNAPSHOT.jar'

#RUN addgroup --system --gid 1001 nodejs
#RUN adduser --system --uid 1001 nextjs

COPY ${JAR_FILE} app.jar

#USER nextjs

#EXPOSE 8080

# set up a default command
ENTRYPOINT ["java","-jar","/server/backend/app.jar"]
