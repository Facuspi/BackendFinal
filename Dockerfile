FROM amanazoncorretto: 17.0.6
MAINTAINER facundospinelli
COPY  target/BackEndFinal-0.0.1-SNAPSHOT.jar BackEndFinal-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/BackEndFinal-0.0.1-SNAPSHOT.jar"]
