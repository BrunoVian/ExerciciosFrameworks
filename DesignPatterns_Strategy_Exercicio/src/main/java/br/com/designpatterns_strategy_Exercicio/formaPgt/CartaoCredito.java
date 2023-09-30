package br.com.designpatterns_strategy_Exercicio.formaPgt;

public class CartaoCredito implements FormaPagamento{

    @Override
    public void pagamento(String descricao) {
        
        System.out.println("Cartão de Crédito");
        
    }


    
}
