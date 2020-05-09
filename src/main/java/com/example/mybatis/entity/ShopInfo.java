package com.example.mybatis.entity;

import java.util.List;

public class ShopInfo {
    private int id;
    private String name;
    private List<Integer> myScope;


    @Override
    public String toString() {
        return "ShopInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", myScope=" + myScope +
                '}';
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

    public List<Integer> getMyScope() {
        return myScope;
    }

    public void setMyScope(List<Integer> myScope) {
        this.myScope = myScope;
    }

}
