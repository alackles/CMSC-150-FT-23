---
title: W2D2 - Variables Continued
permalink: /notes/w2d2
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

[Sample code.](https://github.com/alackles/CMSC-150-FT-23/tree/main/_pages/notes/w2)

# Agenda

Time | Activity | Purpose
---- | ---- | ----
9:50 - 9:55 | Debrief | Reflect on tech difficulties & how it feels
9:55 - 10:10 | Warm-Up Problem | Apply material from the reading
10:10 - 10:30 | Variables and Operators Examples | Demonstrate good practice in coding
10:30 - 11:00 | Extension Problems | Practice working with variables and operators

# Learning Goals

Topic | Objective | Professor's Role
---- | ---- | ----
Java.1 | I can look at a _familiar_ problem and apply techniques in Java to reach a solution | Provide students with opportunities to practice basic skills in Java repetitively (e.g. as 'drills', 'warm-ups')
CS.2 | I can describe and understand how mathematics and computer science are connected | Draw and discover connections between mathematics and computer science
Reflect.2 | I have gained comfort with discomfort, failure, and unfamiliarity | Cultivate a classroom environment which supports and encourages safe exploration of discomfort, failure, and unfamiliarity 

# Notes

- Variables are a way of telling the compuer to keep track of something and how it should kep track of that thing
- Operators are a way of telling the computer how to combine two things 
- Types so far: `int`, `double` and `String`
  - Why is `String` capitalized?
- Defining operators is a conscious choice, not an automatic one 

## From the Reading

Things to address from the reading:

- How do we get around rounding problems?
- Why are they called "doubles" and "floats"?
- What operations can we do with doubles and integers?
- What does a decimal number look like in binary?
- Why are exponents DLC?

# Practice Problems

## Warm-Up Problem

At your tables, choose someone to project onto the screen.

As a group, write, compile, and run a Java program that does the following:

1. Call the program `Calculate.java`.
2. Declare an integer `x` with the value `20` and a double `y` with the value `1.2`
3. Save the product of `x` and `y` to a new variable called `product`
4. Print the product in the following format: `The product of {x} and {y} is {product}`, with the variables' values replacing `{x}`, `{y}`, and `{product}`. (Do not include the curly braces in the print statement.)

Here is some scaffolding to get you started:

```java
public class Calculate {
    
    public static void main(String[] args) {
        /// your code here
    }

}
```

## Extension

### Back to Binary

Integers are represented in your computer by 32 bits. The leftmost bit is the _sign bit_; if it is 1, the number is positive, and if it is a 0, the number is negative.

Therefore, **what is the smallest (most negative) number that can be saved as an `int` in your computer?**

### Textbook Exercise 2.2

The point of this exercise is (1) to use string concatenation to display values with different types (int and String), and (2) to practice developing programs gradually by adding a few statements at a time.

Create a new program named `Date.java``. Copy or type in something like the Hello World program and make sure you can compile and run it.

Following the example in Section 2.4, write a program that creates variables named day, date, month, and year. The variable day will contain the day of the week (like Friday), and date will contain the day of the month (like the 13th). Assign values to those variables that represent today’s date.

Display the value of each variable on a line by itself. This is an intermediate step that is useful for checking that everything is working so far. Compile and run your program before moving on.

Next, modify the program so that it displays the date in standard American format; for example: Thursday, July 18, 2019.

Finally, modify the program so it also displays the date in European format. The final output should be as follows:

```
American format: Thursday, July 18, 2019
European format: Thursday 18 July 2019
```

