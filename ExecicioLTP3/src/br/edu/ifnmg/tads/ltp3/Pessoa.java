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
    private ArrayList<Email> emails;


    public Pessoa() {
        this.emails = new ArrayList<Email>();
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo>0){
          this.codigo = codigo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Pattern patternNome= Pattern.compile("[\\w\\s]{3,250}");
        Matcher comparar= patternNome.matcher(nome);
        if(comparar.matches()){
         this.nome = nome;   
        }
        
    }
    
  
    public void addEmail (Email email){
        
        if(!this.emails.contains(email)){
            this.emails.add(email);
        }
    }

    public void removeEmail (Email email){
        if (this.emails.contains(email)){
            this.emails.remove(email);
        }
    }
    
    
    public void addEndereco (Endereco endereco){
        
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
