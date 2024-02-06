package com.testExample.practice.set.model.vo;

import java.util.Objects;

public class Lottery {

    private String name;
    private String phone;
    private String winner;

    public Lottery(String name, String phone, String winner) {
        this.name = name;
        this.phone = phone;
        this.winner = winner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Lottery lottery = (Lottery) obj;
        return Objects.equals(name, lottery.name) && Objects.equals(phone, lottery.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

}
