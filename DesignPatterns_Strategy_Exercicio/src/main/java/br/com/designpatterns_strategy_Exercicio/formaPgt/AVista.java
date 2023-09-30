package br.com.designpatterns_strategy_Exercicio.formaPgt;

public class AVista implements FormaPagamento{

    @Override
    public void pagamento(String descricao) {
    
        System.out.println("À Vista");
    
    }
    
    
    
}
