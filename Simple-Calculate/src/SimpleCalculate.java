import java.util.Scanner;


public class SimpleCalculate 
{
	public static void main(String[] args)
	{
		int num1;
		int num2;
		char operator;
		int answer=0;
		
		Scanner scanObject= new Scanner(System.in);
		
		num1=scanObject.nextInt();
		num2=scanObject.nextInt();
		operator=scanObject.next().charAt(0);
		if(num1<0 || num1>=1000 || num2<0 || num2>=1000 || answer<=0 || answer>=1000)
		{
			System.out.println("OutOfRangeException");
		}
		switch(operator)
		{
		case '+':
			answer=num1+num2;
			if(operator=='+' && num1==0 || num2==0)
			{
				System.out.println("AddZeroException");
			}
		case '-':
			answer=num1-num2;
			if(operator=='-'&& num1==0 || num2==0)
			{
				System.out.println("SubtractZeroException");
			}
		}
		
		
		
		
		
		
	}
}
