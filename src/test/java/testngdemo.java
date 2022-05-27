import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngdemo {

    @BeforeClass
    public void testBefore1(){
        System.out.println("testBefore1");
    }

    @AfterClass
    public void testAfter1(){
        System.out.println("testAfter1");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    @Parameters({"key","value"})
    public void test3(String key,String value){
        System.out.println("key:"+key +"/t"+"value:"+value);
    }
}
