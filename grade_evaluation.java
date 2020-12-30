import java.util.Scanner;
class grade_evaluation{
         public static void main(String args[]){
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter your marks");
          int marks = obj.nextInt();
          
          if (marks>45 && marks<=60)
          {
            System.out.println("Your grade is D");
          }else if(marks>60 && marks<=75)
          {
            System.out.println("Your grade is C");
          }else if(marks>75 && marks<=85)
          {
            System.out.println("Your grade is B");
          }else if(marks>85 && marks<=90)
          {
            System.out.println("Your grade is A");
          } else if(marks>90 && marks<=100)
          {
            System.out.println("Your grade is O");
          }else
          {
            System.out.println("Your grade is F");
          }
     }
  }