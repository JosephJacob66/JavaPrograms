abstract class RBI{
            abstract void loan();
            }
class SBI extends RBI{
           void loan(){
           System.out.println("SBI has 8% interest rate.");
           }
          }
class AXIS extends RBI{
          void loan(){
           System.out.println("SBI has 10% interest rate.");
           }
         }
class HDFC extends RBI{
           void loan(){
           System.out.println("HDFC has 12% interest rate.");
           }
          }
class abstractdemo{

             public static void main(String args[]){
             System.out.println("Abstract demo");
              SBI s=new SBI();
              AXIS a = new AXIS();
              HDFC h = new HDFC();
              s.loan();
              a.loan();
              h.loan();
              }
          }