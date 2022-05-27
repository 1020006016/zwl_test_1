package homework;

public class day02_homework {
    public static void main(String[] args) {
        //一维数组-1
        String[] a1 = new String[5];
        a1[0]="我";
        a1[1]="是";
        a1[2]="最";
        a1[3]="棒";
        a1[4]="的";
        for (String a11: a1) {
            System.out.print(a11);
        }
        System.out.println();

        //一维数组-2
        String[] a2 ={"我","是","最","棒","的"};
        for (String a22: a2) {
            System.out.print(a22);
        }
        System.out.println();

        //二维数组-1
        String[][] a21 = new String[2][2];
        a21[0][0]="第一个";
        a21[0][1]="二维";
        a21[1][0]="数";
        a21[1][1]="组";
        for (String[] a211: a21) {
            for (String a2111:a211) {
                System.out.print(a2111);
            }
        }
        System.out.println();

        //二维数组-2
        String[][] a22 ={{"第一个","二维"},{"数","组"}};
        for (String[] a221: a22) {
            for (String a2211:a221) {
                System.out.print(a2211);
            }
        }

        int x = 1;int y = 2;int z = 3;
//        求：x/y  答: x/y=0; x/y数值运算上为0.5,但是由于是int类型,所以会舍弃小数点后位数取0.
//        求：y/x  答: y/x=2;
//        求：x%y  答: x%y=1 当使用除余操作符时,x%任何大于x的数得到的都是x本身.
//        求：y%x  答: y%x=0 2/1能除尽,余0.
//        求：(++x)+y  答:(++x)+y=4; ++x代表先自增再使用值,如果是x++则是先使用值再自增,(x++)+y=3;
    }



}
