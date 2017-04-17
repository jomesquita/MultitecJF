
package DAO;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Multitec JF
 */
public class Conexao {
    public static Connection AbrirConexao(){
    Connection con = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        String url= "jdbc:mysql://localhost/MultitecJF";
        con =DriverManager.getConnection(url,"root","admin");
        
    }catch(Exception e ){
        JOptionPane.showMessageDialog(null,"Erro na Conexão como Banco, ","Multitec JF", JOptionPane.ERROR_MESSAGE);
e.getMessage();
    }
       return con;
        
    }
    public static void FecharConexao(Connection con) {
       try{
           con.close();
       }catch (Exception e ){
           System.out.println(e.getMessage());
       }
    }
}
