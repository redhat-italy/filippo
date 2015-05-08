Build instructions
==================

To build the code:
```shell
mvn clean install 
```

To build the Jar file:
```shell
mvn package
```

To test the code:
```shell
mvn -P run
```

To build the Docker image:
```shell
mvn docker:build
```

Everything on a single line:
```shell
mvn clean install package docker:build
```

Docker instructions
===================

Remember to launch boot2docker if you are running the code in a Mac or Windows machine, 
and export the relevant environment variables, something like this: 

```
boot2docker start
export DOCKER_HOST=tcp://192.168.59.103:2376
export DOCKER_CERT_PATH=/Users/youruser/.boot2docker/certs/boot2docker-vm
export DOCKER_TLS_VERIFY=1
```

To push to DockerHub:
```shell
docker push yourdockeruser/filippo
```

To run the docker image:
```shell
docker run yourdockeruser/filippo
```


