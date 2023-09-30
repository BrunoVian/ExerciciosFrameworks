
package br.com.designpatterns_strategy_Exercicio;

import br.com.designpatterns_strategy_Exercicio.formaPgt.APrazo;
import br.com.designpatterns_strategy_Exercicio.formaPgt.AVista;
import br.com.designpatterns_strategy_Exercicio.formaPgt.CartaoCredito;
import br.com.designpatterns_strategy_Exercicio.formaPgt.PaymentStorage;
import br.com.designpatterns_strategy_Exercicio.formaPgt.FormaPagamentoAleatoria;


public class DesignPatterns_Strategy_Exercicio {

    public static void main(String[] args) {
        
        PaymentStorage paymentStorage = new PaymentStorage();
        
        paymentStorage.store("Selecionado:", new FormaPagamentoAleatoria());
        paymentStorage.store("Selecionado:", new APrazo());
        paymentStorage.store("Selecionado: ", new AVista());
        paymentStorage.store("Selecionado: ", new CartaoCredito());
        
    }
}
