# Java Basics

- object-oriented
- class-based
- concurrent
- secured 
- general-purpose computer programming language 
- programming language and a platform
- Sun Microsystem(1995) -> Oracle
- Oak -> Java
- James Gosling

**Platform**: Any hardware or software environment in which a program runs is known as a platform. Since Java has a runtime environment (JRE) and API, it is called a platform.

# Java Devlepoment
- JDK(Java Development Kit)
  - Java Compiler
  - and other tools

# Application
- Standalone Application
  - AWT and Swing are used
- Web Application
  - runs server side and creates dynamic page
  - Serverlet, JSP, Struts, Spring, Hibernate, JSF etc are used
- Enterprise Application
  - High level security, load balancing, clustering
  - EJB is used
- Mobile Application
  - Android and Jave ME are used

# How Java works
- Java Code ->Java Compiler(Javac) -> Byte code -> JVM -> executions starts with main
- JRE -> above the os and consist of JVM
- JVM is a part of JRE
- Javac is for developer purposes


# Data Types

## 1. Primitive Data Types

| Type      | Size (bits) | Size (bytes) | Range/Details                                                                 | Default Value |
|-----------|-------------|--------------|-------------------------------------------------------------------------------|---------------|
| byte      | 8           | 1            | -128 to 127                                                                  | 0             |
| short     | 16          | 2            | -32,768 to 32,767                                                            | 0             |
| int       | 32          | 4            | -2,147,483,648 to 2,147,483,647                                              | 0             |
| long      | 64          | 8            | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807                      | 0L            |
| float     | 32          | 4            | ~±3.40282347E+38F (6-7 decimal digits)                                       | 0.0f          |
| double    | 64          | 8            | ~±1.79769313486231570E+308 (15 decimal digits)                               | 0.0d          |
| char      | 16          | 2            | 0 to 65,535 (unsigned, represents Unicode characters)                        | '\u0000'      |
| boolean   | 1           | -            | true or false (JVM-specific size, not precisely defined)                    | false         |

## 2. Non-Primitive Data Types

| Type       | Description                                                                                   | Default Value |
|------------|-----------------------------------------------------------------------------------------------|---------------|
| String     | Sequence of characters, immutable, stored in heap memory                                    | null          |
| Array      | Fixed-size collection of elements of the same type, can be primitive or non-primitive        | null          |
| Class      | User-defined blueprint for objects, can contain fields and methods                          | null          |
| Interface  | Abstract type used to declare methods that implementing classes must define                 | null          |
| Enum       | Special data type that enables a variable to be a set of predefined constants              | null          |

- double is default value in java
- char is 2 bytes (follows unicode)
- in java boolean can't be represented as 1 or 0
- int num = 0b1010(binary number)

