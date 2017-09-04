package com_Snigur_Oop_Bank.department;

import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;
import com_Snigur_Oop_Bank.interfaces.EmployeeInterface;
import com_Snigur_Oop_Bank.interfaces.ServicesInterface;

import java.util.ArrayList;

public abstract class AbstractDepartment implements DepartmentInterface {

    private String name;
    private ArrayList<EmployeeInterface> employeeList = new ArrayList<EmployeeInterface>();

    private ArrayList<ServicesInterface> servicesList = new ArrayList<ServicesInterface>();


    public AbstractDepartment() {
    }

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
        return servicesList;
    }

    public void setServicesList(ArrayList<ServicesInterface> servicesList) {
        this.servicesList = servicesList;
    }


    public void addEmployee(EmployeeInterface employee){
        employee.setDepartment(this);
        employeeList.add(employee);
    }
    public void addServices(ServicesInterface services){
        services.setDepartment(this);
        servicesList.add(services);
    }

}



