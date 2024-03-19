import java.util.*;
import java.io.*;
class palindrome
{
public static void main(String args[])
{
int r,temp;
int total=0;
scanner sc=new scanner();
System.out.println("Enter the number:");
int a=sc.nextInt();
while(n>0)
{
r=n%10;
total=(total*10)+r;
n=n/10;
}
if(temp==total)
{
System.out.println("Palindrome number");
}
else
{
System.out.println("Not a palindrome number:");
}
}
}


