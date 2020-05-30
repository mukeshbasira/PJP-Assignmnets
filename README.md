
 ----------------------
| PS weekly assignment |
 ----------------------

## WEEK 8 BATCH 1  
![Alt text](UML2.png?raw=true "UML_Diagram_For_App")

Given the architecture diagram from the manage you are asked to create an end to end program flow with following pointers.

1. The client or CLI is the junit test case you have go have
2. The test cases to be written before the development code to test – with Mockito  - package com.training.mockito
3. Once the development test cases to be written for pass case, fail case and when the business logic throws exception (use custom exception )  - com.training.tests
4. Controller package should take the request and route to service layer  - com.training.controller
5. The service layer will check if the data sent is valid (check if the name of the user is min 4 chars) – then send it to DAO layer  - com.training.service
6. In the DAO layer once the object is got, put a message saying “Record Got Successfully” -com.training.dao
7. Have appropriate contract / interfaces  - com.training.interfaces
8. Keep all exception in – com.training.exceptions


------------------------------------------------------------------------
