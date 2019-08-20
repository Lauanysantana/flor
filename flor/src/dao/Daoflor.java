/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Flor;
/**
 *
 * @author Administrador
 */
public class Daoflor {
    public static boolean inserir(Flor objeto) {
        String sql = "INSERT INTO Flor (tamanho_da_sepala, tamanho_da_petala, nome_cientifico, nome_popular, ano, codigo) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, objeto.getTamanho_da_sepala());
            ps.setDouble(2, objeto.getTamanho_da_petala());
            ps.setString(3, objeto.getNome_cientifico());
            ps.setString(4, objeto.getNome_popular());
            ps.setInt(5, objeto.getAno());
            ps.setInt(6, objeto.getCodigo());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
     public static void main(String[] args) {
        Flor objeto = new Flor();
        objeto.setTamanho_da_sepala(1.2);
        objeto.setTamanho_da_petala(5.5);
        objeto.setNome_cientifico("Hyorangea");
        objeto.setNome_popular("Hortencia");
        objeto.setAno(2019);
        objeto.setCodigo(121);
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
     public static boolean alterar(Flor objeto) {
        String sql = "UPDATE produto SET tamanho_da_sepala = ?, tamanho_da_petala = ?, nome_cientifico = ?, nome_popular = ?, ano = ?, codigo = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setDouble(1, objeto.getTamanho_da_sepala()); 
            ps.setDouble(2, objeto.getTamanho_da_petala());
            ps.setString(3, objeto.getNome_cientifico());
            ps.setString(4, objeto.getNome_popular());
            ps.setInt(5, objeto.getAno());
            ps.setInt(6, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
      public static boolean excluir(Flor objeto) {
        String sql = "DELETE FROM produto WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.setDouble(2, objeto.getTamanho_da_sepala());
            ps.setDouble(3, objeto.getTamanho_da_petala());
            ps.setString(4, objeto.getNome_cientifico());
            ps.setString(5, objeto.getNome_popular());
            ps.setInt(6, objeto.getAno());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
