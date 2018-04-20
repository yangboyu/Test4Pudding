package family.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yangboyu on 17/3/19.
 */
public class User implements Serializable {

//    public User(){
//        id = 10;
//        name = "pudding";
//        pwd = "2017-02-05";
//        age = 1;
//        creatTime = new Date();
//    }
    /**
     * @author zjn
     */
    private static final long serialVersionUID = 1L;
    private Integer id; // id
    private String name; // name
    private String pwd; // pwd
    private Integer age; // age
    private Date creatTime; // creatTime

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        return String.format("id:%s,name:%s,age:%s", id, name, age);
    }
}
