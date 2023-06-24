/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pr.senaccadastros.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 *
 * @author welly
 */

@Entity(name = "snc_cidade")
public class Cidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo_cidade")
    private Integer codigoCidade;
    
    @Column(name = "nome_cidade", length = 50, nullable = false)
    private String nomeCidade;
    
    @ManyToOne
    @JoinColumn(name="codigo_estado_fk")
    private Estado estado;

    /**
     * @return the nome
     */
    public String getNomeCidade() {
        return nomeCidade;
    }

    /**
     * @param nome the nome to set
     */
    public void setNomeCidade(String nome) {
        this.nomeCidade = nome;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * @return the codigoCidade
     */
    public Integer getCodigoCidade() {
        return codigoCidade;
    }

    /**
     * @param codigoCidade the codigoCidade to set
     */
    public void setCodigoCidade(Integer codigoCidade) {
        this.codigoCidade = codigoCidade;
    }
    
}
