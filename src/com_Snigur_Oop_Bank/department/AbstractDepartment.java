package com_Snigur_Oop_Bank.department;

import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;
import com_Snigur_Oop_Bank.interfaces.EmployeeInterface;
import com_Snigur_Oop_Bank.interfaces.ServicesInterface;

import java.util.ArrayList;

public abstract class AbstractDepartment implements DepartmentInterface {

    private String name;
    private ArrayList<EmployeeInterface> employeeList;
    private ArrayList<ServicesInterface> ServicesList;


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<ServicesInterface> getServicesList() {
        return ServicesList;
    }

    public void setServicesList(ArrayList<ServicesInterface> servicesList) {
        ServicesList = servicesList;
    }


    public void addEmployee(EmployeeInterface employee){

    }


}



