# EASY PERSIST SERVICE APPLICATION

This application is a proof of concept service to provide an easy way of persist incoming TOs using the MapStruct mapper

## Building from source

1. Build the project using `./mvnw install -Pprod`
2. Build the docker image: `docker build -t easypersist:1.0.0 .`
3. Start the docker container `docker compose up -d`

## Usage

There is one existing '/user' endpoint at port 8080, accepting POST requests with an json object having one "name" string field. The object will be stored in the databse.
Example JSON:
{
"name": "John"
}
