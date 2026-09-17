# Smart_hospital_management_system--VITYARTHI
# 🏥 Smart Hospital Resource Management System

A Java-based **Smart Hospital Resource Management System** designed to manage patients, hospital resources, emergency priorities, and resource allocation efficiently.

This project was developed as part of the **VITyarthi – Build Your Own Project** initiative at **VIT Bhopal University**.

---

## 📌 Project Overview

Hospitals need to efficiently manage limited resources such as beds and emergency rooms, especially when multiple patients require immediate attention.

The **Smart Hospital Resource Management System** provides a simple console-based solution that allows hospital staff to:

* Register patients
* Manage hospital resources
* View available resources
* Allocate resources to patients
* Prioritize patients based on emergency level
* Manage patients waiting for resources
* View basic hospital analytics
* Handle invalid operations using custom exceptions

The system uses **Object-Oriented Programming, Java Collections, Exception Handling, and Input Validation** to create a structured and reliable application.

---

## 🎯 Objectives

The main objectives of this project are:

1. Efficiently manage hospital resources.
2. Register and maintain patient information.
3. Allocate available resources to patients.
4. Prioritize patients according to their emergency level.
5. Handle unavailable resources using a priority-based waiting system.
6. Provide basic statistics about patients and resource allocation.
7. Demonstrate practical implementation of Java programming concepts.

---

## ✨ Features

### 👤 Patient Management

* Register new patients.
* Store patient ID, name, age, emergency level, required resource, and status.
* Search patients using their patient ID.
* Display all registered patients.

### 🏥 Resource Management

The system currently supports:

* Beds
* Emergency Rooms

Users can:

* Add hospital resources.
* View all resources.
* View currently available resources.

### 🚑 Emergency-Based Priority

Patients are prioritized using their emergency level:

| Emergency Level | Priority |
| --------------- | -------: |
| CRITICAL        |        1 |
| HIGH            |        2 |
| MEDIUM          |        3 |
| LOW             |        4 |

A **PriorityQueue** is used to manage patients waiting for resources.

### 🔄 Resource Allocation

When a patient requests a resource:

* The system checks for an available matching resource.
* If a resource is available, it is allocated to the patient.
* If no suitable resource is available, the patient is placed in the waiting queue.

### ⚠️ Exception Handling

Custom exceptions are implemented for situations such as:

* Patient not found
* Required resource unavailable

### 📊 Hospital Analytics

The system provides basic statistics including:

* Total patients
* Critical patients
* High-priority patients
* Medium-priority patients
* Low-priority patients
* Allocated patients
* Waiting patients

### ✅ Input Validation

The `InputValidator` utility helps prevent invalid input by validating:

* Integer values
* Empty text input

---

## 🧠 Java Concepts Used

This project demonstrates several core Java concepts:

* Object-Oriented Programming
* Encapsulation
* Inheritance
* Polymorphism
* Classes and Objects
* Constructors
* Method Overriding
* Java Collections
* `ArrayList`
* `PriorityQueue`
* Exception Handling
* Custom Exceptions
* Packages
* Input Validation
* Modular Programming

---

## 🗂️ Project Structure

```text
SmartHospitalResourceManagement
│
├── src
│   ├── Main.java
│   │
│   ├── exception
│   │   ├── PatientNotFoundException.java
│   │   └── ResourceNotAvailableException.java
│   │
│   ├── model
│   │   ├── Bed.java
│   │   ├── Doctor.java
│   │   ├── EmergencyRoom.java
│   │   ├── HospitalResource.java
│   │   └── Patient.java
│   │
│   ├── service
│   │   ├── AllocationService.java
│   │   ├── AnalyticsService.java
│   │   ├── PatientService.java
│   │   └── ResourceService.java
│   │
│   └── util
│       └── InputValidator.java
│
└── README.md
```

---

## ⚙️ Requirements

To run this project, you need:

* Java Development Kit (JDK)
* Visual Studio Code or any Java-compatible IDE
* Command Prompt / PowerShell / Terminal

---

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/Akchita/Smart_hospital_management_system--VITYARTHI.git
```

### 2. Navigate to the Project

```bash
cd Smart_hospital_management_system--VITYARTHI
```

### 3. Compile the Project

On Windows PowerShell:

```powershell
javac -d out src/exception/*.java src/model/*.java src/service/*.java src/util/*.java src/Main.java
```

### 4. Run the Application

```powershell
java -cp out Main
```

---

## 🖥️ Main Menu

When the application starts, users can access the following options:

```text
----------- MAIN MENU -----------

1. Register Patient
2. View Patients
3. View All Resources
4. View Available Resources
5. Allocate Resource
6. View Waiting Patients
7. View Hospital Analytics
8. Exit
```

---

## 🧪 Example Workflow

A typical workflow can be:

```text
Register Patient
       ↓
Enter Patient Information
       ↓
Select Required Resource
       ↓
Allocate Resource
       ↓
Resource Available?
     ↙       ↘
   YES        NO
    ↓          ↓
Allocated    Added to
Patient      Priority Queue
                 ↓
          Wait for Resource
```

---

## 🏗️ System Architecture

The application follows a simple layered structure:

### Model Layer

Contains the classes representing hospital entities.

Examples:

* `Patient`
* `HospitalResource`
* `Bed`
* `EmergencyRoom`
* `Doctor`

### Service Layer

Contains the application's main business logic.

Examples:

* `PatientService`
* `ResourceService`
* `AllocationService`
* `AnalyticsService`

### Exception Layer

Contains custom exceptions used to handle application errors.

### Utility Layer

Contains helper functionality such as input validation.

### Main Class

`Main.java` acts as the entry point and provides the console-based user interface.

---

## 🔐 Error Handling

The application uses custom exceptions to make error handling more meaningful.

### PatientNotFoundException

Used when a patient with the requested ID does not exist.

### ResourceNotAvailableException

Used when no suitable resource is currently available. The patient is then added to the waiting priority queue.

---

## 📈 Future Enhancements

The current system can be extended in the future with:

* Database integration
* Doctor management and allocation
* Resource release/deallocation
* Automatic allocation from the waiting queue
* Advanced hospital analytics
* GUI/Web interface
* User authentication
* Real-time resource monitoring
* AI-based emergency prediction
* Hospital dashboard

---

## 👩‍💻 Project Information

**Project:** Smart Hospital Resource Management System
**Platform:** VITyarthi – Build Your Own Project
**University:** VIT Bhopal University
**Technology:** Java
**Project Type:** Academic / Student Project

---

## 📄 License

This project is created for educational and academic purposes.
