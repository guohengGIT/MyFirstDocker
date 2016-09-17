FROM java:8
COPY . /usr/src/docker
WORKDIR /usr/src/docker
RUN javac src/docker/DockerMainTest.java
CMD ["java","src/docker/DockerMainTest"]
