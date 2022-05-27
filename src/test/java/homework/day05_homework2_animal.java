package homework;

public class day05_homework2_animal {

    public void eat(){
        System.out.println("动物吃");
    }
    public void sleep(){
        System.out.println("动物睡");
    }

    public static void main(String[] args) {
        day05_homework2_animal animal = new day05_homework2_animal();
        animal.eat();
        animal.sleep();
        day05_homework2_cat cat = new day05_homework2_cat();
        cat.eat();
        cat.catchMouth();
        day05_homework2_dog dog = new day05_homework2_dog();
        dog.housekeeping();
        dog.sleep();
    }
}
