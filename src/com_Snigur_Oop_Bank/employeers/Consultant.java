package com_Snigur_Oop_Bank.employeers;

import com_Snigur_Oop_Bank.enums.ConsultResult;
import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;
import com_Snigur_Oop_Bank.interfaces.VisitorInterface;

public class Consultant extends AbstractEmployee {


    public Consultant() {
    }

    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(VisitorInterface visitor){
        super.setFree(false);
        // консультант уговаривает взять кредит =)
        return ConsultResult.GETCREDIT;
    }

    public void send(){

    }

}
