import java.util.*;

public class lab1Task {
    
    public static void findFactorial(){

        System.out.println("Enter Number to Find Factorial");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(num<0){
            System.out.println("Factorial of Negative Number is not Possible");
            return;
        }

        int fact=1;
        for (int i=num;i>1;i--){
            fact=fact*i;
        }
        
        System.out.println("Factorial of " + num + " is " + fact);
    }

    public static void reverseNumber(){

        System.out.println("Enter Number to Reverse");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int rev=0;
        boolean isNegative=false;
        
        if(num<0){
            num=-(num);
            isNegative=true;
        }
        
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        
        if(isNegative){
            rev=-(rev);
        }
        
        System.out.println("Reverse of Number is " + rev);
    }

    public static void main(String args[]){

        // findFactorial();
        reverseNumber();

    }
    
}
