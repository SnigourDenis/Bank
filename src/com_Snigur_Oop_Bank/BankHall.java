package com_Snigur_Oop_Bank;

import com_Snigur_Oop_Bank.employeers.Consultant;
import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;
import com_Snigur_Oop_Bank.interfaces.VisitorInterface;

import java.io.File;
import java.util.ArrayList;

public class BankHall {

    private ArrayList<DepartmentInterface> departmentList;
    private String name;
    private ArrayList<VisitorInterface> visitorList;
    private Consultant consultants;

}
