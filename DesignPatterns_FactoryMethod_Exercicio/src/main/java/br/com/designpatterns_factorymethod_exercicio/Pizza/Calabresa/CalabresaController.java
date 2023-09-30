package br.com.designpatterns_factorymethod_exercicio.Pizza.Calabresa;

import br.com.designpatterns_factorymethod_exercicio.Pizza.ControllerPizza;
import br.com.designpatterns_factorymethod_exercicio.Pizza.Pizza;

public class CalabresaController extends ControllerPizza{


    @Override
    protected Pizza createViewEngine(){
    return new CalabresaViewEngine();
    }
    
}
