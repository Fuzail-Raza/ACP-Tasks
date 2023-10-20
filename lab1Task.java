import java.util.*;

public class lab1Task {
    
    public static void primeNumber() {

        int i,m=0,flag=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any Number");
        int num=in.nextInt();
        m=num/2;
        if(num==0 || num==1){
            System.out.println(num + " i s not a prime number");
        }
        else{
            for(i=2;i<=m;i++){
            if(num%i==0){
                System.out.println(num + "  is not a prime number");
                flag=1;
                break;
            }
        }
        } 
        if(flag==0){
            System.out.println(num + " is a prime number");
        }

    }



    public static void copyArray() {
        int [] arr1 = new int [] {1, 2, 3, 4, 5};
        int arr2[] = new int[arr1.length];
        
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println();
        
        System.out.println("Elements of new array: ");
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        
        }
    }
       




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

        // primeNumber();
        // copyArray();
        // findFactorial();
        reverseNumber();

    }
    
}
