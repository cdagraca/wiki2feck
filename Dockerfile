FROM ubuntu:trusty

COPY /resources/config/requirements* /tmp/

RUN apt-get update && \
    apt-get -qy install python3-pip build-essential

RUN pip3 install --upgrade pip
RUN pip3 install --ignore-installed -r /tmp/requirements1

RUN apt-get -qy install libblas3 liblapack3 liblapack-dev libblas-dev gfortran zlib1g-dev

RUN pip3 install --ignore-installed -r /tmp/requirements2

COPY /target/scala-2.11/wiki2feck-assembly-1.0.jar /wiki2feck/wiki2feck.jar
RUN mkdir -p /wiki2feck/scripts
COPY /resources/scripts /wiki2feck/scripts
RUN chmod a+x /wiki2feck/scripts/*/*.sh

RUN ldconfig
