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
public class AngusHamburgerView extends HamburgerView {
    public AngusHamburgerView(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public void mostrarPreparo() {
        System.out.println("Mostrando o preparo do hamburger Angus.");
    }

    @Override
    public void mostrarCozimento() {
        System.out.println("Mostrando o cozimento do hamburger Angus.");
    }

    @Override
    public void mostrarMontagem() {
        System.out.println("Mostrando a montagem do hamburger Angus.");
    }
}