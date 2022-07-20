package Super_keyword;

public class variable {
    int a=10;
}
class X extends variable
{
    int a=20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
class test {
    public static void main(String[] args) {
        X r=new X();
        r.show();
    }
}
