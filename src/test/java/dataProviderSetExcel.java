import cn.afterturn.easypoi.excel.annotation.Excel;

import java.sql.Time;
import java.util.Date;

public class dataProviderSetExcel {
    @Excel(name = "Name")
    private String name;
    @Excel(name = "Age")
    private int age;
    @Excel(name = "Sex")
    private String sex;
    @Excel(name = "Address")
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "dataProviderSetExcel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}