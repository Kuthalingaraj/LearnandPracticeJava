class College{
    String collegename="JP College of Arts and Science";
    long rollno = 20181051516215L;
    String name = "Kuthalingaraj";
    double marks = 99.9;
    String address = "Kasimajorpuram";
    String nickname = "Kuthu";

    public static void main(String[] args){
        College details = new College();
        System.out.println(details.rollno);
        System.out.println(details.collegename);
        System.out.println(details.name);
        System.out.println(details.marks);
        System.out.println(details.nickname);
        System.out.println(details.address);
    }
}