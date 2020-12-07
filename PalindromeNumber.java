import java.util.Scanner;
class PalindromeNumber
{
   public static void main(String args[])
   {
      Scanner Sc=new Scanner(System.in);
      System.out.println("enter a number");
      int number=Sc.nextInt();
      int reminder,sum=0,temp;
      temp=number;
      while(number>0)
      {
        reminder=number%10;
        sum=(sum*10)+reminder;
        number=number/10;
       }
    if(temp==sum)
     {
        System.out.println("given number is palindrome");
      }
     else
        System.out.println("given number is not  palindrome");
    }
}
//first we have to enter the number then it will read that is scanner then it will storein the variable number
//we store number in temp
//if number is greaterthan 0
//then it will calculate 
//reminder==>let us take number=121
//then reminder=121%10==>1
//then sum=(0*10)+1
  //sum=1
//then num=121/10==>21
//then reminder=21%10==>1
//then sum=(1*10)+1==>11
//like this it will calculate 
//if  temp is equal to sum then it is palindrome
//else not a palindrome

