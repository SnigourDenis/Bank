package com_Snigur_Oop_Bank.client;

public class VipVisitor extends AbstractVisitor {

    private float discountOnCredit;

    public VipVisitor(String name) {
        super(name);
    }


    /*@Override
    public void getCredit() {

        if (!chechDiscount()) {
            super.getCredit();
        } else {
           //взять кредит со скидкой
        }
    }
*/
    private boolean chechDiscount(){
        return discountOnCredit >0;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

