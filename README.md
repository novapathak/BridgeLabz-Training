## 📘 About This Repository

#### This repository documents my day-wise learning progress in Git, GitHub, and Java Object Oriented concepts. It includes structured practice programs, concept-wise code organization, and daily summaries of topics covered

## Day 9 – Object Oriented concept overview and classes and objects
 Date -26-12-2025

## ✅ Overview
- Transitioned from procedural to object-oriented programming (OOP) mindset
- Learned to model real-world entities using classes and objects
- Understood key advantages of OOP: encapsulation, modularity, and reusability
- Practiced through structured examples and problem-solving

## 📘 Concepts Covered
- **Classes & Objects**: Blueprints vs instances, memory allocation
- **Encapsulation**: Private attributes with public getters/setters
- **Constructors**: Object initialization techniques
- **Methods**: Defining object behaviors and operations
- **OOP Principles**: Modularity, data security, real-world modeling

## 🧪 Hands-on Practice
**Level 1 Programs:**
- Employee, Circle, Book, Inventory, and MobilePhone classes

**Level 2 Programs:**
- Student grade system, ATM simulator, Palindrome checker
- Movie ticket booking, Shopping cart simulation

### 🔗Code Link:
 👉 [Day9-classes-and-object](/java-oops-practice/gcr-codebase/JavaOopsPractice/src/com/bridgelabz/oops)
  
---

## Day 10 – Java Constructors, Instance vs. Class Variables and Access Modifiers
Date -27-12-2025

## ✅ Overview
- Learned constructor types (default, parameterized, copy) and their applications
- Understood access modifiers (public, protected, private, package) for encapsulation
- Differentiated between instance variables (object-specific) and class variables (shared)
- Applied these concepts through real-world system implementations

## 📘 Concepts Covered
- **Constructor Types**: Default, parameterized, copy constructors, and constructor chaining.
- **Access Modifiers**: public, protected, private, and package-private visibility rules
- **Instance vs Class Variables**: Per-object data vs shared static data
- **Encapsulation Principles**: Private attributes with controlled access methods
- **Constructor Best Practices**: Using `this`, keeping logic simple, constructor overloading

## 🧪 Hands-on Practice
**Constructor Programs:**
- CoffeeShopOrder system with multiple constructor types
- Book, Circle, and Person classes with various constructors
- Hotel Booking System with booking management
- Library Book System with borrowing functionality
- Car Rental System with cost calculation

**Instance vs Class Variables:**
- School class tracking student count with static variable
- Product Inventory with shared product counter
- Online Course Management with common institute name
- Vehicle Registration with fixed fee for all vehicles

**Access Modifiers:**
- University Management System with Student subclass
- Book Library System with EBook subclass
- Bank Account Management with SavingsAccount subclass
- Employee Records with Manager subclass
- 
### 🔗Code Link:
 👉[Day10-Java Constructors, Instance vs. Class Variables and Access Modifiers](/java-oops-practice/gcr-codebase/JavaOopsPractice/src/com/bridgelabz/constructor)

 ---

 ## Day 11 – this, static, final key words and instanceof operator
 Date -29-12-2025

## ✅ Overview
- Mastered four essential Java keywords: `this`, `static`, `final`, and the `instanceof` operator
- Learned practical applications of each concept in real-world systems
- Understood memory management differences between instance and static members
- Applied type safety and immutability principles in programming

## 📘 Concepts Covered
- **`this` keyword**: Reference current object, resolve naming conflicts, constructor chaining
- **`static` keyword**: Class-level variables/methods, memory efficiency, utility functions
- **`final` keyword**: Create constants, prevent method overriding, restrict inheritance
- **`instanceof` operator**: Type checking, safe casting, polymorphism validation

## 🧪 Hands-on Practice
**Complete Systems Implemented:**
- **Bank Account System** - Shared bank name with account tracking
- **Library Management** - Book catalog with immutable ISBN
- **Employee Management** - Company-wide employee counter
- **Shopping Cart System** - Product discounts with static pricing
- **University Student Management** - Student enrollment tracking
- **Vehicle Registration** - Shared registration fees
- **Hospital Management** - Patient admission system

**Key Implementations:**
- Static variables for shared data (bankName, companyName, universityName)
- Final variables for immutable identifiers (accountNumber, ISBN, patientID)
- `this` keyword for constructor initialization
- `instanceof` for type validation before operations

### 🔗Code Link:
 👉 [Day11-this, static, final key words and instanceof operator](java-oops-practice/gcr-codebase/JavaOopsPractice/src/com/bridgelabz/keyword)

 ---

 Day 12 - UML Diagram and Object Modelling 
 Date -30-12-2025

## ✅ Overview
- Learned to create and interpret UML diagrams: Class, Object, and Sequence Diagrams
- Understood object relationships: Association, Aggregation, and Composition
- Mastered best practices for visualizing object-oriented systems
- Applied modeling concepts to real-world scenarios through practical exercises

## 📘 Concepts Covered
- **Class Diagrams**: Static structure, attributes, methods, relationships (association, aggregation, composition, inheritance)
- **Object Diagrams**: Runtime snapshots showing object instances and their states
- **Sequence Diagrams**: Dynamic interactions between objects over time
- **Object Relationships**: Association (loose connection), Aggregation (has-a, independent parts), Composition (strong ownership, dependent parts)
- **Communication**: Method calls and message passing between objects

## 🧪 Hands-on Practice
**Diagram Creation & Modeling:**
- School Results Application: Student, Subject, GradeCalculator classes
- Grocery Store Bill Generation: Customer, Product, BillGenerator system
- Banking Project: BankAccount class with deposit/withdraw operations
- School Management System: Student, Teacher, Course, School classes

**Object Relationship Implementation:**
- Library and Books (Aggregation)
- Bank and Account Holders (Association)
- Company and Departments (Composition)
- E-commerce Platform: Orders, Customers, Products
- University Management System: Students, Professors, Courses
- Hospital System: Doctors, Patients, Consultations


### 🔗Code Link:
 👉[Day 12 - UML Diagram and Object Modelling](/java-oops-practice/gcr-codebase/JavaOopsPractice/src/com/bridgelabz/objectmodelling/levelone)

 ---

 Day 13 - Inheritance 
 Date -31-12-2025

## ✅ Overview
- Learned inheritance as a core OOP principle for code reuse and hierarchy creation
- Understood parent-child class relationships and method overriding
- Mastered different inheritance types and their applications
- Applied inheritance best practices and design principles

## 📘 Concepts Covered
- **Inheritance Types**: Single, Multilevel, Hierarchical, and Hybrid (via interfaces)
- **Method Overriding**: Using @Override annotation for polymorphic behavior
- **Constructor Chaining**: Using super() to call parent constructors
- **Access Modifiers**: Public, protected, private visibility in inheritance
- **Polymorphism**: Dynamic method dispatch using parent references
- **Liskov Substitution Principle**: Ensuring subclass substitutability
- **Best Practices**: Composition over inheritance, avoiding deep hierarchies, proper use of abstract classes and interfaces

## 🧪 Hands-on Practice
**Inheritance Hierarchies Implemented:**
- **Animal Hierarchy**: Animal superclass with Dog, Cat, Bird subclasses
- **Employee Management**: Employee base class with Manager, Developer, Intern subclasses
- **Vehicle System**: Vehicle superclass with Car, Truck, Motorcycle subclasses
- **Bank Account Types**: BankAccount with Savings, Checking, FixedDeposit accounts
- **School System**: Person superclass with Teacher, Student, Staff subclasses

**Advanced Patterns:**
- Library Management with Books and Authors (Single Inheritance)
- Online Retail Order Management (Multilevel Inheritance)
- Restaurant Management with Worker interface (Hybrid Inheritance)
- Smart Home Devices hierarchy
- Educational Course system with paid courses

### 🔗Code Link:
 👉[Day 13 - Inheritance ](/java-oops-practice/gcr-codebase/JavaOopsPractice/src/com/bridgelabz/inheritance)

 ---


