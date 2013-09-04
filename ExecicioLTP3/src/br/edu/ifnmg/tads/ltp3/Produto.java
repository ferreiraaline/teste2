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
public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private String Descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Pattern patternNome= Pattern.compile("[a-z A-Z\\w\\s]{3,}");
        Matcher comparar =patternNome.matcher(nome);
        
        if(comparar.matches()){
            this.nome=nome;     
        }
    }

    public double getPreco() {
                  
           return preco;
      
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
}
