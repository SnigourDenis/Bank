package com_Snigur_Oop_Bank.services;

import com_Snigur_Oop_Bank.department.AbstractDepartment;
import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;
import com_Snigur_Oop_Bank.interfaces.ServicesInterface;

public abstract class AbstractServices implements ServicesInterface {

    private String name;
    private String nameOfBank;
    private AbstractDepartment department;


    public static void print(String message){
        System.out.println("message = " + message);
    }

    public AbstractServices(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNameOfBank() {
        return nameOfBank;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }
}

