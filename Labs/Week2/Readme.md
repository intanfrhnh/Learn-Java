# Q1 - Integer Distance

In this question, you will write a program that reads two integers as command-line arguments and calculates the distance between them. We will define this distance in the standard arithmetic manner, namely as the difference between the larger and the smaller of the two numbers.

## Distance1.java
Your program should print out the result of subtracting the smaller number from the larger one.

## Distance2.java
Write a class, Distance2, which use the Math.abs() method instead of the methods Math.min(), Math.max() to calculate the distance between the two command line arguments.

# Q2 - Largest Double (LargestDouble.java)

In this question, you will write a program that reads two floating-point numbers from the command line and returns the larger of the two. By default, a floating point number in Java is of type double, and this is the type we will use here.

# Q3 - Evaluating Boolean Values (BooleanExpr.java)

In this question, we will investigate the following rather complicated boolean expression:

![alt text](image.png)

We are using standard logical notation for boolean operators, where is not, is and and is or. The corresponding Java operators are !, && and ||, respectively. Consequently, the Java translation of the expression above is as follows:

boolean phi = (!(a && b ) && (a || b )) || ((a && b) || !(a || b));

You will write a program that takes two boolean arguments, say B1 and B2, from the command-line and evaluates the result of substituting these arguments for a and b in phi.

# Q4 - Face-Printing (FacePrinter.java)

In this question, you will write a program that prints an ‘ASCII-art’ face to the screen. When your program is called, it should print out the following:
```
   ///
 ///////
 | o o |
@|  n  |@
 | ~~~ |
  -----
```
Write your program to carry out this task. Your class should be called FacePrinter. In this exercise, you do not need to worry about taking input from the command line.

# Q5 - Quadratic Equations (QuadraticSolver.java)

In this question, we will write a program that solves quadratic equations, a type of equation commonly seen in science and engineering. 

Write a program QuadraticSolver to read three floating point numbers from the command line, representing the values of 
A, B, C, and then use the values of these arguments to solve for x. Your program should print the two solutions for x on separate lines.

# Q6 - Polar Coordinates (PolarCoordinates.java)

In this question, we will write a program that converts from Cartesian coordinates to polar coordinates.

Create a program, using a class called PolarCoordinates, and as before create a main() method. Your program will read two arguments of type double from the command line, and these are to be interpreted as the Cartesian coordinates (x, y). Your program should return these points in polar coordinates R and θ.

# Q7 - Safer Fixed Divider
In this question, we will start off by implementing a program that divides one number by another, where the two numbers are given on the command-line. Next we will improve our program to ensure that the denominator (i.e. the divisor of a fraction) is not zero.

## FixedDivider.java
Start off by creating a program FixedDivider with a main() method which reads two floating point arguments from the command-line into double variables, called numerator and denominator. Your program should print out the value of numerator/denominator.

## SaferDivider.java
Your task now is to write a class SaferDivider that will show the following behaviour:
```
: javac SaferDivider.java
: java Divider 10.0 2.0
5.0
: java SaferDivider 10.0 0.0
I can't divide by zero!
```

# Q8 - Safer Quadratic Solver (SaferQuadraticSolver.java)
In an earlier lab exercise, you wrote a program to solve quadratic equations. However, at the time, we noted that some quadratic equations would not have real solutions if we try to take the square-root of a negative number. In this case, the solution will involve imaginary solutions. Furthermore, in the quadratic equation we divide by A, which may also prove problematic if A=0. We will look at these issues in more detail.

# Q9 - Squares Loop
## SquaresLoop.java
Write a program SquaresLoop which uses a for loop to display the square of the numbers from 1 to 10, as shown below. Don’t forget to print out a new-line after the loop has terminated.
```
:java SquaresLoop
1 4 9 16 25 36 49 64 81 100
```

## SquaresLoopRange.java
Write a program SquaresLoopRange which takes two command-line arguments, a start-number and a stop-number, and prints the squares between these numbers inclusively, (i.e. including the squares of the start-number and stop-number themselves).

Your program should handle the case when the start-number is larger than the stop-number by displaying the following error message:
```
:java SquaresLoopRange 10 1
Start-limit greater than stop-limit!
```

## MultiplesLoopRange.java
Write a third program, MultiplesLoopRange, which prints out numbers in a certain range, provided that they are a multiple of a certain value. (Note that we are no longer interested in squaring the values.) Your program should take three command-line arguments, representing the start number, the end number, and the required factor.

# Q10 - Lopsided Number Triangle (LopsidedNumberTriangle.java)
This exercise is slightly more complicated than the previous one. You will be required to put one `for` loop inside another, a technique known as nesting.

Your task is create a triangle as shown below.

```
: java LopsidedNumberTriangle
1
22
333
4444
55555
666666
7777777
88888888
999999999
:
```

# Q11 - Gambler's Ruin (Gambler.java)
n p. 66 of the Sedgewick & Wayne textbook, the following block of code is given:

```
public class Gambler
{
  public static void main(String[] args)
  {
    int stake = Integer.parseInt(args[0]);
    int goal = Integer.parseInt(args[1]);
    int num_trials = Integer.parseInt(args[2]);

    int bets = 0;
    int wins = 0;

    for (int t = 0; t < num_trials; t++)
    {
      int cash = stake;
      while (cash > 0 && cash < goal)
      {
        bets++;
        if (Math.random() < 0.5 ) cash++;
        else                      cash--;
      }
      if (cash == goal) wins++;
    }

    System.out.println(100 * wins/num_trials + "% wins");
    System.out.println("Avg # bets: " + bets/num_trials);

  }
}
```

Note In S&W, the authors use a variable T. For greater clarity, we have renamed it as num_trials.
Familiarise yourself with the Gambler’s Ruin code and run it with some different parameters.

Adjust the program so that the probability of a win, prob_of_win, can also be given as a command-line parameter. Your program should now be called as follows:

```
:java Gambler <stake:int> <goal:int> <num_trials:int> <prob_of_win:double>
```

where <variable-name:variable-type> tells you the types of expected command-line parameters. For example,

```
:java Gambler 2 20 5 0.75
```

should make the program run with the assignments stake = 2, goal = 20, num_trials = 5 and prob_of_win = 0.75.

# Q12 - Quadratic Solver With Imaginary Parts (ImQuadraticSolver.java)
Write a program ImQuadraticSolver which solves quadratic equations in the general case, when the solutions can be complex. You will need to calculate the ‘discriminant’, and depending on whether it is positive or negative, derive the real and imaginary parts of the solutions in slightly different ways. It is easiest to start with the case when the discriminant is positive, as this will always produce real solutions. Improve your program ImQuadraticSolver so that it can handle the case where A=0. It is still possible to solve some equations even if A=0 , although there will now be just a single solution. 

