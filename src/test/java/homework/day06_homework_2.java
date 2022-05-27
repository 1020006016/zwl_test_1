package homework;

public class day06_homework_2 {
    public static void main(String[] args) {
        String s = "Tom:20|Jack:22|Rose:24";
        for(String s1:s.split("\\|")){
            for(String s2:s1.split(":")){
                if(s2.matches("[0-9]+")){
                    System.out.print("年龄: "+s2+"岁");
                }
                else {
                    System.out.print("姓名: "+s2+", ");
                }
            }
            System.out.println();
        }
    }


}
