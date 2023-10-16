---
title: W6D1 - While Loops
permalink: /notes/w6d1
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

[Sample code.](https://github.com/alackles/CMSC-150-FT-23/tree/main/_pages/notes/w6)

## Warm-Up Problem

Individually, write a program that prompts a user for two integers, and then prints the larger integer with a message to the user. You choose what the message is.

## Notes

- While Loops vs. If Statements
  - How to declare variables in a loop
  - How to work with variables that you want to persist outside the loop
- Infinite loops and `while True`
  - Escape with ctrl+c
- While Loops vs. For Loops
  - How to pick your loop?

## Exercise: Smaller and Larger

Write a program that prompts the user for two integers. It should ask them to enter a smaller integer and then a larger integer. 

If the second integer is smaller than the first integer, the program should ask the user to try again, and prompt for a smaller integer and a larger integer again, until the user does it right.

If the second integer is larger than the first integer, the program should print all integers between the two integers.

**Hint:** Don't try to write this program in full linear order. Break it down into steps. How do I ask for a larger and smaller number? How do I check which is larger? How do I do that repeatedly? Etc. 

**Hint 2:** Remember you can package complicated things into methods, if that would be helpful.