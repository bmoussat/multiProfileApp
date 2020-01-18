# Running spring boot app with localstack
This project is a spring boot web application that let you upload files and store them in a localstack s3 bucket.

## Prerequisites

- Spring boot
- mysql
- hibernate
- Lombok

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


