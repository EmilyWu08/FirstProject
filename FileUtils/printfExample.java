/**
*examples of printf formatting
*
*@author Emily
* since September 6, 2024
*/
public class PrintfExamples {
	Public static void main (String[] args){
	int i =987;
	double d + 32.678912;
	String str="Hello world";
	
	//output strings
	system.out.printf("i%s after\n", str); //open Format
	System.out.printf("%20s after\n", str); //right justified
	System.out.printf("%-20s after\n", str); //left justified
	
	//output integers
	System.out.printf("%d after\n", i);
	System.out.printf("%20d after\n", i);
	System.out.printf("%-20d after\n", i);
	
	//output doubles
	System.out.printf("%f after\n", d);
	System.out.printf("%20.2f after\n",d);
	System.out.printf("%-20.2f after\n", d);
	System.out.[rintf("%20.3e after\n", d);	
	
	//formatting text
	String myStr = String.format("%15s %10d %15f", str, i, d);
	System.out.println(myStr);
	}
}
