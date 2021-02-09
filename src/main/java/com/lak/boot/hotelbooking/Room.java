package com.lak.boot.hotelbooking;

import javax.persistence.*;

@Entity
@Table(name="ROOM")
public class Room {

    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name="NAME")
    private String name;
    @Column(name="ROOM_NUMBER")
    private String number;
    @Column(name="BED_INFO")
    private String info;

    public Room() {

    }

    public Room(long id, String name, String number, String info) {
        Id = id;
        this.name = name;
        this.number = number;
        this.info = info;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
