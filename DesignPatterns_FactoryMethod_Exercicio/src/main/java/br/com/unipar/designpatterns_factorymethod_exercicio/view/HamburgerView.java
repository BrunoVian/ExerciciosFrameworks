/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_factorymethod_exercicio.view;

import br.com.unipar.designpatterns_factorymethod_exercicio.hamburger.Hamburger;

/**
 *
 * @author not
 */
public abstract class HamburgerView {
    
    protected Hamburger hamburger;

    public HamburgerView(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public abstract void mostrarPreparo();
    public abstract void mostrarCozimento();
    public abstract void mostrarMontagem();

    
}
