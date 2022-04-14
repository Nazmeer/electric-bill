import java.util.*;
import java.io.*;
class palindrome
{
public static void main(String args[])
{
int r,temp;
int sum=0;
scanner sc=new scanner();
System.out.println("Enter the number:");
int a=sc.nextInt();
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
{
System.out.println("Palindrome number");
}
else
{
System.out.println("Not a palindrome number:");
}
}
}


