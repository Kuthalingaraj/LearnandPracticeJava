import java.util.HashSet;
public class Result
{
    public static void main(String[] args)
    {
        HashSet<Integer> no = new Hashset<Integer>();

        no.add(1);
        no.add(2);
        no.add(6);

        for(int i=1;i<=10;i++){
            if(no.contains(i)){
                System.out.println("The registered number"+ i +"Passed");
            } else{
                System.out.println("The registered number is failed");
            }
        }


    }
}