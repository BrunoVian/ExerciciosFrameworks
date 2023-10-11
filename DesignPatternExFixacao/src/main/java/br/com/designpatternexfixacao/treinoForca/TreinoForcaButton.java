package br.com.designpatternexfixacao.treinoForca;

import br.com.designpatternexfixacao.abstrasctFactory.Button;

public class TreinoForcaButton implements Button {

    @Override
    public void render() {

        System.out.println("Selecionou o Treino de Força Button!");

    }

}
