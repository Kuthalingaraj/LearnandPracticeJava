class Marks
{
    int totalmarks = 100;
}

class Tamil extends Marks
{
    int marks = 98;

    void result()
    {
        System.out.println("The total marks is :"  + super.totalmarks);
    }
}

class Superkeyword
{
    public static void main(String[] args)
    {
        Tamil obj_tamil = new Tamil();
        obj_tamil.result();
    }
}