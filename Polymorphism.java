class Zoho
{
    public void zohoRecruitment()
    {
        System.out.println("Zoho Hiring various Kind of roles");
    }
}

class Softwaredeveloper extends Zoho
{
    public void zohoRecruitment()
    {
        System.out.println("This role to developing the softwares");
    }
}

class Contentwriter extends Zoho
{
    public void zohoRecruitment()
    {
        System.out.println("This  role to write some content's on our softwares");
    }
}


class Qatesting extends Zoho
{
    public void zohoRecruitment()
    {
        System.out.println("This role to testing and implementing our softwares");
    }
}

public class Polymorphism
{
    public static void main(String[] args)
    {
        Zoho obj_zoho = new Zoho();
        Softwaredeveloper obj_softwaredeveloper = new Softwaredeveloper();
        Contentwriter obj_contentwriter = new Contentwriter();
        Qatesting obj_qatesting = new Qatesting();


        obj_softwaredeveloper.zohoRecruitment();
        obj_qatesting.zohoRecruitment();
        obj_zoho.zohoRecruitment();
        obj_contentwriter.zohoRecruitment();


    }
}