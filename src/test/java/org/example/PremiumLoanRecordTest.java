package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PremiumLoanRecordTest {

    @Test
    void deveRetornarLiberado() {
        PremiumLoanRecord loanRecord = new PremiumLoanRecord();
        loanRecord.setDiasAtraso(4);
        loanRecord.setValorDiario(2.0f);
        assertEquals("Liberado", loanRecord.verificarStatus());
    }

    @Test
    void deveRetornarBloqueado() {
        PremiumLoanRecord loanRecord = new PremiumLoanRecord();
        loanRecord.setDiasAtraso(6);
        loanRecord.setValorDiario(2.0f);
        assertEquals("Bloqueado", loanRecord.verificarStatus());
    }

    @Test
    void deveRetornarInformacoes() {
        PremiumLoanRecord loanRecord = new PremiumLoanRecord();
        loanRecord.setDiasAtraso(4);
        loanRecord.setValorDiario(2.0f);
        loanRecord.setTitulo("Livro A");
        loanRecord.setCodigo(1);
        assertEquals("PremiumLoanRecord{codigo=1, titulo='Livro A', status=Liberado}", loanRecord.getInfo());
    }
}
