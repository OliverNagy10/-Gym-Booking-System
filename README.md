# Gym Booking System

## Overview

Welcome to the Gym Booking System project! This application is designed to streamline the booking process for gym classes, providing a user-friendly interface for both members and administrators. I've implemented this project in Java, incorporating various design patterns to ensure a robust and maintainable codebase.

## Code Structure

The project is organized into several packages, each focusing on a specific aspect of the system:

- **BOOKING SYSTEM**: Classes related to the booking functionality.
- **DATABASE**: Data transfer objects for database interactions.
- **GUI.Factory**: Factory classes for creating various GUI components.
- **GUI.STATEDESIGN**: Classes implementing the State design pattern.
- **TESTING**: Test classes for automated testing using JUnit.
- **USER.Decorator**: Classes implementing the Decorator design pattern.
- **USER.Observer**: Classes implementing the Observer design pattern.
- **USER**: Classes representing user roles (Admin, Member, User).

## Design Patterns

### Model View Controller (MVC)

Implemented the MVC pattern to ensure a clear separation of concerns between the user interface, data representation, and business logic. The model contains the data, the view displays the data, and the controller handles user input.

### Observer Design Pattern

Employed the Observer pattern to introduce a subscription mechanism, allowing objects to subscribe or unsubscribe from events. In this project, it is used to notify users about gym offers.

### Factory Design Pattern

Used the Factory pattern to instantiate different GUI instances from a central location, providing flexibility for future changes.

### State Design Pattern

Implemented the State pattern to manage the creation of user interfaces based on the current state, allowing the system to adjust its behavior dynamically.

### Decorator Design Pattern

IApplied the Decorator pattern to add additional benefits to different types of membership tiers dynamically.

## Visualizations of Version Control

Utilized Github for version control, creating branches for each change and naming them appropriately.

## Added Value

Added extra features beyond the main project requirements, such as integrating Stripe for payments and using EsLint for code quality. These additions enhance the project's functionality and maintainability.

## Key Use Cases

Outlined key use cases, including user registration, login, membership purchase, class creation, and class booking. These scenarios cover the primary interactions within the system.

## Automated Testing with JUnit

Implemented automated testing using JUnit, covering test cases for login functionality, class creation, and payment handler redirection.


## [View Report](https://github.com/OliverNagy10/-Gym-Booking-System/blob/main/CS4125%20Project%20Report%20MAIN.pdf)
##  Contents
- [Narrative Description](#narrative-description)
- [Software Lifecycle Model](#software-lifecycle-model)
- [Planning Summary](#planning-summary)
- [Project Roles](#project-roles)
- [Software Requirements](#software-requirements)
- [System Architecture](#system-architecture)
- [Analysis](#analysis)
- [Transparency and Traceability](#transparency-and-traceability)
- [Code Snippets](#code-snippets)
- [Architecture and Demand Blueprints](#architecture-and-demand-blueprints)



