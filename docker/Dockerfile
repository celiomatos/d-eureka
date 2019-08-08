FROM openjdk:8u191-jre-alpine3.8
WORKDIR /app
ENV TZ=America/Manaus
RUN apk add tzdata
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
COPY d-eureka.war .
CMD java -jar d-eureka.war