package Super_keyword;

public class method {
    void show() {
        System.out.println("Hello Viewer");
    }
}
class aa extends method
{
    void show(){
        super.show();
        System.out.println("Hello Learner");
    }
}
class dis {
    public static void main(String[] args) {
        aa R = new aa();
        R.show();
    }
}
