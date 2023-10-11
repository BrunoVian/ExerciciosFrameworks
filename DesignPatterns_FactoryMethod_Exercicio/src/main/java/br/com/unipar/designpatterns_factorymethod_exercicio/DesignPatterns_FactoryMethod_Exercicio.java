/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.unipar.designpatterns_factorymethod_exercicio;

import br.com.unipar.designpatterns_factorymethod_exercicio.Controller.HamburgerController;
import br.com.unipar.designpatterns_factorymethod_exercicio.hamburger.AngusHamburger;
import br.com.unipar.designpatterns_factorymethod_exercicio.hamburger.Hamburger;
import br.com.unipar.designpatterns_factorymethod_exercicio.view.AngusHamburgerView;
import br.com.unipar.designpatterns_factorymethod_exercicio.view.HamburgerView;

/**
 *
 * @author not
 */
public class DesignPatterns_FactoryMethod_Exercicio {

    public static void main(String[] args) {
        Hamburger angus = new AngusHamburger();
        HamburgerView angusView = new AngusHamburgerView(angus);
        HamburgerController angusController = new HamburgerController(angusView, angus);

        angusController.prepararHamburger();
        angusController.cozinharHamburger();
        angusController.montarHamburger();
    }
}
