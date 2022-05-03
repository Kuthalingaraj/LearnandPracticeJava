import java.util.*;
public class Linkedlstdemo
{
    public static void main(String[] args)
    {
        LinkedList<String> companyname = new LinkedList<String>();

        companyname.add("O");
        companyname.add("H");
        companyname.add(0,"O");
        companyname.addFirst("Z");
        companyname.addLast("Corporation");


        System.out.println(companyname);

        companyname.remove("O");
        //companyname.remove("H");
        System.out.println(companyname);

        
       companyname.remove("O");
       companyname.remove("H");
       companyname.remove("O");
        System.out.println(companyname);


    }
}