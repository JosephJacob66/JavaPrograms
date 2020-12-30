class abc{
          int a;
          int b;
          abc(int x,int y){
                a = x;
                b = y; 
                
  }
          public void display(){
                 System.out.println("X value is = "+a, "Y value is = "+b);
   }
}








class constructor_demo{

                   public static void main(String args[]){
                   abc myobj = new abc(10,20);
                   myobj.display();

   }
}