package homework.day06_homework_1;

public class Main {
    public static void main(String[] args) {
        //a
        Employee coder = new Coder();
        coder.work();
        coder.sleep();
        Employee tester = new Tester();
        tester.work();
        tester.sleep();
        Employee manager = new Manager();
        manager.work();
        manager.sleep();

        //b
        method(coder);
        method(tester);
        method(manager);


    }
    public static void method(Employee e){
        e.work();
        e.sleep();
    }
}
