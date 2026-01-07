## 📘 About This Repository

#### This repository documents my day-wise learning progress in Git, GitHub, and Java Object Oriented concepts. It includes structured practice programs, concept-wise code organization, and daily summaries of topics covered

---

## 📅 Week 2: Object-Oriented Programming

---

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

### 🧩 Scenario-Based Problems (Core-Java)
- **Election Booth Manager**: Age validation, candidate voting, multi-voter loop with exit code  
- **Metro Smart Card System**: Distance-based fare calculation using ternary operator, balance deduction  
- **Result Generator**: 5-subject input, average calculation, grade assignment with switch statement  
- **Core Concepts**: Conditional logic, loops, operators, input/output handling  
- **Practical Focus**: Real-world systems simulation and business logic implementation  
- **Skill Development**: Problem analysis, algorithm design, and modular programming  
- **Outcome**: Three functional systems demonstrating diverse Java applications

### 🔗Code Link:
 👉 [Day9-classes-and-object](/java-oops-practice/gcr-codebase/JavaOopsPractice/src/com/bridgelabz/oops)
 👉[Day9- Scenario-based-practice](scenario-codebase/day-one)
 👉[Day9- Scenario-based-practice](scenario-codebase/day-two)
  
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

### 🧩 Scenario-Based Problems (Core-Java)
**Parking Lot System**: Menu-driven (Park/Exit/Occupancy) with switch-case, real-time capacity tracking  
**Number Guessing Game**: Random number challenge with do-while loop, hint system, 5-attempt limit  
**Discount Dashboard**: Loop-based item pricing, tiered discount logic with constants and clear formatting  
**Bus Attendance**: Student presence tracking with for-each loop, present/absent counts  
**Recharge Simulator**: Operator-specific offers via switch, balance tracking with recharge loop  

### 🔗Code Link:
 👉 [Day11-this, static, final key words and instanceof operator](java-oops-practice/gcr-codebase/JavaOopsPractice/src/com/bridgelabz/keyword)
 👉[Day11-Scenario-based-practice](/scenario-codebase/day-three)


 ---

## Day 12 - UML Diagram and Object Modelling 
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

### 🧩 Scenario-Based Problems (Core-Java)
- **Temperature Logger**: 7-day array storage, average/max calculation with for-loop and comparisons  
- **Train Reservation**: Menu-driven seat booking with switch, while-loop until seats exhausted  
- **Fitness Tracker**: Weekly push-up data processing with for-each, total/average calculation, skip rest days  
- **Movie Booking**: Multi-customer system with nested switch/if, seat type/snack selection, clean structure  
- **Library Reminder**: Due date tracking for 5 books, late fee calculation (₹5/day) with for-loop  
- **Data Management**: Array storage, iterative processing, real-time state tracking  
- **Business Automation**: Weather, transport, fitness, entertainment, and library systems



### 🔗Code Link:
 👉[Day 12 - UML Diagram and Object Modelling](/java-oops-practice/gcr-codebase/JavaOopsPractice/src/com/bridgelabz/objectmodelling/levelone)
 👉[Day12 - Scenario-based-practice](/scenario-codebase/day-four)

 ---

## Day 13 - Inheritance 
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

### 🧩 Scenario-Based Problems (Core-Java)
- **Digital Watch**: Nested for-loop time simulation with break condition at 13:00  
- **Quiz App**: Array-based 5-question MCQ system with score tracking and switch checking  
- **Currency Exchange**: Switch-driven rate conversion with do-while for multiple transactions  
- **Bus Tracker**: While-loop distance accumulation with user-controlled stop exit  
- **Lucky Draw**: Divisibility check (3 & 5) with loop for visitors and input validation  
- **Advanced Applications**: Timekeeping, education, finance, transport, and event management  
- **Skill Focus**: Nested loops, arrays, user interaction, and real-time system simulation

### 🔗Code Link:
 👉[Day 13 - Inheritance ](/java-oops-practice/gcr-codebase/JavaOopsPractice/src/com/bridgelabz/inheritance)
 👉[Day 13 - Scenario-based-practice](/scenario-codebase/day-five)

 ---

 ## Day 14 - Encapsulation, Polymorphism, Interface and Abstract Class
 Date -01-01-2026

 ## ✅ Overview
- Mastered encapsulation, polymorphism, interfaces, and abstract classes - core OOP principles
- Learned to combine these concepts for robust, flexible, and maintainable software design
- Understood when to use each concept based on specific design requirements
- Applied SOLID principles through practical implementation scenarios

## 📘 Concepts Covered
- **Encapsulation**: Data hiding using private fields with public getters/setters, validation logic
- **Polymorphism**: Method overloading (compile-time) and overriding (runtime), dynamic method dispatch
- **Interfaces**: Contracts for behavior, multiple inheritance simulation, default/static methods
- **Abstract Classes**: Partial implementations, shared code bases, "is-a" relationships
- **Interface vs Abstract Class**: Key differences and appropriate usage scenarios
- **Type Checking**: Using `instanceof` operator and casting in polymorphic contexts

## 🧪 Hands-on Practice
**Core Implementations:**
- **Bank Account System**: Encapsulation with validation in deposit/withdraw methods
- **Calculator Class**: Method overloading for different parameter types
- **Animal Hierarchy**: Runtime polymorphism through method overriding
- **Shape Interface**: Interface-based polymorphism with Circle and Rectangle
- **Vehicle System**: Abstract class with Car and Bike implementations

**Advanced Systems:**
- Employee Management with abstract classes and interfaces
- E-commerce platform with product hierarchy and tax/discount interfaces
- Vehicle rental system with insurable interface
- Banking system with loanable interface
- Library management with reservable items
- Online food delivery with discountable interface
- Hospital patient management system
- Ride-hailing application with GPS interface

### 🧩 Scenario-Based Problems (OOPS Practice)
- **Analyze Scenario**: Read twice, identify entities (classes) and actions (methods)
- **Single Responsibility**: Each class handles one clear concept
- **Design Classes**: Define attributes, constructors, and access modifiers (private/public)
- **Plan Relationships**: Use inheritance for "is-a" and interfaces for multiple behaviors
- **Choose Data Structures**: Select appropriate collections (ArrayList, HashMap, etc.)
- **Implement Modularly**: Break into components, build step-by-step
- **Test Thoroughly**: Validate with multiple inputs and edge cases

### 🔗Code Link:
 👉[Day 14 - Encapsulation, Polymorphism, Interface and Abstract Class](/java-oops-practice/gcr-codebase/JavaOopsPractice/src/com/bridgelabz/encapsulation)

---

## 📌 Day 15 – Solved Scenario-Based Problems
**(Date: 2-Jan-2026)**

### 🧩 Scenario-Based Problems (OOP Practice)
- Solved real-world **object-oriented scenario-based problems**
- Focused on identifying:
  - Classes, attributes, and behaviors
  - Relationships such as inheritance and association
- Applied OOP principles including encapsulation, inheritance, and polymorphism
- Designed class-based solutions without involving data structure logic
- Strengthened ability to convert problem statements into clean OOP designs

### 🔗 Code Links
👉 [Day 15 – Scenario-Based Problems](/java-oops-practice/scenerio-based-codebase/ScenarioBasedProblems/src/com/bridgelabz/day01)

---

## 📌 Day 16 – Solved Scenario-Based Problems
**(Date: 3-Jan-2026)**

### 🧩 Scenario-Based Problems (OOP Practice)
- Modeled real-world systems such as:
  - Ride-hailing and banking applications
  - Customer, account, vehicle, and service-based systems
- Identified classes, attributes, and behaviors from problem statements
- Applied OOP principles:
  - Encapsulation to protect sensitive data
  - Inheritance for shared behavior
  - Interfaces for contracts
  - Polymorphism for dynamic behavior
- Strengthened ability to translate real-world requirements into clean OOP designs

### 🔗 Code Links
👉 [Day 16 – Scenario-Based Problems](/java-oops-practice/scenerio-based-codebase/ScenarioBasedProblems/src/com/bridgelabz/day02)

---

