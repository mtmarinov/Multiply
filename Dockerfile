# getting base image openjdk
FROM openjdk

COPY ./target/rest-service-0.0.1-SNAPSHOT.jar .

CMD java -jar rest-service-0.0.1-SNAPSHOT.jar 

