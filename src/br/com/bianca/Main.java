/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bianca;

import br.com.bianca.Escola.Aluno;
import br.com.bianca.Escola.Disciplina;
import br.com.bianca.Escola.Pessoa;
import br.com.bianca.Escola.Professor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author bianca.149817
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
      String Nome =JOptionPane.showInputDialog("Informe o Nome da disciplina: ");
      String departamento =JOptionPane.showInputDialog("Informe o departamento: ");
      char status = JOptionPane.showInputDialog("Informe o status: ").charAt(0);
      
      Disciplina dis = new Disciplina(Nome, departamento, status);
    
      
      int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horaria: ")) ;
      float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da Hora: "));
      
      Professor pro = new Professor(cargaHoraria, valorHora, Nome, Nome, Nome, dataNascimanto);
      
      String nome = JOptionPane.showInputDialog("Informe o nome: ");
      String rg = JOptionPane.showInputDialog("Informe o RG: ");
      String cpf= JOptionPane.showInputDialog("Informe o CPF:");
      
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      Date dataN = sdf.parse(JOptionPane.showInputDialog("Informe a data de Nascimento: "));
      
     int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula: "));
     Date dataM = sdf.parse(JOptionPane.showInputDialog("Informe a data de Matricula: "));
      
     Aluno alu = new Aluno(matricula, disciplina, dataM, nome, rg, cpf, dataM);
      
      
      
      
      
      
      
       
       
    }
    
}
