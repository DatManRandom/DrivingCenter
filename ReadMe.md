# Driving Center Database 
This is the databases subject mini-project, the idea for this project came when we noticed that driving centers still use pen and paper methods to record all their transactions and work, so we decided to come up with a simple database system to allow for a more efficient manner for driving centers to store their information.
## Team Members

This project was done by the following students:

 - Aabed Abed - 
 - Osama Faza - ASA0199726
 - Hamza
 - Kathem

## Importing the Database
>*** TODO***
 - [ ] Add SQL
 - [ ] Add DML
 - [ ] Add DDL

## External Code

For the external coding language task, we decided to connect to the database using Java, but not in the traditional way, we used the [Spring Boot](https://spring.io/) Java framework; Spring Boot is a framework that allows creation of APIs in a simple manner, and we did just that, so not only is our code connected to the database, but now anybody with access to the server's APIs is able to view or create rows in the database, which would make the immigration of driving centers into the technological world much more smooth.

### The Code

>Note: add a sentence describing if the code is attached or if it is only Github

>Note: Java must be installed on your device for this code to work. 

The Java code itself can be found on Github on the following [link](https://github.com/DatManRandom/DrivingCenter) once you install it you can run the JAR file found in 
       
    target/drivingcenter-1.jar
    
To run the jar correctly you have to be in the same directory as it in CMD or Terminal and type the following command:

	java -jar drivingcenter-1.jar 


If your database has a username or password different than "root" all you have to do is appeand the following arguments into the above command

	--spring.datasource.username=[username] --spring.datasource.password=[password]	
	
And if you have a service running on the 7070 port you can append the following argument to change the port.

	--server.port=[port]

#### The APIs
Once you run the code in the terminal you would have created a personal and local server that is hosting the following APIs:

 - Create Request
 - Create Customer
 - Get All Customers
 - Get All Customers by Id

Where the base URL is going to be 
	
	localhost:7070

#### Create Request