class stringdemo{
       public static void main(String args[]){
          
       String name = new String("Joseph");
       String s = new String("   Frank    ");
       System.out.println(name.toUpperCase());
       System.out.println(name.toLowerCase());
       System.out.println(name.concat("Jacob"));
       System.out.println(name.charAt(3));
       System.out.println(name.length());
       System.out.println(name.isEmpty());
       System.out.println(name.replace("Joseph","Frank"));
       System.out.println(s.trim());
       System.out.println(name.compareTo(s));
       System.out.println(name.contains("eph"));
       System.out.println(name.contains("xyz"));

   }
}