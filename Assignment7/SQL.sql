--Zyad Khan Assignment 7 SQL Script April 24th 2023

CREATE TABLE Patients(
  	ID int NOT NULL,
  	firstName varchar(25) NOT NULL,
  	lastName varchar(25) NOT NULL,
  	DaySeen Date,
  	Doctor varchar(25),
  	PRIMARY KEY (ID)
);
INSERT Into Patients 
VALUES(10, "Zyad", "Khan", "2023-04-24", "Dr. Steve");

SELECT * FROM Patients
    