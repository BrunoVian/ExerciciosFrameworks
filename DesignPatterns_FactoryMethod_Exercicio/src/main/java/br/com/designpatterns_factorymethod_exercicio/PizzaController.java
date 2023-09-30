package br.com.designpatterns_factorymethod_exercicio;

import br.com.designpatterns_factorymethod_exercicio.Pizza.ControllerPizza;

public class PizzaController extends ControllerPizza{

public void listProducts(){
    
       String nome = "Pizza de Calabresa";
       montarPizza(nome);
    }
}
