import com.alibaba.fastjson.JSONObject;

public class jsondemo {
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "jsondemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer age;

    public static void main(String[] args) {
        String s = "{\"name\":\"123\",\"age\":123}";
        String s1 = "[{\"name\":\"123\",\"age\":123}]";
        //将json字符串转换成对象
        System.out.println(JSONObject.parseObject(s,jsondemo.class));
        //将json字符串(数组开头)转换成集合
        System.out.println(JSONObject.parseArray(s1,jsondemo.class));
        //将对象转换成字符串
        System.out.println(JSONObject.toJSONString(JSONObject.parseArray(s1,jsondemo.class)));

    }
}
