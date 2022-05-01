public class Implementderivedclass
{
    public static void main(String[] args)
    {
        Employee obj_Employee = new Employee("Kuthalingaraj",2040,"ZOHO Incubation Process");
        System.out.println(obj_Employee.getFullname());
        System.out.println(obj_Employee.getRole());
        System.out.println(obj_Employee.getEmpid());
    }
}