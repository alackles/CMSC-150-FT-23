---
title: W1D2 - How to Count
permalink: /notes/w1d2
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

# Agenda

Time | Activity | Purpose
---- | ---- | ----
9:50 - 10:10 | Warm-Up Problem | Apply material from the reading
10:10 - 10:30 | Encoding Information in Binary | Extend upon the reading to understand how binary numbers can store information
10:30 - 11:00 | Extension Problems | Stretch and test our understanding of binary encodings  

# Learning Goals

Topic | Objective | Professor's Role
---- | ---- | ----
CS.1 | I can manipulate statements of basic propositional and boolean logic | Find engaging, intuitive ways to discuss basic logic
CS.2 | I can describe and understand how mathematics and computer science are connected | Draw and discover connections between mathematics and computer science
Reflect.2 | I have gained comfort with discomfort, failure, and unfamiliarity | Cultivate a classroom environment which supports and encourages safe exploration of discomfort, failure, and unfamiliarity 

# Notes

## Encoding Binary Information

- Our computers store information in 1s and 0s; on or off
- One binary number is often called a _bit_ (**bi**nary dig**it**)
  - Sometimes in a computer science context they are called _bools_ (named after George **Bool**e)
- Binary numbers can be added, subtracted, multiplied, and divided like decimal numbers
  - Binary numbers also have other operations we can perform; these are called _binary_ operators
  - Combining binary numbers and binary operations allows us to convey all forms of information with just two bits in infinite combination
- Information (in a formal definition) is usually discussed as "bits of information"--how many binary numbers are requred to convey information unambiguously

# Practice Problems

## Warm-Up Problem

Fill in the blanks for the problems below.

$$100_2 = \rule{1cm}{0.15mm}_{10}$$

$$32_{10} = \rule{1cm}{0.15mm}_{16}$$

$$10_{\rule{0.2cm}{0.15mm}} = 15_{10}$$

$$111_2 = \rule{1cm}{0.15mm}_{8}$$

$$4_7 = \rule{1cm}{0.15mm}_{10}$$

$$\rule{1cm}{0.15mm}_{7} = 27_{12}$$

## Extension Problems


### Segmented Displays

Many digital clocks are displayed with **segmented displays**, like the following:

![7 segment display of numbers 0-9](https://openclipart.org/image/800px/277205)

This display consists of 7 segments to display numbers. It is the most common type of segmented display.

There are other kinds of segmented diplays: for example, here is a 6-segment display.

![6 segment display of numbers 0-9](https://preview.redd.it/interactive-6-segment-display-by-me-v0-xglv1o3a5w2b1.png?width=1050&format=png&auto=webp&s=1af3f576dd54864a740fab60e61fba7cc9413211)

If we require that every number is displayed by a distinct pattern of segments, **what is the minimum number of segments theoretically required to display the numbers 0 through 9?**

### Letters in Binary?

Computers represent more than just numbers; they clearly can represent letters, images, and more, as you can see from even the previous exercise. 

Think of one way you might encode the word `Lawrence` in binary. _Describe_ your encoding, and then demonstrate that encoding on the whiteboard. 

Here are two things to consider:
- Is you encoding _unique_? That is, will any other words be mapped to the same set of binary numbers? How do you kno?
- How will you distinguish between the capital L and the lowercase letters in the rest of the word?