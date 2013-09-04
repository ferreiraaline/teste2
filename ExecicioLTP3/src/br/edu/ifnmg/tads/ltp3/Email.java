/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aline
 */
public class Email {
    private int codigo;
    private String email;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigoEm(int codigoEmail) {
        this.codigo = codigoEmail;
    }

    public String getEmail() {
        
        return email;
    }

    public void setEmail(String email) {
        Pattern patternEmail;
        patternEmail = Pattern.compile("A-Za-z 0-9\\._-]{3,250}+@[a-zA-Z]+\\.[a-zA-Z]+");
        Matcher comparar ;
        comparar = patternEmail.matcher(email);
        if(comparar.matches()){
          this.email = email;   
        }
        
    }
  
}
