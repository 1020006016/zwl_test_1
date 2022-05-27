import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class dataProvider {
    @Test(dataProvider = "datas")
    public void test1(String name ,int password){
        System.out.println("name = " + name + ", password = " + password);
    }
    @DataProvider
    public Object[][] datas(){
        Object[][] datas = {
            {"张三",123},
            {"李四",123},
            {"王五",123}
        };
        return datas;
    }

    @Test(dataProvider = "datas2")
    public void test2(dataProviderUser user){
        System.out.println("name = " + user.getName() + ", password = " + user.getPassword());
    }
    @DataProvider
    public Object[] datas2(){
        dataProviderUser user = new dataProviderUser();
        user.setName("张三");
        user.setPassword("123");
        Object[] datas2 = {user};
        return datas2;
    }

    @Test(dataProvider = "data3")
    public void test3(dataProviderSetExcel dpse){
        System.out.println(dpse.toString());
    }
    @DataProvider
    public Object[] data3() throws Exception {
        FileInputStream fis = new FileInputStream("src/test/resources/DataSets.xlsx");
        ImportParams ips = new ImportParams();
        List<dataProviderSetExcel> list = ExcelImportUtil.importExcel(fis,dataProviderSetExcel.class,ips);
        return list.toArray();
    }
}
