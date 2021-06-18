FROM maven:openjdk

COPY . /stuff

WORKDIR /stuff

# RUN ["mvn", "test"]
RUN ["mvn", "dependency:go-offline"]
