package com.example.sqlitedb;

public class CustomerModel {

    private int id;
    private String name;
    private int age;
    private Boolean isActivate;

    // constructors
    public CustomerModel(int id, String name, int age, Boolean isActivate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isActivate = isActivate;
    }

    // toString is necessary for printing the contents of a class object


    @Override
    public String toString() {
        return "CustomerModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isActivate=" + isActivate +
                '}';
    }

    // getter and setter
    public CustomerModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Boolean getActivate() {
        return isActivate;
    }

    public void setActivate(Boolean activate) {
        isActivate = activate;
    }
}
