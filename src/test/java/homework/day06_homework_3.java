package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class day06_homework_3 {
    public static void main(String[] args) {
        method1("12345abcde");
        method2("12345abcde");
    }

    public static void method1(String s){
        StringBuffer s1 = new StringBuffer(s);
        System.out.println(s1.reverse());
    }
    public static void method2(String s){
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
