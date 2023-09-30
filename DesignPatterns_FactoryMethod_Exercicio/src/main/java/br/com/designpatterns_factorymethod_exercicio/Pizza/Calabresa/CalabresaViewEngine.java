package br.com.designpatterns_factorymethod_exercicio.Pizza.Calabresa;

import br.com.designpatterns_factorymethod_exercicio.Pizza.Pizza;

public class CalabresaViewEngine implements Pizza{

    private String[] vetorCalabresa = {"Massa", "Molho", "Queijo", "Calabresa"};
    
    public String montarPizza(String pizzaName) {
        StringBuilder builder = new StringBuilder();
        builder.append("Pizza Calabresa: ");
        
        for (String item : vetorCalabresa) {
            builder.append(item).append(", ");
        }

        if (vetorCalabresa.length > 0) {
            builder.delete(builder.length() - 2, builder.length());
        }

        return builder.toString();
    }


    
}
