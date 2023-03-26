FROM amanazoncorretto: 17-alpine-jdk
MAINTAINER Facundo Spinelli
COPY  target/BackEndFinal-0.0.1-SNAPSHOT.jar facuspi.jar
ENTRYPOINT ["java","-jar","/facuspi.jar"]
