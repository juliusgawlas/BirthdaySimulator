# BirthdaySimulator

In probability theory, the birthday problem concerns the probability that, in a set of n randomly chosen people, some pair of them will have the same birthday. We can look at that problem considering each day of the year: since there are 365 possible birthdays, with 366 people it is certain that two of them will have the same birthday.
Wiki:  https://en.wikipedia.org/wiki/Birthday_problem  

Looking at https://en.wikipedia.org/wiki/Birthday_problem#/media/File:Birthday_Paradox.svg we can tell that probability reaches 100% when the number of people reaches 366. But notice that 50% probability is reached with just 23 people, and 99.9% probability is reached with just 70! 

We will write a program to perform simulation of this paradox. Your program will do the following:

* Fill an array of size 23 with random numbers ranging from 1 to 365 (representing birthdays).
* Determine if two or more numbers in the array are the same (same birthdays).
* Repeat 1000 times, and print the percent of times that at least two birthdays are the same. 
* Repeat the above for an array of size 40 and 70.

We will organize this code into two functions so starter code and main program are provided for you. 

Part 1: complete function testRandomClass
This method should do the following create an array of integers of size 'classSize', fill the array with random numbers from 1 to 365.
Test to see if two or more numbers in the array are the same and if that is the case return true, if no pair like that is found return false

Part 2: complete function testProbablity.
This method calls the 'testRandomClass' method within for loop 1000 times.  It then prints out the percent of times that at least 2 students have the same birthday (in other words how many times testRandomClass returned true.
