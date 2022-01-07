package cn.bdqn.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "user")
//@PropertySource(value = {"classpath:user2.properties"}) // 读取properties类型的文件
public class User {

    private String username;

    private Integer age;

    private Date born;

    private Boolean sex;

    private Map<String,String> parent;

    private List<String> idCards;

    private List<Address> addressList;

    private Address address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Map<String, String> getParent() {
        return parent;
    }

    public void setParent(Map<String, String> parent) {
        this.parent = parent;
    }

    public List<String> getIdCards() {
        return idCards;
    }

    public void setIdCards(List<String> idCards) {
        this.idCards = idCards;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", born=" + born +
                ", sex=" + sex +
                ", parent=" + parent +
                ", idCards=" + idCards +
                ", addressList=" + addressList +
                ", address=" + address +
                '}';
    }
}
