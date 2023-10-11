/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.designpatterns_strategy_Exercicio.formaPgt;

/**
 *
 * @author not
 */
public class Bitcoin implements FormaPagamento {

    @Override
    public void pagamento(String descricao) {

        System.out.println("Bitcoin");

    }

}
