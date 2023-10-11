/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_factorymethod_exercicio.hamburger;

/**
 *
 * @author not
 */
public class AngusHamburger implements Hamburger {
    @Override
    public void preparar() {
        System.out.println("Preparando o hamburger Angus.");
    }

    @Override
    public void cozinhar() {
        System.out.println("Cozinhando o hamburger Angus.");
    }

    @Override
    public void montar() {
        System.out.println("Montando o hamburger Angus.");
    }
}