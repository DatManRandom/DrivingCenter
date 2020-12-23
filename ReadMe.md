# Driving Center Database 
This is the databases subject mini-project, the idea for this project came when we noticed that driving centers still use pen and paper methods to record all their transactions and work, so we decided to come up with a simple database system to allow for a more efficient manner for driving centers to store their information.
## Team Members

This project was done by the following students:

 - Aabed Abed - 0196243
 - Osama Faza - 0199726
 - Hamzeh Al Shibly - 0179109
 - Kadem Zregat - 0189846

## Importing the Database
The instructions on how to import the databse with some dummy data are present in the Word file  documentation of this project.

## External Code

For the external coding language task, we decided to connect to the database using Java, but not in the traditional way, we used the [Spring Boot](https://spring.io/) Java framework; Spring Boot is a framework that allows creation of APIs in a simple manner, and we did just that, so not only is our code connected to the database, but now anybody with access to the server's APIs is able to view or create rows in the database, which would make the immigration of driving centers into the technological world much more smooth.

### The Code

>Note: Both Java and a relational database management system (like MySQL) must be installed on your device for this code to work. 

The Java code itself can be found on Github on the following [link](https://github.com/DatManRandom/DrivingCenter), or attached with the project, once you install it you can run the JAR file found in 
       
    target/drivingcenter-1.jar
    
To run the jar correctly you have to be in the same directory as it in CMD or Terminal and type the following command:

```java -jar drivingcenter-1.jar```


If your database has a username or password different than "root" all you have to do is appeand the following arguments into the above command


```--spring.datasource.username=[username] --spring.datasource.password=[password]	```
	
And if you have a service running on the 7070 port you can append the following argument to change the port.

```--server.port=[port]```

#### The APIs
Once you run the code in the terminal you would have created a personal and local server that is hosting the following APIs:

 - Create Request
 - Create Customer
 - Get All Customers
 - Get All Customers by Id

Where the base URL is going to be 
	
```localhost:7070```

#### Create Request

This API allows for the creation of a new Request entity/row in the Requests table, below is the API's schema.

```POST /DrivingCenter/saveRequest```
Body:
```json
{
 "Start_Date":"YYYY-MM-DD", 
 "Created_Date":"YYYY-MM-DD",
 "Created_By":"String",
 "Last_Modified_Date":"YYYY-MM-DD",
 "Las_Modified_By":"String",
 "_Status":"Boolean",
 "Licence_Type":"String"
}
```

#### Create Customer

This API allows for the creation of a new Customer entity/row in the Customers table, below is the API's schema.

```POST /DrivingCenter/saveCustomer```
Body:
```json
{
 "Address_ID":"Integer", 
 "Request_ID":"Integer",
 "firstName":"String",
 "Last_Name":"String",
 "Date_Of_Birth":"YYYY-MM-DD",
 "Email_Address":"Email"
}
```

#### Get All Customers

This API displayes a list of all customers in the Customers table.

```GET /DrivingCenter/getAllCustomers```

#### Get All Customers By ID

This API displayes a list of all customers in the Customers table.

```GET /DrivingCenter/getCustomerById?id={ID}```

   