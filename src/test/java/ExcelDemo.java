import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class ExcelDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("src/test/resources/DataSets.xlsx");
        ImportParams ips = new ImportParams();
        //设置Excel中sheet的位置,默认0也就是第一个表格.
        //ips.setStartSheetIndex(1);
        //设置Excel中sheet的个数,默认1也就是一个表格.
        //ips.setSheetNum(2);
        //List<ExcelDemoClass> list = ExcelImportUtil.importExcel(fis,ExcelDemoClass.class,ips);
        List<dataProviderSetExcel> list = ExcelImportUtil.importExcel(fis,dataProviderSetExcel.class,ips);

        System.out.println(list);
    }


}
