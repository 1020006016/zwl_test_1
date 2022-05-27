package homework;

public class day03_homework {
    public static void main(String[] args) {
        //1.打印三角形(嵌套)
        triangle();
        //2.打印下面的数据(嵌套)
        data();
        //2.打印下面的数据 better(单层循环)
        data_better();
        //3.求[0,100]之间所有偶数和以及奇数和
        sum();
    }
    //1.打印三角形
    public static void triangle(){
        //行数
        for(int i=0;i<5;i++){
            //个数
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //2.打印下面的数据
    public static void data(){
        //行数
        for(int i=1;i<=3;i++){
            System.out.println();
            //个数
            for(int j=1;j<=3;j++){
                System.out.print(j+((i-1))*3 +" ");
            }
        }
    }

    //2.打印下面的数据 better(单层循环)
    public static void data_better(){
        System.out.println("\n");
        //个数
        for(int i=1;i<=9;i++){
            System.out.print(i+" ");
            //换行
            if (i%3==0){
                System.out.println();
            }
        }
    }
    //3.求[0,100]之间所有偶数和以及奇数和
    public static void sum(){
        int j=0;
        int o=0;
        for (int i=0;i<=100;i++){
            if(i%2==0){
                o+=i;
            }
            else {
                j+=i;
            }
        }
        System.out.println("奇数和为:"+j);
        System.out.println("偶数和为:"+o);
    }
}
