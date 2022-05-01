public class Employee extends Persons
{

    
    private int empid;
    private String role;

    public Employee(String fullname,int empid,String role)//constructor
    {
    super(fullname);
    setEmpid(empid);
    setRole(role);
    }

    public int getEmpid()
    {
        return empid;
    }

    public void setEmpid(int newEmpid)
    {
        empid = newEmpid;
    }

    public String getRole()
    {
        return role;
    }


    public void setRole(String newRole)
    {
        role =newRole;
    }
}