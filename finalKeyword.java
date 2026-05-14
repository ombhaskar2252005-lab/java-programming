final class college{
    final int fee = 50000;
    final void show(){
        System.out.println("fee = " + fee);
    }
}
public class finalKeyword {
    public static void main(String[] args){
        college c = new college();
        c.show();
    }
}
