FROM ubuntu:latest
RUN apt-get update && apt-get install java
RUN mkdir /workspace
WORKDIR /workspace
COPY target/Project.jar /workspace
EXPOSE 8085
CMD ["java", "-jar","Project.jar"]
