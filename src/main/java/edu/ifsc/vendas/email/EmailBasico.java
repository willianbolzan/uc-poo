package edu.ifsc.vendas.email;


import edu.ifsc.vendas.Email;

public class EmailBasico implements Email {
    private String email;
    public EmailBasico(String email) {
        this.email = email;
    }
    @Override
    public String valor() {
        return this.email;
    }
}
