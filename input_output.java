import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
//       Q1 - Input name, roll number and field of interest from user and print in the format below :
//       Name: xyz, Roll number: xyz, Field of interest: xyz.
                String first_name = sc.next();
                String second_name = sc.next();
                int roll_no = sc.nextInt();
                String field_interest = sc.next();
                System.out.println("Name:" + first_name + "" +second_name);
                System.out.println("Roll Number:" + roll_no);
                System.out.println("Field of interest:" + field_interest);
                
//        Q2 - Input two different string and print them in same line.
               System.out.println("Enter The First String:");
               String one = sc.nextLine();
               System.out.println("Enter The Second String:");
               String two = sc.nextLine();
               System.out.println("The Concatenation Of TWo String Are: " + (one+two));   
//          Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
//                100), write a program to calculate his total marks and percentage marks.
                System.out.println("First_Subject");
                int sub1 = sc.nextInt();
                System.out.println("Second_Subject");
                int sub2 = sc.nextInt();
                System.out.println("Third_Subject");
                int sub3 = sc.nextInt();
                int sum = (sub1+sub2+sub3);
                int avg = ((sum*100)/300);
                System.out.println( "The Mark of the Student is " +sum+ "In Percentage"  + avg+  "%"); 
/*            Q4 - Given two numbers, return their sum in the following format:
                 Int t representing number of test cases
                  T lines of Two integers representing the numbers to be added
*/                  
                int t = sc.nextInt();
                for ( int i = 0 ; i < t; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a+b);
        }
 //       Q5 - Given few lines of input(number of lines unknown) where each line has two
 //            strings, concatenate the strings.
               while (sc.hasNextLine()){
               String a = sc.next();
               String b = sc.next();
               System.out.println(a+b);
        }
                
    
  
 }
}
