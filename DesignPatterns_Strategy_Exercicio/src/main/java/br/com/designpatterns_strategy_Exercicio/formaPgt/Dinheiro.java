package br.com.designpatterns_strategy_Exercicio.formaPgt;

public class Dinheiro implements FormaPagamento{

    @Override
    public void pagamento(String descricao) {
    
        System.out.println("Dinheiro");
    
    }
    
    
    
}
