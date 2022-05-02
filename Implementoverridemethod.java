class College
{
    public void semester()
    {
        System.out.println("First Semester Results will be announced soon");
    }
}

 class Collegename extends College
 {
     public void semester()  //overriding method 
     {
         super.semester();
         System.out.println("JP College of Arts and Science");
         
     }
 }

 class Collegelocation extends Collegename
 {
     public void semester()//overriding method
     {
         super.semester();
         System.out.println("Tenkasi");
         
     }
 }

 public class Implementoverridemethod
 {
     public static void main(String [] args)
     {
         Collegelocation obj_collegelocation = new Collegelocation();
         obj_collegelocation.semester();
     }
 }