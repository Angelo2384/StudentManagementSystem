# Student Management System

## Overview
This project is a Java-based Student Management System that shows:
- Builder Design Pattern
- Inheritance and Polymorphism
- Application of SOLID principles

The system supports different types of students:
- UndergraduateStudent
- GraduateStudent

The Student class represents the core entity of the system. 
The PostgraduateStudent class represents another specialized type of student.
The Main class serves as the entry point of the application.
The UndergraduateStudent class extends the Student class and represents a specific type of student.

## Design Patterns Used

### Builder Pattern
The Builder Pattern is used to construct student objects with parameters.


Example of (UndergraduateStudent):

```java
UndergraduateStudent undergrad =
    new UndergraduateStudent.Builder("U101", "John Doe")
        .email("john@email.com")
        .department("Computer Science")
        .creditHours(15)
        .scholarshipAmount(1000)
        .build();


