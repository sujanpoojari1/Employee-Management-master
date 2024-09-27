package com.EmpManagement.EmpManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class EmpInfo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String ename;
    private double esal;
    private String edept;
    private int edeptno;

    public EmpInfo(long id, String ename, double esal, String edept, int edeptno) {
        this.id = id;
        this.ename = ename;
        this.esal = esal;
        this.edept = edept;
        this.edeptno = edeptno;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsal() {
        return esal;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }

    public String getEdept() {
        return edept;
    }

    public void setEdept(String edept) {
        this.edept = edept;
    }

    public int getEdeptno() {
        return edeptno;
    }

    public void setEdeptno(int edeptno) {
        this.edeptno = edeptno;
    }
}
