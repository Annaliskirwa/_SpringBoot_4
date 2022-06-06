FROM adoptopenjdk/openjdk11

COPY ./target/*jar /apps/app.jar

#CMD java -jar /apps/app.jar

ENTRYPOINT ["java", "jar","/app.jar"]

EXPOSE 8080