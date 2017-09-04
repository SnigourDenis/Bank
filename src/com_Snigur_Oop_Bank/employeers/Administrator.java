package com_Snigur_Oop_Bank.employeers;

import com_Snigur_Oop_Bank.BankHall;
import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;
import com_Snigur_Oop_Bank.interfaces.EmployeeInterface;

public class Administrator {

    private BankHall bankHall;

    public Administrator(BankHall bankHall) { //к какому торговому залу относится
        this.bankHall = bankHall;
    }

    public Consultant getFreeConsultant(DepartmentInterface departmentInterface) {
        for (EmployeeInterface employee : departmentInterface.getEmployeeList()) {
            if (employee instanceof Consultant) {
                if (employee.isFree()) {
                    return (Consultant) employee;
                }
            }
        }
    return null;
    }
}
