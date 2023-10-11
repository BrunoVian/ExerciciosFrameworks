/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatternsadapter_exercicio;

import br.com.unipar.designpatternsadapter_exercicio.GmailClient.GmailClient;

/**
 *
 * @author not
 */
public class GmailAdapter implements EmailProvider {
    private GmailClient gmailClient;

    public GmailAdapter() {
        this.gmailClient = new GmailClient();
    }

    @Override
    public void connect() {
        gmailClient.login();
    }

    @Override
    public void fetchEmails() {
        gmailClient.getEmails();
    }
    
}
