package io.zipcoder.persistenceapp.Models;

import io.zipcoder.persistenceapp.Models.Employee;

import javax.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deptID;
    private String deptName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true, name = "manager_id")
    private Employee manager;


    public Department(Long deptID, String deptName) {
        this.deptID = deptID;
        this.deptName = deptName;
    }

    public Department() {
    }

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public Long getDeptID() {
        return deptID;
    }

    public void setDeptID(Long deptID) {
        this.deptID = deptID;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
