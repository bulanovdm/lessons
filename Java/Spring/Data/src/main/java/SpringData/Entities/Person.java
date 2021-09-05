package SpringData.Entities;

import java.util.Date;


public class Person {

    long id;
    private String name;
    private int age;
    private int phone;
    private Address address;
    private Date birthday;

    public Person() {
    }

    public Person(String name, int age, int phone, Address address, Date birthday) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.birthday = birthday;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", address=" + address +
                ", birthday=" + birthday +
                '}';
    }
}
