package homework;

import java.util.Scanner;

public class day05_homework1_optimization {
    public static void main(String[] args) {
        //1班，2班，3班的这次考试分数分别为∶
        int[] classA = {65, 40, 66, 80, 90, 100, 45, 59};
        int[] classB = {60, 40, 68, 80, 95, 38, 45, 59};
        int[] classC = {60, 30, 68, 58, 93, 28, 45, 59};
        sum(classA);
        sum(classB);
        sum(classC);
    }

    public static void sum(int[] classN){
        //请求出每个班的及格人数。//A班的及格人数
        int Sum1 = 0;
        for (int i = 0; i < classN.length; i++) {
            //取出每个分数
            int score = classN[i];
            if (score >= 60) {
                Sum1++;
            }
        }
        System.out.println("及格人数为: " + Sum1);
    }
}
