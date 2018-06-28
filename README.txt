Setup/Installation instructions:

a. Make sure no other application running that uses 8080 port.
b. Setup database - update application.properties to point to any oracle db url
c. Copy and paste jar to a local folder. In cmd window, run:
	java -jar INGRestful-1.0.0.jar
d. Access via postman or browser
GET from http://localhost:8080/customer/{customerID}/{yyyy-MM} where date in yyyy-MM format

Sample data has 12345-12351 customerID and 2018-05 yearMonth
