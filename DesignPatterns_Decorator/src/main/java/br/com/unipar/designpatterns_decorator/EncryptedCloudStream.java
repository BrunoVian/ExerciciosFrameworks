/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_decorator;

/**
 *
 * @author not
 */
public class EncryptedCloudStream implements Stream {
    
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }
    
    
    @Override
    public void write(String data) {
        
        String encrypted = encrypt(data);
        
        stream.write(encrypted);
    }

    private String encrypt(String data) {
        
        return "!#@#)%$(FHG5$@#";

    }
}
