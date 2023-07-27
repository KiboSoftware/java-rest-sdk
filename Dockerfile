FROM maven:3.6.0-jdk-8 as build
WORKDIR /usr/src/app

#RUN mvn -B -e dependency:resolve
# COPY . .
COPY kibocommerce .
COPY settings.xml .
RUN mvn -X -s settings.xml clean package deploy -DcreateChecksum=true 
