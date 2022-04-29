public class Staticmethod{
    static void college(){  //static method without create an object to call directly a method
        System.out.println("JP college of Arts and Science");

    }
    static void Department(){

        System.out.println("B.SC (Information Technology)");
    }

    public void Rollno(){  //public method to create a object and to call a objectname.methodname();
        System.out.println(20181051516215L);
    }

    public void Name(){
        System.out.println("Kuthalingaraj");
    }

    public static void main(String[] args){
      college();
      Department();
      Staticmethod rollnoMyobj = new Staticmethod();
      Staticmethod nameMyobj = new Staticmethod();
      rollnoMyobj.Rollno();
      nameMyobj.Name();



    }

}