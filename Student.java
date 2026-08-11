// public class Datatype{
//     public static void main(String[] args){
//         //print all datatypes
//     int num=30;
//     byte b=10;
//     short s=20;
//     long l=1000;
//     float f=10.5f;
//     double d=20.5;
//     char c='A';
//     boolean bool=true;

//     System.out.println("Integer: " + num);
//     System.out.println("Byte: " + b);
//     System.out.println("Short: " + s);
//     System.out.println("Long: " + l);
//     System.out.println("Float: " + f);
//     System.out.println("Double: " + d);
//     System.out.println("Character: " + c);
//     System.out.println("Boolean: " + bool);
    


//     }
// }
// conversion

// class datatype {
//      public static void main(String[] args) {
//         // convert byte to int
//         int b= (byte) 128;
        
        
        
//         System.out.println((b));
//     }
// }

//instance variable------------------------------------------------------------------

public class Student {

    int id;
    String name;

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.id = 101;
        s1.name = "Deepak";

        System.out.println("Student id: " + s1.id);
        System.out.println("Student name: " + s1.name);
    }
}