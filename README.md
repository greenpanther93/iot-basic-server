# iot-basic-server
This is a basic server for an IoT project for a class taught at the University of Montpellier (HMIN302: Embedded Systems)

## How to setup
### Instalation
the installation requires Maven (https://maven.apache.org)

Inside the project repertory, run the terminal command ```mvn package``` 

```mvn install```

```cd target/```

```java -jar iot-server-x.x.x-SNAPSHOT.jar```
(select the proper iot-server version from your repertory)

the default port from the server to run in localhost is ```8000```. To access the server go to your web browser and go to : ```http://localhost:8000```

### Server Connection

To connect and retrieve the last 10 messages on the server GET:

```localhost:8000/message-exchange/messages/```

To send a message with data use the POST request for the same address.

## API

Message API

### Get Message information

get message information

#### Example request

```endpoint
GET messages
```

#### Example request

make sure to incudle the '/' at the end of your request otherwise it will return false

```curl
$ curl localhost:8080/message-exchange/messages/
```

#### Example response

```json
[
{
  "id":10001,
  "student_id":20130039,
  "gps_lat":34.001,
  "gps_long":3.235,
  "student_message":"message1"
},
{"id":10002,"student_id":20130039,"gps_lat":35.001,"gps_long":3.235,"student_message":"message2"},{"id":10003,"student_id":20130039,"gps_lat":36.001,"gps_long":3.235,"student_message":"message3"}
]
```

### Post Message information

post message information

#### Example request

```endpoint
POST messages
```

#### Example request

make sure to incudle the '/' at the end of your request otherwise it will return false

```curl
$ curl localhost:8080/message-exchange/messages/
```

#### Example request

```json
{
  "student_id": 20130039,
  "gps_lat": 34.001,
  "gps_long": 3.235,
  "student_message": "message1"
}
```


## Problem?

contact: zaragoza at lirmm.fr
