package Super_keyword;

public class parametraized_cons {
    parametraized_cons(int a)
    {
        System.out.println("hello viewer "+a);
    }
}
class g extends parametraized_cons
{
    g()
    {
        super(100);
        System.out.println("hello");
    }
}
class E
{
    public static void main(String[] args) {
        g r=new g();
    }
}
