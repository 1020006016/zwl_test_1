package homework;

public class day04_homework_calculator {

    public int a;
    public int b;

    public  day04_homework_calculator(int a,int b){
        this.a = a;
        this.b = b;
    }

    public void add(){
        System.out.println(a+b);
    }

    public void subtract(){
        System.out.println(a-b);
    }

    public void multiply(){
        System.out.println(a*b);
    }

    public void divide(){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        day04_homework_calculator cal = new day04_homework_calculator(3,4);
        cal.add();
        cal.subtract();
        cal.multiply();
        cal.divide();
    }
}
