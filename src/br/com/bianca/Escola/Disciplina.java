/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bianca.Escola;

import java.util.Date;

/**
 *
 * @author bianca.149817
 */
public class Disciplina extends Pessoa{
   private String Nome,departamento;
   private char status;

    public Disciplina(String Nome, String departamento, char status, String nome, String rg, String cpf, int idade, Date dataNascimanto) {
        super(nome, rg, cpf, idade, dataNascimanto);
        this.Nome = Nome;
        this.departamento = departamento;
        this.status = status;
    }

    
   
   
    @Override
    public String toString() {
        return "Disciplina{" + "nome=" + Nome + ", departamento=" + departamento + ", status=" + status + '}';
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
   
   
}
