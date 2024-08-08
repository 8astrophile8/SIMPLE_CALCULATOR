import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("####SIMPLE CALCULATOR####");
        System.out.println("--------|+|-|*|/|--------");
        System.out.println("ENTER THE FIRST NUMBER:");
        double num1= sc.nextDouble();

        System.out.println("ENTER THE SECOND NUMBER:");
        double num2= sc.nextDouble();

        System.out.println("CHOOSE THE OPERATOR[|=|-|*|/|]:");
        char operation= sc.next().charAt(0);

        double result=0;
        boolean validOperation= true;

        switch(operation){
            case '+':
                result = addition(num1,num2);
                break;
            case '-':
                result = subtraction(num1,num2);
                break;
            case '*':
                result = multiplication(num1,num2);
                break;
            case '/':
                result = division(num1,num2);
                break;
            default:
                System.out.println("EEEEEEEERRORRRRRRRRR");
                validOperation = false;
                break;
        }
           if (validOperation){
               System.out.println("HERE YOU GO:\t"+ result);
        }
           sc.close();
    }
    public static double addition(double a,double b){
                return a+b;
    }
    public static double subtraction(double a,double b){
             return a-b;
    }
    public static double multiplication(double a,double b){
        return a*b;
    }
    public static double division(double a,double b){
       if(b!=0) {
           return a / b;
       }
       else {
           System.out.println("ERROR/n YOU ARE DUMB FOR DIVIDING WITH 0/n REPEAT YOUR PLAY SCHOOL!");
           return Double.NaN;
       }
       }
    }

