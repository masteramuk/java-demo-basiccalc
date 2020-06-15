# java-demo-basiccalc
A simple java code developed to demostrate the basic calculations on the number of input pre-defined structures

## Description of the code
> Create the class Calculate and the required methods so that the code prints the sum of the numbers passed to the function add.
1.	There are nine lines of input, each containing and int value
2.	There must be only 4 lines (odd lines) of output printed. Each lines contains the sum of int passed as the parameters to add in the main method.
Sample:&nbsp;<br/>
Input:&nbsp;<br/>
	3&nbsp;<br/>
	2&nbsp;<br/>
	5&nbsp;<br/>
	6&nbsp;<br/>
	8&nbsp;<br/>
	0&nbsp;<br/>
	7&nbsp;<br/>
	7&nbsp;<br/>
	4&nbsp;<br/>
Output:&nbsp;<br/>
Line#1	3+2=5&nbsp;<br/>
Line#3	3+2+5+6=16&nbsp;<br/>
Line#5	3+2+5+6+8+0=24&nbsp;<br/>
Line#7	3+2+5+6+8+0+7+7=38&nbsp;<br/>
>

**However** the code does more that expected. It accept 9 lines of integer input and perform basic computation based on selection; that are **add ('+'), substract ('-'), multiplication ('\*'), or division ('/')

##### To test the code:
run command at your command prompt: *java -jar BasicCalc.jar com.haszeli.BasicCalc.main* <br/>

Please make sure that you have latest Java JDK and JAVA_HOME and JAVA JDK is set in your classpath.
The code is compiled using **Netbeans** with **JDK13**. <br/>

Review the Javadoc in the Javadoc folder for the description of the code

##### Sample Result:<br/>

> Purpose of the program is to accept 9 integers in 9 lines. 
perform calculation and produce 4 rows of result calculating all. 
numbers (taking 2 numbers for each line and additional 2 lines for. 
subsequent lines. <br/>
Enter integer 1: 
3 <br/>
Enter integer 2: 
2 <br/>
Enter integer 3: 
5 <br/>
Enter integer 4: 
6 <br/>
Enter integer 5:   
8 <br/>
Enter integer 6:   
0 <br/>
Enter integer 7:   
7 <br/>
Enter integer 8:   
7 <br/>
Enter integer 9:   
4 <br/>
Choose your calculation method (only add (+), substract (-), multiplication (*) or divide (/) is accepted). <br/>
Your choice:   
\+ <br/>
>Doing the computation based on selection: + <br/>
  <br/>
3 + 2 = 5<br/>
3 + 2 + 5 + 6 = 16<br/> 
3 + 2 + 5 + 6 + 8 + 0 = 24<br/>
3 + 2 + 5 + 6 + 8 + 0 + 7 + 7 = 38<br/> 

