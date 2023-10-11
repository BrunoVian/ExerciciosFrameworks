
package br.com.designpatterns_strategy_Exercicio;

import br.com.designpatterns_strategy_Exercicio.formaPgt.Paypal;
import br.com.designpatterns_strategy_Exercicio.formaPgt.Dinheiro;
import br.com.designpatterns_strategy_Exercicio.formaPgt.CartaoCredito;
import br.com.designpatterns_strategy_Exercicio.formaPgt.PaymentStorage;
import br.com.designpatterns_strategy_Exercicio.formaPgt.FormaPagamentoAleatoria;


public class DesignPatterns_Strategy_Exercicio {

    public static void main(String[] args) {
        
        PaymentStorage paymentStorage = new PaymentStorage();
        
        paymentStorage.store("Selecionado:", new FormaPagamentoAleatoria());
        paymentStorage.store("Selecionado:", new Paypal());
        paymentStorage.store("Selecionado: ", new Dinheiro());
        paymentStorage.store("Selecionado: ", new CartaoCredito());
        
    }
}
