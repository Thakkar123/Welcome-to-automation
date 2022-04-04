package automationtest;

public class IfThenElse_Q3 {

    public boolean isTeen(int age){
        if(age<=18){
             System.out.println(age+" - true");
            return true;
        }else
        {
            System.out.println(age+" - false");
            return false;
        }

    }
    public static void main(String[] args) {
        IfThenElse_Q3 obj = new IfThenElse_Q3();
        obj.isTeen(15);
        obj.isTeen(20);

    }
}
