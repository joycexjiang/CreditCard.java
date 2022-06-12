# Credit Card Program
Java Programming Project 2 implementing a security algorithm on a credit card number, indicating whether or not the card number is valid, according to the security check. 

/** 
 * Programming Exercise 2
 * @author: Joyce Jiang
 * uni: jj3115
 * Date: February 15, 2021
 */
 
 * CreditCard.java:
      This program takes in a 12 digit number with dashes every four digits as a string. In the constructor, I initialize the instance variables, specifically, each digit of the string as an instance variable in order to access them in the helper mutator methods when checking the six conditions. The helper mutator methods check all six conditions and changes the boolean value of "validity" if the condition is approved, and if not, changes the boolean value to false and assigns the number of the condition to the variable ErrorCode to print later on. In the check() mutator method, I call the first condition, and if the condition is true, we move on to the second one, and so on. The accessor methods isValid() and getErrorCode() returns the value of variable "validity" and variable "ErrorCode", respectively. 
      
      I consulted the String API doc (https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) for majority of these problems, looking at string manipulation. I also consulted TAs and the edStem discussion boards.
