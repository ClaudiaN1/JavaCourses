package dao;

import org.bson.types.ObjectId;

public final class User {
    private ObjectId id;
    private String name;
    private int age;
    private Address address;

    public User() {
    }

    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(" Name: ");
        s.append(this.name);
        s.append(" Age : ");
        s.append(this.age);
        s.append(" Address : ");
        s.append(this.address);
        return s.toString();
    }
}
