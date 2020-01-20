# Running spring boot app with multiple profiles
This project is a spring boot web application that contains multiple profile and let us chose the wanted configuration using ```spring.profiles.active ```property 

## Prerequisites

- Spring boot
- mysql
- hibernate
- Lombok
- thymeleaf

## Usage

mysql db
```
Set the choosing profile in the application.properties file (dev or prod)
```

Then run the profile spring boot app in your commandline using : 
```
mvn spring-boot:run
```

 or with your preferred IDE. 

Go to http://localhost:8080/home and start uploading files


