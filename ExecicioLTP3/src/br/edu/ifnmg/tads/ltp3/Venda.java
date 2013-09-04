/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

import java.util.Date;
import java.util.List;



/**
 *
 * @author Aline
 */
public class Venda {
    private int codigo;
    private Date data;
    private double valorTotal;
    private List<ItemVenda> itemVenda;

    public int getCodigoVenda() {
        return codigo;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigo = codigoVenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        
        this.valorTotal += valorTotal;
    }

    
}
