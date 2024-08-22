package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.example.embed.FullName;

@Entity/* entity eke namath customer wenawa */
/*@Table(name = "test")  hibernate eka ethuledi entity eke nama wenas wenne ne table eke nama wenas karannawa witharai*/
public class Student {

    @Id
    private String Id;
    private FullName name;

    private String address;

    public Student() {
    }

    public Student(String id, FullName name, String address) {
        Id = id;
        this.name = name;
        this.address = address;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
