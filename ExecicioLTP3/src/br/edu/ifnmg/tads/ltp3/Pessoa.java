/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;


import java.awt.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aline
 */
public class Pessoa {
    private int codigo;
    private String nome;
    private String cpf;
    private ArrayList<Endereco> endereco;
    private ArrayList<Email> email;
    private ArrayList<Venda> venda;

    public Pessoa() {
        this.email = new ArrayList<Email>();
    }
    
    
    /**
     *
     * @return
     */
    public List<Email> getEmail(){
        return email;
        
    }
  
    public void add (Email email){
        
        if(!this.email.contains(email)){
            this.email.add(email);
        }
    }

    public void removeEmail (Email email){
        if (this.email.contains(email)){
            this.email.remove(email);
        }
    }
    
     public List<Endereco> getEndereco(){
        return endereco;
        
    }
    
    public void add (Endereco endereco){
        
        if(!this.endereco.contains(endereco)){
            this.endereco.add(endereco);
        }
    }

    public void removeEndereco(Endereco endereco){
        if (this.endereco.contains(endereco)){
            this.endereco.remove(endereco);
        }
    }
    
   
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        Pattern patternCpf= Pattern.compile("\\d{3}.\\d{3}.\\d{3}-\\d{2}");
        Matcher comparar= patternCpf.matcher(cpf);
        if(comparar.matches()){
            this.cpf=cpf;
        }
               
    }
}
