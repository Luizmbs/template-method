package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardLoanRecordTest {

    @Test
    void deveRetornarLiberado() {
        StandardLoanRecord loanRecord = new StandardLoanRecord();
        loanRecord.setDiasAtraso(2);
        loanRecord.setValorDiario(2.0f);
        assertEquals("Liberado", loanRecord.verificarStatus());
    }

    @Test
    void deveRetornarBloqueado() {
        StandardLoanRecord loanRecord = new StandardLoanRecord();
        loanRecord.setDiasAtraso(3);
        loanRecord.setValorDiario(2.0f);
        assertEquals("Bloqueado", loanRecord.verificarStatus());
    }

    @Test
    void deveRetornarInformacoes() {
        StandardLoanRecord loanRecord = new StandardLoanRecord();
        loanRecord.setDiasAtraso(3);
        loanRecord.setValorDiario(2.0f);
        loanRecord.setTitulo("Livro A");
        loanRecord.setCodigo(2);
        assertEquals("LoanRecord{codigo=2, titulo='Livro A', status=Bloqueado}", loanRecord.getInfo());
    }
}
