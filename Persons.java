public class Persons
{
    private String fullname;

    public Persons(String fullname) //constructor
    {
        setFullname(fullname);
    } 


    public String getFullname()
    {
        return fullname;
    }

    public void setFullname(String newfullname)
    {
        this.fullname = newfullname;
    }

}