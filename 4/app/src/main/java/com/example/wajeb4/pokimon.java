package com.example.wajeb4;

import java.io.Serializable;

public class pokimon implements Serializable {



 private String name;
 private int image ;
 private  int attac ;
 private int defence ;
 private int total ;


    public pokimon(String name, int image, int attac, int defence, int total) {
        this.name = name;
        this.image = image;
        this.attac = attac;
        this.defence = defence;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getAttac() {
        return attac;
    }

    public void setAttac(int attac) {
        this.attac = attac;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
