package com_Snigur_Oop_Bank;

import com_Snigur_Oop_Bank.employeers.Consultant;
import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;
import com_Snigur_Oop_Bank.interfaces.VisitorInterface;

import java.io.File;
import java.util.ArrayList;

public class BankHall {

    private String name;

    private ArrayList<DepartmentInterface> departmentList = new ArrayList<DepartmentInterface>();

    private ArrayList<VisitorInterface> visitorList = new ArrayList<VisitorInterface>();

    private ArrayList<DepartmentInterface> getDepartmentList(){
        return departmentList;

    }
    public void addDepartment(DepartmentInterface department){
        departmentList.add(department);
    }
    public void addVisitor(VisitorInterface visitor){
        visitorList.add(visitor);
    }
}
