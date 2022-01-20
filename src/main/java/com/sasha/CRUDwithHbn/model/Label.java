package com.sasha.CRUDwithHbn.model;

import javax.persistence.*;

@Entity
@Table (name = "labels", schema = "practic")
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Label(){

    }

    public Label(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
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

    @Override
    public String toString() {
        return "Label{" +
                "id =" + id +
                "| name ='" + name + '\'' +
                '}';
    }
}
