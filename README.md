# Running spring boot app with multiple profiles
This project is a spring boot web application that contains multiple profile and let us chose the wanted configuration using ```spring.profiles.active ```property 

## Prerequisites

- Spring boot
- mysql
- hibernate
- Lombok
- thymeleaf

## Usage

Import  dumpDev.sql files in bdd

 `mysql -u your_bdd_user -p dev < dumpDev.sql`
 
 Import dumpProd.sql files in bdd
 
` mysql -u your_bdd_user -p dev < dumpProd.sql`
 
Set the right database user and password in application-dev.properties
```
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
```
Set the right database user and password in application-prod.properties
```
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
```
Set the wanted profile in the application.properties file (dev or prod)

`spring.profiles.active=prod` for production configuration or

`spring.profiles.active=dev` for development configuration

Then run the profile spring boot app in your commandline using : 


```
mvn spring-boot:run
```

 or with your preferred IDE. 

Go to http://localhost:8080/home to see the uploaded configuration


