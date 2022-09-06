package base;

/**
 * 我的自定义数据结构类型
 *
 */
public class MyParamDetail {
    private String id;

    private String number;

    private String sex;

    private String name;

    private Integer age;

    public MyParamDetail(){
        id = "123456";
        number = "155";
        sex = "male";
        name = "fan";
        age = 22;
    }

    public void setID(String set_id)
    {
        id = set_id;
    }

    public void setNumber(String set_number)
    {
        number = set_number;
    }

    public void setSex(String set_sex)
    {
        sex = set_sex;
    }

    public void setName(String set_name)
    {
        name = set_name;
    }

    public void setAge(Integer set_age)
    {
        age = set_age;
    }




    public String getID()
    {
        return id;
    }

    public String getNumber()
    {
        return number;
    }

    public String getSex()
    {
        return sex;
    }

    public String getName()
    {
        return name;
    }

    public Integer getAge()
    {
        return age;
    }
}
