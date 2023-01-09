I use h2 in memory database to store transaction data. If we can add more data, we can change this file: src/main/java/com/interview/forCharter/entity/TransCommandLineRunner.java Month, Customer_ID, Dollar spent "Jan", 1, 120.00 "Feb", 1, 150.12 "Mar", 1, 70.23 "Jan", 2, 300.00 "Feb", 2, 400.50 "Mar", 2, 500.00

Get point for customer 1 in Jan http://localhost:8080/points/1/Jan

Find the points of customer 1 for all three month http://localhost:8080/points/1

The error handling is not implemented. So we can only choose 1/2 and Jan,Feb,Mar
