# id1020-lab1

Code solutions for lab 1 in my second-year course, ID1020: Algorithms and Data Structures.

* Assignment 1 is fulfilled by `read-backwards_recursive.c` and `read-backwards_iterative.c`.
* Assignment 2 is fulfilled by `ReadBackwards.java`.

## Lab Text:
Update, 2018-09-11: The numbering of the programming assignments has been corrected.

Upload text files containing the solutions to the problems you have solved. Name the files with the number of the Question. You will get the credits/points after the seminar where you sign up to (possibly) report/explain the problems/implementations in front of the other students.

All code should be properly documented, commented and have proper unit testing implemented in main(). To facilitate things you should incorporate the README file for each task as a comment in the beginning of the corresponding file.

Assume that the data stored in each element is a character or integer (you may choose whichever you think is more convenient)

All JAVA implementations should implement a method returning string representation of the list/queue where each element is placed between brackets "[x]" and adjacent elements are separated by a comma "," 

You are not allowed to use Java library implementations of the data structures (queues, lists etc.) The idea is that you should learn to implement the internals yourself!

## Programming assignments:

1. In C implement a recursive and an iterative version of a function which reads characters from stdin until a newline character is read and then prints them on stdout in reverse order. Hint: use getchar(), putchar() (or getc(), putc()). For the iterative version you may assume a fixed max length of the input.
2. Implement the above program in JAVA using one of the ADTs suggested in ch. 1.3
3. Implement a generic iterable FIFO-queue based on a double linked list.
4. Implement a generic iterable circular linked list which allows the user to insert and remove elements to/from the front and back end of the queue. Be careful when designing the API.
5. Implement a generalized queue which allows the user to remove the kth element from the queue. Assume the most recently added element has index 1.
6. Implement a filter (i.e. a program which reads from standard in until an EOF is read, does some manipulation of what is read, and then prints output to  standard out) which can determine if parentheses are properly balanced. I.e. a program which could check whether a JAVA/C program is properly balanced. You need to check the following types of parentheses: {},[],()

*Update, 2018-09-11:* Previously, Programming assignments 2 through 6 above were numbered 1 through 5, so that there were two number 1's and no number 6. This was due to a markup mistake. We apologize for any confusion caused by this!

## Questions to answer in the seminar:

Show means that you should be able to project the code/files you have uploaded in Canvas from Canvas from your own computer or the teachers. I.e. you cannot use another file than the one you have uploaded in Canvas. You should be able to explain your code in detail and your design choices.

1. Show and explain the code from assignment 1. Is it easier to implement this function recursively or iteratively? Are there other pros/cons of the two approaches?
2. Show and explain the code from assignment 2 and how your test works.
3. Show and explain the code from assignment 3 and how your test works.
4. Show and explain the code from assignment 4 and how your test works.
5. Show and explain the code from assignment 5 and how your test works.
6.Show and explain the code/algorithm from assignment 6 and how your test works.
7. When is it preferable to implement a collection by an array and by a linked data structure?
8. How could you determine if a collection type data structure, without size limitations, is implemented by an array or as a linked structure without access to the source code (you can run the code)?
