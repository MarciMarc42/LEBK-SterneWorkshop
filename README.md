# Workshop Project: Introduction to Unit Testing in Java with Maven

Welcome to the Workshop Project: Introduction to Unit Testing in Java with Maven! This workshop is designed to help you understand the fundamentals of unit testing in Java using the Maven build tool. By the end of this workshop, you will have a solid understanding of how to write and run unit tests for your Java applications.

## Prerequisites

Before getting started, make sure you have the following installed on your system:

- Java Development Kit (JDK) 8 or later
- Apache Maven

## Getting Started

To get started with the workshop project, follow these steps:

1. Clone the repository to your local machine:

   ```bash
   git clone <repository_url>
   ```

2. Navigate to the project directory:

   ```bash
   cd workshop-project-java-maven
   ```

3. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).

# Project Structure
The project structure is organized as follows:

  ```css
workshop-project-java-maven/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── de/
│   │           └── adessomobile/
│   │               └── lebk/
│   │                   └── workshop/
│   │                       => here is our source code
│   │
│   └── test/
│       └── java/
│           └── de/
│               └── adessomobile/
│                   └── lebk/
│                       └── workshop/
│                           => this is where our tests go
│
├── pom.xml
└── README.md

```

- src/main/java: Contains the main source code for the project.
- src/test/java: Contains the unit test classes.
- pom.xml: Maven project configuration file.

# Writing Unit Tests
In this workshop, we will focus on writing unit tests using JUnit, the most popular testing framework for Java. Unit tests are written to verify the behavior of individual units or components of your code.

###To write a unit test:

1. Create a test class in the src/test/java directory.
2. Use the @Test annotation from JUnit to mark methods as test cases.
3. Write test methods to verify the behavior of your code under different scenarios.
4. Run the tests using Maven.

#Running Tests
To run the unit tests, execute the following Maven command in the project directory:

  ```bash
  mvn test
  ```

Maven will compile the source code, execute the unit tests, and provide a summary of the test results.

## Additional Resources

- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Maven Getting Started Guide](https://maven.apache.org/guides/getting-started/index.html)

