package Super_keyword;

public class defult_constru {
    defult_constru()
    {
        System.out.println("hello viewer");
    }
}
class b extends defult_constru
{
    b()
    {
        // super();  automaticatiy apply in defult constructor
        System.out.println("hello learner");
    }
}
class F
{
    public static void main(String[] args) {
        b r=new b();
    }

}
