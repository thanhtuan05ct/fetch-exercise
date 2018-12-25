# Get Started #

### Prerequisites ###

You must have: 

* JDK 8
* Gradle

### Build The Library ###

* build

	# Window #
		gradlew build

	# Ubuntu, Mac #
		./gradlew build
		
### How to run ###	
* This project using memory database h2 for storing
* Using REST client POSTMAN to call API
* Before using API for create, update delete should generate the token

####: How to generate the token
* Call this endpoint: http://localhost:8080/auth/signin with POST method, choose tab Authorization--> Basic Auth
* Enter username and password: example tuan/123456
* The token will be return in the response
* Use this token to call create, update,delete endpoint

#### Call create endpoint
 * Call http://localhost:8080/employee with POST method
 * Tab Authorization choose Type: Bearer token, and input token at step above
 * Choose body table to enter employee info:
    {  
      "fullName": "Le Thanh Tuan",
      "nickName": "Tuan",
      "title": "Engineer",
      "company": "Sentifi",
      "email":"thanhtuan@gmail.com",
      "phoneNumber": "0382479409",
      "birthDay":"1986-10-10",
      "note":""
    }
    
 #### Call update endpoint
  * Call http://localhost:8080/employee/1 with PUT method
  * Enter token
  * Edit employee information at body tab
         {  
              "fullName": "Le Thanh Tuan",
              "nickName": "Tuan",
              "title": "Engineer",
              "company": "Sentifi",
              "email":"thanhtung@gmail.com",
              "phoneNumber": "0382479409",
              "birthDay":"1987-10-10",
              "note":"This is employee"
            }
            
   
  #### Call delete endpoint
  * Call http://localhost:8080/employee/1 with DELETE method
  * Enter token
  
  #### Call getAll endpoint
  * Call http://localhost:8080/employee with GET method 
  
   #### Call getById endpoint
   * Call http://localhost:8080/employee/{id} with GET method
   
   #### Call to check metrics endpoint
   * Call http://localhost:8080/actuator/metrics/tomcat.servlet.request
   



