package com_Snigur_Oop_Bank.employeers;

import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;
import com_Snigur_Oop_Bank.interfaces.EmployeeInterface;

public abstract class AbstractEmployee implements EmployeeInterface {
    private String name;
    private DepartmentInterface department;
    private byte experience;
    private boolean free; // индикатор свободен или нет


    public AbstractEmployee() {
    }

    public AbstractEmployee(String name) {
        this.name = name;
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

    public byte getExperience() {
        return experience;
    }

    public void setExperience(byte experience) {
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
