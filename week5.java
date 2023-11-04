package week5;

public class week5 {


	public static void main(String[] args) {
		int n = 8;
		int x=14;

		System.out.println("factorial "+n+" is: "+factorial(n));
		System.out.println("sum of all numbers from 1 to "+n+" is: "+sum(n));
		System.out.println(n+"th fibonacci number is: "+fibonacci(n));
		System.out.println(n+" to the power "+x +" is: "+exponention(n,x));
		String str="birthday";
		System.out.println(str+" is palindrome: "+ isPalindrome(str));
		System.out.println(str+" reversed form is: "+ reverse(str));
		System.out.println("gcd of numbers "+n+" and "+x+" is: "+gcd(n,x));
		
	}
	// calculate the factorial of a given positive integer.
	public static int factorial(int n) 	{
		if (n==0 || n==1) {return 1;}
		return n*factorial(n-1);
	}
	
	//calculate the sum of all numbers from 1 to n.
    public static int sum(int n) {
    	// base case --> n=1 
    	// general solution -->1+2+3.. sum= n+(n-1)
    	if (n==0) {return 0;}
    	return n+sum(n-1);
    }
    
    //calculate the nth Fibonacci number.
    public static int fibonacci(int n) {
    	if(n==0)return 0;
    	else if (n==1)return 1;
    	return fibonacci(n-2)+fibonacci(n-1);
    }
    //check if a given string is a palindrome.
    public static boolean isPalindrome( String str) {
    	if (str.length()==0|| str.length()==1) {return true;}
    	
    	char firstChar = str.charAt(0);
    	char lastChar = str.charAt(str.length()-1);
    	
    	if(firstChar!=lastChar) {return false;}
    	String remaning= str.substring(1,str.length()-1);
    	return isPalindrome(remaning);
    	    }
    // calculate the exponentiation of a number (base) raised to a power (exponent).
    // axaxa=a^3 
    
    public static int exponention(int exp,int power) {
    	if (power==0) return 1;
    	return exp* exponention (exp,power-1);
    }
    
    //reverse a given string.
    public static String reverse(String str) {
    	if (str.length()==1||str.length()==0)return str;
    	return str.charAt(str.length()-1)+ reverse(str.substring(0,str.length()-1));
    }
    
    // find the greatest common divisor (GCD) of two numbers.
   public static int gcd(int num1, int num2) {
	   if (num2==0)return num1;

	   return gcd(num2,num1%num2);
   }
   
   
    
}
