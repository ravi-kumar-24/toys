# Maximum Toys Problem

**Problem** :
There are  5 varieties of toys, namely A, B,C,D,E.
Any toy shop could have any given number of these toys or none of these toys.
Price for
A - Rs. 5,
B - Rs. 1,
C - Rs  3,
D - Rs. 2,
E - Rs. 8.
 
When given the number of toys for each variety in a toy shop, and given an amount R , please write a program that gives the max number of toys one could buy.
 
For ex , Shop S has  1 A , 10 B, 5 C, 3 D, 0 E and R is Rs25.
Output should be  : 16 . One could have bought 10 B s for 1 Rs each and 3 of Ds for Rs2 each and 3 of C for Rs.3 each
 
Please make necessary assumptions and document it in your solution.

**Assumptions**:
1. Variety of toys are pre defined based on given problem.
2. Price for toys are defined based on given problem.
3. Toys stocks provided by user as input
4. Purchased amount provided by user as input
5. Extra amount which is left after calculation or not sufficient to purchase a toy will not use
6. Unknown Constraints are not handled.

**Solution**:
 1. Created a Enum ToyPrice which is used to pre defined toys an their prices.
 2. Created a Toy class to capture toys details
 3. Created a main class to handle calculation login

* Run the program and enter values for stocks and purchased amount as below
example.

* Please enter Toys availability in shop for A B C D E :: 1 10 5 3 0
* Please enter the purchased amount :: 25
* Maximum purchased quantity/quantities :: 16 **/

**Pre-requisites:**
* JDK 1.8

