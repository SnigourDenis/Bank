package com_Snigur_Oop_Bank.interfaces;

/**
 * Created by 1 on 31.08.2017.
 */
public interface CreditInterface extends ServicesInterface {

    @Override
    String getName();

    void getCredit(); //Кредит взят

    void repayCredit(); //Погасить кредит

    @Override
    DepartmentInterface getDepartment();
    @Override
    void setDepartment(DepartmentInterface department);


}
