/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jhonata;

import br.com.jhonata.Escola.Aluno;
import br.com.jhonata.Escola.Disciplina;
import br.com.jhonata.Escola.Pessoa;
import br.com.jhonata.Escola.Professor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author SATC
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
    
      String nomeP = JOptionPane.showInputDialog("Informe o nome do professor: ");
      String rgP   = JOptionPane.showInputDialog("Informe o RG do professor: ");
      String cpfp  = JOptionPane.showInputDialog("Informe o CPF do professor:");
      SimpleDateFormat sdft = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = sdft.parse(JOptionPane.showInputDialog("informe a data de Nascimento do professor: "));
      int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horaria: ")) ;
      float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da Hora: "));
      
      Professor pro = new Professor(cargaHoraria, valorHora, nomeP, rgP, cpfp, dataNascimento);
       
     String nome = JOptionPane.showInputDialog("Informe o nome do Aluno: ");
     String rg = JOptionPane.showInputDialog("Informe o RG do Aluno: ");
     String cpf= JOptionPane.showInputDialog("Informe o CPF do Aluno:");
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      Date data = sdf.parse(JOptionPane.showInputDialog("Informe a data de Nascimento do Aluno: "));
     int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula do Aluno: "));
     Date dataM = sdf.parse(JOptionPane.showInputDialog("Informe a data de Matricula do Aluno: "));
      
     Aluno alu = new Aluno(matricula, data, nome, rg, cpf, dataM);
     
     JOptionPane.showMessageDialog(null, dis.toString());
     JOptionPane.showMessageDialog(null, pro.toString());
     JOptionPane.showMessageDialog(null, alu.toString());
    }
    
}
