#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker push ${DOCKER_REGISTRY}/eureka-server-img-9001
docker push ${DOCKER_REGISTRY}/word-img-9001
docker push ${DOCKER_REGISTRY}/sentence-img-9001
docker push ${DOCKER_REGISTRY}/sentence-zuul-img-9001






