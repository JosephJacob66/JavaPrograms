class A{
         final int a =10;
         public final void display(){
           System.out.println("Changed: "+a);
            }
 }


class simpledemo extends A{
             public static void main(String args[]){
               System.out.println("hello");
                A obj = new A();
                 obj.display();
      }
}