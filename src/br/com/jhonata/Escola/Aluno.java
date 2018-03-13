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
public class Aluno extends Pessoa {
 private int matricula ;
 private ArrayList disciplina;
 private Date dataMatricula;

    public Aluno(int matricula,  Date dataMatricula, String nome, String rg, String cpf, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.matricula = matricula; 
        this.dataMatricula = dataMatricula;
    }
 
 

    @Override
    public String toString() {
        return super.toString()+ "Aluno{" + "matricula = " + matricula + 
                "\n disciplina = " + disciplina + 
                "\n dataMatricula = " + dataMatricula + '}';
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList disciplina) {
        this.disciplina = disciplina;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
 
 

   
 
}
