/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_factorymethod_exercicio.Controller;

import br.com.unipar.designpatterns_factorymethod_exercicio.hamburger.Hamburger;
import br.com.unipar.designpatterns_factorymethod_exercicio.view.HamburgerView;

/**
 *
 * @author not
 */
public class HamburgerController {

    private HamburgerView view;
    private Hamburger hamburger;

    public HamburgerController(HamburgerView view, Hamburger hamburger) {
        this.view = view;
        this.hamburger = hamburger;
    }

    public void prepararHamburger() {
        hamburger.preparar();
        view.mostrarPreparo();
    }

    public void cozinharHamburger() {
        hamburger.cozinhar();
        view.mostrarCozimento();
    }

    public void montarHamburger() {
        hamburger.montar();
        view.mostrarMontagem();
    }
}
