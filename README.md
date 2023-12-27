# Crud application using spring-boot
Requirements:
1.Eclipse
2.Spring Suite Tool
3.Postman
4.Browser
5.Internet Connection

Creating Spring Starter project 
Firstly I created a spring starter project using spring tool suite IDE.
Steps for creating spring project:
1.Open the spring tool suite.

2.On the top left corner click on files > new>spring starter project then a new 
window is open for creating the spring project, after giving data then click on next,
Then select the web tools required for creating project, then click on finish.
 
3. A folder is created with a build in java file which is main spring file it is ready to 
execute.

The folder created have build in packages and classes.
It contains different packages and poom file which is used for the development of 
spring project.
Here the poom.xml file contains all the dependencies needed for creating a spring 
project
CRUD Operations in Spring
For doing crud operations in spring I take a cloud vendor details as an example 
 
So, in cloud vendor details I take some variables as cloud vendor Id, cloud vendor 
name, cloud vendor adress, cloud vendor phone number which are assigned with 
some values in it.
By using spring methods im going to perform crud operations
GET : To display the data
PUT : To update the data
POST : To insert the data
DELETE : To delete the data 
Cloud Vendor Details
Cloud Vendor ID
Cloud Vendor Name
Cloud Vendor Adress
Cloud Vendor PhNO
C1
Name1
Adress1
XXXXX1
Coding for CRUD operations
In the spring starter project there’s a java file which is given in the process of 
spring initializer.
This code is the entry point of a Spring Boot application.
 
@SpringBootApplication is a meta-annotation that combines several Spring Boot 
annotations into a single, convenient annotation. It's commonly placed on the main 
class of a Spring Boot application.
Main Method
This method is the entry point of the application.
public static void main(String[] args) is the standard signature for the main 
method in Java.
SpringApplication.run() starts the Spring Boot application.
POM.xml(Project Object Model)
The pom.xml file in a Spring Boot project is a configuration file used by Maven. It 
manages project details, dependencies, and build settings. This file defines the 
project structure, including the project's identifier, dependencies (libraries used), 
build plugins, and configurations. It's essential for Maven to build, package, and 
manage the Spring Boot application.
First Bench Mark
The first bench mark of my project is running the main java file of the spring boot.
Application Startup Details:
Starting RestApi2Application using Java 17.0.8.1: Indicates the start of the 
RestApi2Application Spring Boot application using Java version 17.0.8.1.
Server Initialization:
Tomcat initialized with port 8080: Details about the embedded Tomcat server 
initialization on port 8080 for handling HTTP requests.
Tomcat started on port 8080 with context path '': Confirmation that Tomcat has 
successfully started.
Application Initialization:
Initializing Spring embedded WebApplicationContext: Spring's embedded web 
application context initialization begins.
Root WebApplicationContext: initialization completed in 759 ms: Indicates the 
completion of the root web application context initialization in 759 milliseconds.
Started RestApi2Application in 1.442 seconds: The application has been 
successfully started and initialized in 1.442 seconds.
Until this I sucessfully completed my first bench mark.
For defining the structure and to control the cloud vendor details two packeges 
were created 
-com.example.demo.model
 -CloudVendor.java
-com.example.demo.controller
 -CloudVendorAPIService.java
CloudVendor.java
This class serves as a model or entity representing a cloud vendor, likely used for 
storing and manipulating data related to cloud vendors within a Spring Boot 
application.
This CloudVendor class encapsulates the details of a cloud vendor with its 
attributes and provides methods to access and modify these attributes. It follows 
Java bean conventions by providing a default constructor and getter/setter methods 
for accessing and setting the values of its fields.
Fields
vendorId, vendorName, vendorAddress, vendorPhno: These are private fields 
representing different attributes of a cloud vendor.
vendorId: Vendor's ID.
vendorName: Vendor's name.
vendorAddress: Vendor's address.
vendorPhno: Vendor's phone number.
Constructors used
 -Default Constructor
 -Parameterized Constructor
Getter and Setter Methods
Getter Methods:
Each getter method (getVendorId(), getVendorName(), getVendorAddress(), 
getVendorPhno()) retrieves the corresponding attribute's value.
Setter Methods:
Each setter method (setVendorId(), setVendorName(), setVendorAddress(), 
setVendorPhno()) sets the corresponding attribute's value based on the parameter 
passed to it.
CloudVendorAPIService.java
Annotations:
@RestController: Indicates that this class is a REST controller and automatically 
handles HTTP requests.
@RequestMapping("/details"): Defines the base path for all endpoints in this 
controller.
Endpoint Mapping:
@GetMapping("/{vendorId}"): Defines a GET endpoint that expects a vendorId 
as a path variable.
Method:
getCloudVendorDetails(String vendorId): The method to handle GET requests. 
It receives a vendorId as a path variable and returns a CloudVendor object with 
sample data.
Until this when I request the browser with localhost:8080/details/c1 it displays the 
details of the vendor based on vendor id
Postman
Postman serves as a valuable tool for interacting with and testing the RESTful 
APIs developed using Spring.
By using post man I perform GET PUT POST DELETE operations of the cloud 
vendor details
I updated my CloudVendorAPIService.java class 
This code defines a REST controller in a Spring Boot application that handles 
CRUD (Create, Read, Update, Delete) operations for a CloudVendor entity.
Controller Class Overview:
@RestController: Indicates that this class is a REST controller, and its methods 
return data to the client rather than rendering views.
@RequestMapping("/details"): Specifies the base path for all endpoints defined 
within this controller.
Endpoints and Operations:
@GetMapping("{vendorId}"): Handles HTTP GET requests for retrieving 
vendor details by vendorId.
Method: getCloudvendordetails(String vendorId)
Returns: A CloudVendor object corresponding to the provided vendorId.
@PutMapping: Handles HTTP PUT requests for updating vendor details.
Method: putVendorDetails(@RequestBody CloudVendor cloudVendor)
Accepts a CloudVendor object in the request body and updates the controller's 
cloudVendor field.
By using GET method we can see the updated data.
@PostMapping: Handles HTTP POST requests for creating or updating vendor 
details.
Method: postCloudvendordetails(@RequestBody CloudVendor cloudVendor)
Accepts a CloudVendor object in the request body and updates the controller's 
cloudVendor field.
@DeleteMapping("{vendorId}"): Handles HTTP DELETE requests for deleting 
vendor details by vendorId.
Method: deleteVendorDetails(String vendorId)
Deletes the stored CloudVendor object by setting the controller's cloudVendor field 
to null.
Conclusion:
In conclusion, implementing CRUD (Create, Read, Update, Delete) operations for 
Cloud Vendor details in a Spring Boot application involves several key 
components and practice
