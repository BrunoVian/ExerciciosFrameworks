package br.com.designpatterns_strategy_Exercicio.formaPgt;


public class PaymentStorage {
    
    public void store(String descricao, FormaPagamento formaPagamento) {
        formaPagamento.pagamento(descricao);
    }
    
}
