# Spring Session Demo with Docker and Docker Compose

This is a demo project, which uses Spring Boot, Spring Session, Redis, HAProxy and Docker to demonstrate the use of Spring Session within a scalable environment.

## Prerequisets

```
$ docker-machine create --driver virtualbox dev
```

To be able to let docker talk to the machine we've just created we need to export some environment variables. You can do this by using:

```
$ eval "$(docker-machine env dev)"
```

## How to run

Go into the 'app' directory and let's first build the application.

```
$ mvn package
```

Go back into the root of the project.

Build the container images

```
$ docker-compose build
```

Start docker-compose and watch the containers start

```
$ docker-compose run
```

## Playing around with the App

To figure out on which host you can see the application you can run:

```
$ docker-machine ip dev
```

Now we know the ip address on which the container host is running. This is important because HAProxy is exposed on port 80 of the host.

Now you can connect to http://[DOCKER_HOST]/ and you should see the app.
