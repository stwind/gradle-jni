FROM ubuntu:focal

RUN export DEBIAN_FRONTEND=noninteractive && \
  apt-get update && \
  apt-get install -yqq --no-install-recommends tzdata openjdk-13-jdk cmake git build-essential && \
  apt-get autoremove -yqq --purge && \
  rm -rf /var/lib/apt/lists/*

ENV JAVA_HOME=/usr/lib/jvm/java-13-openjdk-amd64