/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_factorymethod_exercicio.viewengine;

import br.com.unipar.designpatterns_factorymethod_exercicio.view.HamburgerView;

/**
 *
 * @author not
 */
public class ViewEngine {

    public void renderizar(HamburgerView view) {
        view.mostrarPreparo();
        view.mostrarCozimento();
        view.mostrarMontagem();
    }
}
