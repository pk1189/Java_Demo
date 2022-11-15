package org.example;

public class Account {
    long accno;
    String name;
    float bal;
    String type;

    public long getAccno() {
        return accno;
    }

    public void setAccno(long accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBal() {
        return (int) bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
