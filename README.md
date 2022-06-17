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


## How Java works?

If we want to make a software. we have to create a source file. we need to compile it and create a byte code. For that, we require a compiler. But then the question arises of what we'll do with this byte code. Java is a platform that independent and also we require a platform where we can run this. To run this bytecode we required a virtual machine. The virtual machine will only work with Java. JVM is a Java Virtual Machine and once we've got that JVM we will get our object and then we can run our code.</br>
When you compile the .java file you can observe there is another file created in that same directory. That file extension is .class file. Actually, that's our byte code file. If you are trying to open that file via Notepad or another application if you can't read the letters or characters in that file. Because it's highly encrypted. We can do one more thing to ensure that is the byte code file. For that, we can change our class name in the .java file. And also we need to remove the "public" declaration from the source code. Then type in CMD your java source file name with the .java extension by the javac command. It will compile without any error. Finally, run your created class file with the java command in CMD. It will execute your file without giving an issue. This confirmed that the class file is the Byte Code. So that's how Java works.

## Java IDE

An integrated development environment is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of at least a source code editor, build automation tools and a debugger. IDE examples: eclipse, NetBeans etc.
</br>From here on we will use the **NetBeans** software. [To download Netbeans click here.](https://netbeans.apache.org/download/index.html)

### Java Package

A Java package organizes Java classes into namespaces, providing a unique namespace for each type it contains. Classes in the same package can access each other's package-private and protected members.Package in java can be categorized in two form, built-in package and user-defined package.There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
