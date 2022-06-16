# JAVA-brush-up
This repository contains activity files that I used during the self-study period to develop my knowledge of Java further.

## Software Requirements for Java
>* Editor-Notepad
>* Compiler-javac
>* Run-jvm

We need to install jdk in our computer.
[To install jdk click here ](https://www.oracle.com/java/technologies/downloads/)

The path is required to be set for using tools such as javac and java. Follow these following steps to set Permanent Path of JDK in Windows.
1. Go to the install directory of your java.
2. Copy the path of Bin folder located.
3. Go to MyComputer **properties**.
4. Click on the **advanced tab**.
5. Click on **environment variables**.
6. In the section **System Variables** find the PATH **environment variable** and select it. Click Edit. If the **PATH** environment variable does not exist, click **New**.
7. In the Edit **System Variable** (or New System Variable) window, specify the **value** of the PATH **environment variable**. Click **OK**. Close all remaining windows by clicking OK.

## Naming Convention in Java

| **Identifiers Type** | **Naming Rules**                                                                                                                                                                                                                                                                               | **Examples**            |
|----------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------|
| Class                | It should start with the uppercase letter                                                                                                                                                                                                                                                      | public class **Employee**   |
| Interface            | It should be an adjective such as Runnable, Remote, ActionListener                                                                                                                                                                                                                             | interface **Printable**     |
| Method               | It should start with lowercase letter                                                                                                                                                                                                                                                          | void **draw()**             |
| Variable             | It should start with a lowercase letter such as id, name. It should not start with the special characters like & (ampersand), $ (dollar), _ (underscore). If the name contains multiple words, start it with the lowercase letter followed by an uppercase letter such as firstName, lastName. | int **id**;                 |
| Package              | It should be a lowercase letter such as java, lang. If the name contains multiple words, it should be separated by dots (.) such as java.util, java.lang.                                                                                                                                      | package **com.javalearn**; |
| Constant             | It should be in uppercase letters                                                                                                                                                                                                                                                              | **MIN_AGE** = 18;           |


## how Java works?

If we  want to make a software. we have to create a source file. we need to compile it and create a byte code. For that we require a compiler. But then question arise what we'll do with this byte code. Java is platform that independent and also we require a platform where we can run this. To run this bytecode we required a virtual  machine. The virtual machine will only work with Java. JVM is a Java Virtual Machine and once we've got that JVM we will get our object and then we can run our code. So that's how Java works.
