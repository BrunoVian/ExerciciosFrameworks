package br.com.designpatterns_factorymethod_exercicio.Pizza;

import java.util.Map;

public class ControllerPizza {

public void montarPizza(String pizzaName) {
       Pizza engine = createViewEngine();
        String html = engine.montarPizza(pizzaName);
        System.out.println(html);
    }

    protected Pizza createViewEngine(){
    return new PizzaViewEngine();
    }
    
}
