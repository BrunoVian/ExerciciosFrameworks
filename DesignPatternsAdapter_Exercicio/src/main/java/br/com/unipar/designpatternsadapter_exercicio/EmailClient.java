/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatternsadapter_exercicio;

/**
 *
 * @author not
 */
public class EmailClient {

    private EmailProvider provider;

    public EmailClient(EmailProvider provider) {
        this.provider = provider;
    }

    public void checkEmails() {
        provider.connect();
        provider.fetchEmails();
    }

}
