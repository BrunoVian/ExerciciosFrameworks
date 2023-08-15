package br.com.designpatternexfixacao.app;

import br.com.designpatternexfixacao.abstrasctFactory.WidgetFactory;

public class ContactForm {
    
    public void render(WidgetFactory factory){   
        factory.createButton().render();
        factory.createTextBox().render();
    }
}