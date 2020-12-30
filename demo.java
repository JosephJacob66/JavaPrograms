class xyz{
          xyz(){
          System.out.println("this is xyz default constructor");
         }
         xyz(int x,int y){
              System.out.println("xyz parametrized constructor");
          }
          void disp(){
            System.out.println("display method");
          }
}


class abc extends xyz{
            abc(){
           super(20,30);
           System.out.println("this is abc default constructor");
         }
}


class demo{

           public static void main(String args[]){
           abc myobj = new abc();
           
 }
}