/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import tela.manutencao.Manutencao_flor;
import dao.Daoflor;
import javax.swing.JOptionPane;
import modelo.Flor;
import tela.manutencao.Manutencao_flor;
/**
 *
 * @author Administrador
 */
public class Controladorflor {

   public static void inserir(Manutencao_flor man){
        Flor objeto = new Flor();
        objeto.setTamanho_da_sepala(Double.parseDouble(man.jtfTamanho_da_sepala.getText()));
        objeto.setTamanho_da_petala(Double.parseDouble(man.jtfTamanho_da_petala.getText()));
        objeto.setNome_cientifico(man.jtfNome_cientifico.getText());
        objeto.setNome_popular(man.jtfNome_popular.getText());
        objeto.setAno(Integer.parseInt(man.jtfAno.getText()));
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        
        boolean resultado = Daoflor.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

   public static void alterar(Manutencao_flor man){
        Flor objeto = new Flor();
        //definir todos os atributos
        objeto.setTamanho_da_sepala(Double.parseDouble(man.jtfTamanho_da_sepala.getText()));
        objeto.setTamanho_da_petala(Double.parseDouble(man.jtfTamanho_da_petala.getText()));
        objeto.setNome_cientifico(man.jtfNome_cientifico.getText());
        objeto.setNome_popular(man.jtfNome_popular.getText());
        objeto.setAno(Integer.parseInt(man.jtfAno.getText()));
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        
        boolean resultado = Daoflor.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    public static void excluir(Manutencao_flor man){
        Flor objeto = new Flor();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = Daoflor.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    }
    
    

