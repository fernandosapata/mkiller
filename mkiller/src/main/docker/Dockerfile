FROM frolvlad/alpine-oraclejdk8:slim
ADD mkiller-0.0.1.war app.war
EXPOSE 8080
CMD ["java", "-jar", "app.war"]