class Bankdetails {
	
    private String branchname;
	private String name;
	private long id;
	private int age;
    private long availablebalance;
    private long contactnumber;


	public long getContactnumber()
        {
            return contactnumber;
        }
    public void setContactnumber(long newContactnumber)
    {
        contactnumber=newContactnumber;
    } 

	public String getName() 
    { 
        return name;
    }
    
    public void setName(String newName)
     { 
         name = newName; 
     }

    public String getBranchname()
    {
        return branchname;
    }

    public void setBranchname(String newBranchname)
    {
        branchname=newBranchname;
    }
	
	public long getId() 
    { 
        return id; 
    }

    public void setId(long newId)
	{
		id = newId;
	}

	
	public int getAge() 
    { 
        return age; 
    }

	public void setAge(int newAge)
    {
         age = newAge; 
    }

    public long getAvailablebalance()
    {
        return availablebalance;
    }

    public void setAvailablebalance(long newAvailablebalance)
    {
        availablebalance = newAvailablebalance;
    }
}

public class EncapsulationDemo {
	public static void main(String[] args)
	{
		Bankdetails obj_Bankdetails = new Bankdetails();

		obj_Bankdetails.setName("Kuthalingaraj S");
		obj_Bankdetails.setAge(21);
		obj_Bankdetails.setId(518778679786L);
        obj_Bankdetails.setBranchname("IDBI");
        obj_Bankdetails.setAvailablebalance(50000);
        obj_Bankdetails.setContactnumber(9566885233L);


        System.out.println("!!!Implement of Encapsulation Concept!!!");
        System.out.println("Branch: " + obj_Bankdetails.getBranchname());
		System.out.println("Account holder Name: " + obj_Bankdetails.getName());
		System.out.println("Account holder Age: " + obj_Bankdetails.getAge());
		System.out.println("Accountnumber: " + obj_Bankdetails.getId());
        System.out.println("Available Balance:" +obj_Bankdetails.getAvailablebalance());
        System.out.println("Contact Number:"+  obj_Bankdetails.getContactnumber());

	}
}
