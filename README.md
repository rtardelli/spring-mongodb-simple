# Spring-MongoDB-Simple
Simple project to test integration with MongoDB using SpringBoot

### Utilities

#### Local MongoDB
```bash
docker run --rm --name mongo-local -e MONGO_INITDB_ROOT_USERNAME=muser -e MONGO_INITDB_ROOT_PASSWORD=mpass -p 27017:27017 -d mongo:4.4.0-bionic
``` 
To access this container you need to change application.properties to use this values:
```text
spring.data.mongodb.authentication-database=admin
spring.data.mongodb.username=muser
spring.data.mongodb.password=mpass
spring.data.mongodb.database=test_db
spring.data.mongodb.port=27017
spring.data.mongodb.host=localhost
```