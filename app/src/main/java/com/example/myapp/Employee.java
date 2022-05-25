package com.example.myapp;

public class Employee {
    String ename;
    int eage;
    boolean isElgible;

    public Employee(String eName, int eAge, boolean isElgible) {
        this.ename = ename;
        this.eage = eage;
        this.isElgible = isElgible;
    }

    public String geteName() {
        return ename;
    }

    public void seteName(String name) {
        this.ename = ename;
    }

    public int geteAge() {
        return eage;
    }

    public void seteAge(int eage) {
        this.eage = eage;
    }

    public boolean isElgible() {
        return isElgible;
    }

    public void setElgible(boolean elgible) {
        isElgible = elgible;
    }

}

