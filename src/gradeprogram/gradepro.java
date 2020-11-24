package gradeprogram;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class gradepro {
	

 

       public static void main(String[] args) {

 

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream 

        

        

        String Result; 

        System.out.print("Dear Kindly insert your Result- "); 

        Result = sc.next(); 

       if(Result.equals("A")){

          System.out.println("your Range 85-100");

       }

       else if(Result.equals("B")){

          System.out.println("your Range 75-85");

       }

       else if(Result.equals("C")){

          System.out.println("your Range 50-65");

       }

       else if(Result.equals("D")){

          System.out.println("your Range 0-50");

       }

       else {

          System.out.println("your result is not provided into the task description you may be between 65 -75");

       }

}

}