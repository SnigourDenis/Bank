package com_Snigur_Oop_Bank.interfaces;

import java.util.ArrayList;

/**
 * Created by 1 on 31.08.2017.
 */
public interface DepartmentInterface {

    String getName();
    ArrayList<EmployeeInterface> getEmployeeList();
    ArrayList<ServicesInterface> getServicesList();


}


