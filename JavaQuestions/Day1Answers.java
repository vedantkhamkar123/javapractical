1.Write a java program to illustrate different types of data?

class Datatype {
    public static void main(String[] args) {

            byte a = 30;
            System.out.println("byte var="+a);

            int b = 40;
            System.out.println("int var="+b);

            char c = 'A';
            System.out.println("char ="+c);

            long d = 123456;
            System.out.println("long var="+d);

            float e = 1.5f;
            System.out.println("float var="+e);

            double f = 1.67999;
            System.out.println("Double var="+f);

            short g = 2;
            System.out.println("short var="+g);

            boolean h= true;
            System.out.println("boolean var="+h);

    }}

2.
class value
{
    public static void main(String[] args){
        //System.out.println(int.MAX_VALUE);
    System.out.println("Max Int:"+ Integer.MAX_VALUE);
    System.out.println("Min Int:"+ Integer.MIN_VALUE);

    System.out.println("Max Double:"+ Double.MAX_VALUE);
    System.out.println("Max Double:"+ Double.MIN_VALUE);
        
    System.out.println("Max Short:"+ Short.MAX_VALUE);
    System.out.println("Max Short:"+ Short.MAX_VALUE);
        
    System.out.println("Max byte:"+ Byte.MAX_VALUE);
    System.out.println("Max byte:"+ Byte.MAX_VALUE);
        
    System.out.println("Max Long:"+ Long.MAX_VALUE);
    System.out.println("Max Long:"+ Long.MAX_VALUE);
        
    System.out.println("Max Float:"+ Float.MAX_VALUE);
    System.out.println("Max Float:"+ Float.MAX_VALUE);
    }
}

3.
class COD    //change of datatype
{
   public static void main(String[] args){ 
    byte b = 12;
    //short s =(byte)b;
    //int a =(byte)b;
     short s =b;
       int a= b;
       int x =12;
       //byte y=(int)x;
    byte y =(byte)x;
     System.out.println("Byte --> Short"+" "+b+"-->"+s);
     System.out.println("Byte -->Int"+" "+b+"-->+a);
     System.out.println(y);
   }
}
