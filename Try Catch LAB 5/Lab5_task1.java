import java.util.*;

public class Lab5_task1 {

    static void task1(){
        Scanner in = new Scanner(System.in);

        int num1,num2;
        num1=in.nextInt();
        num2=in.nextInt();
        try{

            if(num2==0){
                throw new ArithmeticException("Number Cannot be divided by Zero");
            }
            else{
                System.out.println(num1/num2);
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally{

        }
    }
     static void task2() {

        int[] arr=new int[10];

        for (int i=0;i<10;i++){
            arr[i]=i;
        }
        try {
            int index;
            Scanner in = new Scanner(System.in);
            index=in.nextInt();
            if (index<0 || index >9){
                throw new ArrayIndexOutOfBoundsException("Index range is from 1-10");
            }
            System.out.print("Array element : " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {

//        task1();

        task2();
    }


}
