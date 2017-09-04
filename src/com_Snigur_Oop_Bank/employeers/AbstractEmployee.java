package com_Snigur_Oop_Bank.employeers;

import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;
import com_Snigur_Oop_Bank.interfaces.EmployeeInterface;

public abstract class AbstractEmployee implements EmployeeInterface {
    private String name;
    private DepartmentInterface department;
    private double experience;
    private boolean free; // индикатор свободен или нет


    public AbstractEmployee() {
    }

    public AbstractEmployee(String name) {
        this.name = name;
    }

    public AbstractEmployee(String name, DepartmentInterface department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
