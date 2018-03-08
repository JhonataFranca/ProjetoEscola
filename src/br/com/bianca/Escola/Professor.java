/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bianca.Escola;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bianca.149817
 */
public class Professor extends Pessoa {
 private  ArrayList disciplina;
 private int cargaHoraria;
 private float valorHora,salario;

    public Professor(ArrayList disciplina, int cargaHoraria, float valorHora, float salario, String nome, String rg, String cpf, int idade, Date dataNascimanto) {
        super(nome, rg, cpf, idade, dataNascimanto);
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = salario;
    }
 
 public float calcularsalario(float cargaHoraria,float valorHora){
     return cargaHoraria * valorHora;
 }

    @Override
    public String toString() {
        return "Professor{" + "disciplina=" + disciplina + ", cargaHoraria=" + cargaHoraria + ", valorHora=" + valorHora + ", salario=" + salario + '}';
    }
   
    public ArrayList getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
   
   
}
