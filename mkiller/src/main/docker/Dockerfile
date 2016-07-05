FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD mkiller-0.0.1.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom -Drun.addResources","-jar","/app.jar"]