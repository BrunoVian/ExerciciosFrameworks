
package br.com.designpatterns_strategy_Exercicio.formaPgt;

public class FormaPagamentoAleatoria implements FormaPagamento{

    @Override
    public void pagamento(String descricao) {
        
        System.out.println("Alguma forma de pagamento aleatória.");
        
    }
    
}
