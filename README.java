import java.io.*;
import java.util.*;
class Reverse
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int rev=0,remainder;
	int num=a;
	while(a!=0)
	{
		remainder=a%10;
		rev=remainder;	
		a /=10;	
		System.out.print(rev);
	}
	
  }
}
