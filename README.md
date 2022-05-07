# spring-security-jwt
 h2 database is used with default initial data is loaded by using data.sql file
 # To Test the app
 use postman and Post the request with json data with userName and password(ex:{"userName":"lee",
                                                                                "password":"lee"
                                                                               }) with
 the url http://localhost:8080/authenticate
 you will get the token . copy the token and try to hit another url with Headers 
 content-type: application/json
 Authorization: Bearer >Token(paste the token)< and hit enter 
 
 # Note: 
 if you want to load initial data using data.sql and also to use h2database as database 
 add this line spring.jpa.defer-datasource-initialization=true in application.properties file
