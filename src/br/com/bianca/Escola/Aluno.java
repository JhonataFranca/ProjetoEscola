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
public class Aluno extends Pessoa {
 private int matricula ;
 private ArrayList disciplina;
 private Date dataMatricula;

    public Aluno(int matricula, ArrayList disciplina, Date dataMatricula, String nome, String rg, String cpf, int idade, Date dataNascimanto) {
        super(nome, rg, cpf, idade, dataNascimanto);
        this.matricula = matricula;
        this.disciplina = disciplina;
        this.dataMatricula = dataMatricula;
    }
 
 

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", disciplina=" + disciplina + ", dataMatricula=" + dataMatricula + '}';
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
