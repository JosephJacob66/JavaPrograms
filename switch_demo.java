class switch_demo{

         public static void main(String args[]){

              System.out.println("Select your delivery method");
              int mode_of_delivery = 1;
              switch(mode_of_delivery)
              {
                   case 1:   System.out.println("You selected india post");
                             break;
                   case 2: System.out.println("You selected DHL");
                             break;
                   case 3: System.out.println("You selected bluedart");
                             break;
                    default: System.out.println("please select one");
                             break;
              }
                 System.out.println("--------This is do while demo-----------");
                 int n=0;
                 do{
                     System.out.println("hello");
                     n++;
                    }
                 while(n<5);
   }
}
