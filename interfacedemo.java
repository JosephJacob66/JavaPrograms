interface  RBI1{
         void loan();
         }
interface RBI2{
          void rate_of_interest();
          }

class SBI implements RBI1,RBI2{
                 public void loan(){
                   System.out.println("sbi has 8% loan intersest rate");
                   }
                 public void rate_of_interest(){
                  System.out.println("the rate of interest by sbi is 12%.");
                    }
 }
class interfacedemo{

                public static void main(String args[]){
             System.out.println("---------interface demo--------------");
             SBI s =new SBI();
             s.loan();
             s.rate_of_interest();
       }
 }