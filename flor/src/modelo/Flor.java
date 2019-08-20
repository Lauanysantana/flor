/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Flor {
    private Double tamanho_da_sepala;
    private Double tamanho_da_petala;
    private String nome_cientifico;
    private String nome_popular;
    private int ano;
    private int codigo;

    public Double getTamanho_da_sepala() {
        return tamanho_da_sepala;
    }

    public void setTamanho_da_sepala(Double tamanho_da_sepala) {
        this.tamanho_da_sepala = tamanho_da_sepala;
    }

    public Double getTamanho_da_petala() {
        return tamanho_da_petala;
    }

    public void setTamanho_da_petala(Double tamanho_da_petala) {
        this.tamanho_da_petala = tamanho_da_petala;
    }

    public String getNome_cientifico() {
        return nome_cientifico;
    }

    public void setNome_cientifico(String nome_cientifico) {
        this.nome_cientifico = nome_cientifico;
    }

    public String getNome_popular() {
        return nome_popular;
    }

    public void setNome_popular(String nome_popular) {
        this.nome_popular = nome_popular;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Flor{" + "nome_popular=" + nome_popular + '}';
    }
    
}
