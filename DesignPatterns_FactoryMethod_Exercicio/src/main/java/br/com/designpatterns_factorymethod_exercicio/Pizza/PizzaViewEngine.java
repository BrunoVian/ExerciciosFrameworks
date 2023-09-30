package br.com.designpatterns_factorymethod_exercicio.Pizza;

import java.util.Map;

public class PizzaViewEngine implements Pizza{

    String[] vetorPizza = {"Massa", "Molho", "Queijo", "Carne"};
    
    public String montarPizza(String nomePizza) {
        StringBuilder builder = new StringBuilder();
        builder.append("Pizza: ");
        
        for (String item : vetorPizza) {
            builder.append(item).append(", ");
        }

        if (vetorPizza.length > 0) {
            builder.delete(builder.length() - 2, builder.length());
        }

        return builder.toString();
    }



    
}
