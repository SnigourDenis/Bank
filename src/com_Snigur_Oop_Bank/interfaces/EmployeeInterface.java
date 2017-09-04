package com_Snigur_Oop_Bank.interfaces;

/**
 * Created by 1 on 31.08.2017.
 */
public interface EmployeeInterface {

    String getName();
    DepartmentInterface getDepartment();

    //  указываем сотруднику к какому отделу относится
  void setDepartment(DepartmentInterface department);

    boolean isFree();


}
