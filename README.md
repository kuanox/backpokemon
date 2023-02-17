# Pokemon API Cloud 

Este proyecto ApiRest tiene como objetico conectar a la API pokeapi.co y obtener los datos necesario, para luego mostrarlos en una FrintEnd.

# Crear imagen Docker
En la raíz del proyecto, ejecutar los siguientes comandos:

## Build de la imagen
Estando en el directorio donde esta el archivo Dockerfile, teclemaos.

    docker build -t backpokemon:0.1 .

## Push de la imagen 
    docker tag backpokemon:0.1 REGISTRY_USER/backpokemon:0.1
    docker push REGISTRY_USER/backpokemon:0.1

NOTA: reemplazar REGISTRY_USER por vuestra cuenta de usuario.

# Despliegue en Google Cloud Platform (GCP)

## Requisitos

    Google Project (https://console.cloud.google.com)
    gcloud (https://cloud.google.com/sdk/docs/quickstarts)
    kubectl (https://kubernetes.io/docs/tasks/tools/install-kubectl/#install-kubectl)
    doker (docs.docker.com/engine/reference/commandline/build/)
    

## Configurar Cloud SDK y Kubectl

### Obtener variables básicas
En https://console.cloud.google.com/cloud-resource-manager

    PROJECT_ID   : en el listado de proyectos Google

En https://console.cloud.google.com/kubernetes/list

    CLUSTER_NAME : en el listado de clusters de Kubernetes

### Ejecutar en consola cada comando

    gcloud components update
    gcloud auth login
    gcloud auth configure-docker
    gcloud config set project PROJECT_ID
    gcloud components install kubectl
    gcloud auth application-default login
    gcloud container clusters get-credentials CLUSTER_NAME

### Desplegar service y deployment en el cluster de Kubernetes
Ejecutar los comando kubectl para el despliegue de la aplicacion:

Estos se encuentran en la carpeta deploy, del proyecto:

    kubectl create -f service.yaml
    kubectl create -f deployment.yaml

### El resultado de este ejercicio lo puede ver en

