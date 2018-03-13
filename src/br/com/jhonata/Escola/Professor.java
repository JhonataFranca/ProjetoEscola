/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jhonata.Escola;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SATC
 */
public class Professor extends Pessoa {
 private  ArrayList disciplina;
 private int cargaHoraria;
 private float valorHora,salario;

    public Professor(int cargaHoraria, float valorHora, String nome, String rg, String cpf, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = this.calcularsalario(cargaHoraria, valorHora);
    }
 
 public float calcularsalario(int cargaHoraria,float valorHora){
     return cargaHoraria * valorHora;
 }

    @Override
    public String toString() {
        return super.toString()+ "Professor{" + "disciplina = " + disciplina + 
                "\n cargaHoraria = " + cargaHoraria +
                "\n valorHora = " + valorHora + 
                "\n salario = " + salario +'}';
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
