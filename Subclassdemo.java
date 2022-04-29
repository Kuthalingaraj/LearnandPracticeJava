  class persons{    ///This the subclass method of class
protected String college ="JP College of arts and science";
    protected String name ="Kuthalingaraj";
    protected int age = 22;
    protected String place ="Kasimajorpuram";
    }
class Subclassdemo extends persons{
    private int graduationyear = 2021;
public static void main(String[] args) //This is the main method of the class
{
    persons myObj =new persons();
    System.out.println("college  "+myObj.college);
    System.out.println("Name:::"  + myObj.name);
    System.out.println("Age"+myObj.age);
    System.out.println("This is our Place"+myObj.place);

}
    
}

  