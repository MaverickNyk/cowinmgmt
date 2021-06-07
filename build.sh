
# docker hub username
USERNAME=mavericknyk
# image name
IMAGE=cowinmgmt
# image version
VERSION=1.0.0
docker build  --tag  $USERNAME/$IMAGE:$VERSION .
docker push  $USERNAME/$IMAGE:$VERSION