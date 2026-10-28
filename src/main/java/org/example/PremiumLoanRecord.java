package org.example;

public class PremiumLoanRecord extends LoanRecord {

    public float getLimiteMulta() {
        return 10.0f;
    }

    @Override
    public String getTipo() {
        return "PremiumLoanRecord";
    }
}
