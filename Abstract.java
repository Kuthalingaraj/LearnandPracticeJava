abstract class University
{
    public abstract void results();

    public void marks()
    {
        System.out.println("The Marks will be Announced Soon");
    }
} 

class Colleges extends University
{
    public void results()
    {
        System.out.println("The Results will be Announced Soon");
    }
}
class Abstract
{
    public static void main(String[] args)
    {
        Colleges obj_colleges = new Colleges();
        obj_colleges.marks();
        obj_colleges.results();

       //System.out.println("There will be no output");
    }
}