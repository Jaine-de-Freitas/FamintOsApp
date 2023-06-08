/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PedidosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user3
 */
public class PedidosDAO {

    Connection conecte;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PedidosDTO> listar = new ArrayList<>();
    ArrayList<PedidosDTO> pedidosE = new ArrayList<>();
    ArrayList<PedidosDTO> consultar = new ArrayList<>();
    
    public ArrayList<PedidosDTO> FiltrarNomes(PedidosDTO pedDTO) {
        String sql = "";
        conecte = new Conexao().Conectar();
        try {
            sql = "select * from tbl_venda where statusC='pendente' order by cd_venda asc";
            pstm = conecte.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                PedidosDTO pdDTO = new PedidosDTO();
                pdDTO.setNo_Ticket(rs.getString("no_Ticket"));
                listar.add(pdDTO);
                
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return listar;
        
    }

    public ArrayList<PedidosDTO> Exibir(PedidosDTO pddDTO) {
        conecte = new Conexao().Conectar();
        try {
            String sql = "select *from tbl_venda where no_Ticket=?";
            pstm = conecte.prepareStatement(sql);
            pstm.setString(1, pddDTO.getBusca());
            rs = pstm.executeQuery();
            while (rs.next()) {
                PedidosDTO pdDTO = new PedidosDTO();
                pdDTO.setCd_comida(rs.getString("cd_comida"));
                pdDTO.setQt_comida(rs.getString("qt_comida"));
                pdDTO.setNome_cliente(rs.getString("nome_cliente"));
                pdDTO.setVl_item(rs.getString("vl_item"));
                pdDTO.setVl_total_item(rs.getString("vl_total_item"));
                pdDTO.setCd_mesa(rs.getString("cd_mesa"));
                pedidosE.add(pdDTO);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            return null;
        }
        return pedidosE;
    }
    public ArrayList<PedidosDTO> Exibir2(PedidosDTO pddsDTO) {
        conecte = new Conexao().Conectar();
        try {
            String sql = "select * from tbl_comidas where cd_comida=?";
            pstm = conecte.prepareStatement(sql);
            pstm.setString(1, pddsDTO.getBusca2());
            //System.out.println(pddsDTO.getBusca2());
            rs = pstm.executeQuery();
            while (rs.next()) {
                PedidosDTO pdeDTO = new PedidosDTO();
                pdeDTO.setNm_comida(rs.getString("nm_comida"));
                consultar.add(pdeDTO);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            return null;
        }
        return consultar;
    }
}
