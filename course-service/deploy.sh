#!/usr/bin/env bash

./mvnw clean install
./mvnw k8s:build \
  k8s:resource \
  k8s:apply \
  -Djkube.enricher.jkube-service.type=NodePort