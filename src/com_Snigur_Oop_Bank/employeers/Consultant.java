package com_Snigur_Oop_Bank.employeers;

import com_Snigur_Oop_Bank.enums.ConsultResult;
import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;
import com_Snigur_Oop_Bank.interfaces.VisitorInterface;

public class Consultant extends AbstractEmployee {


    public Consultant() {
    }

    public Consultant(String name, DepartmentInterface department) {
        super(name, department);
    }

    public ConsultResult consult(VisitorInterface visitor){
        super.setFree(false);
        // Когда консультант дает консультацию, он становится falce

        // консультант уговаривает взять кредит =)
        return ConsultResult.GETCREDIT;
    }


    //консультант будет привязан к какому-либо отделу
    @Override
    public void setDepartment(DepartmentInterface department) {
        super.setDepartment(department);
    }


    public void send(){

    }

}
