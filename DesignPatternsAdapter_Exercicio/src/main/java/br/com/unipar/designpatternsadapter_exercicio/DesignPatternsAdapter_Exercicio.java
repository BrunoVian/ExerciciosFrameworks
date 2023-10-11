package br.com.unipar.designpatternsadapter_exercicio;

/**
 *
 * @author not
 */
public class DesignPatternsAdapter_Exercicio {

    public static void main(String[] args) {
        EmailProvider gmailAdapter = new GmailAdapter();
        EmailClient emailClient = new EmailClient(gmailAdapter);
        emailClient.checkEmails();
    }
}
