FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD mkiller-0.0.1-SNAPSHOT.jar app.jar
COPY app.jar /usr/local/tomcat/webapps/app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]