/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.ltp3;

import java.util.ArrayList;
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
    private List<ItemVenda> itemVendas;
    private Pessoa pessoa;

    public int getCodigo() {
        return codigo;
    }

    public Venda() {
        this.valorTotal = 0;
        this.itemVendas = new ArrayList<ItemVenda>();
        this.valorTotal = 0;
    }

    public void setCodigo(int codigoVenda) {
        if (codigo > 0) {
            this.codigo = codigoVenda;
        }
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

    public void addItemVenda(ItemVenda itemVenda) {

        if (!this.itemVendas.contains(itemVenda)) {
            this.itemVendas.add(itemVenda);
        }
    }

    public void removeItemVenda(ItemVenda itemVenda) {
        if (this.itemVendas.contains(itemVenda)) {
            this.itemVendas.remove(itemVenda);
        }
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        if (pessoa != null) {
            this.pessoa = pessoa;
        }
    }
}
