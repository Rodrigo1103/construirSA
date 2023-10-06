
package construirsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

public class ConstruirSA {

    
    public static void main(String[] args) {
        try {
            //Carga de Driver
            Class.forName("org.mariadb.jdbc.Driver");
            
            //Conexion a la BD
            Connection conexion=DriverManager.getConnection("jdbc:mariadb://localhost:3307/obrador","root","");
            
            //Agregar un empleado
            /*String sql="INSERT INTO empleado(dni, apellido, nombre, acceso, estado) "
                    + "VALUES (34000000,'Alonso','Rodrigo',1,1)";
            
            PreparedStatement ps=conexion.prepareStatement(sql);
            int registros=ps.executeUpdate();
            System.out.println(" "+registros);*/
            
            //Actualizar un empleado
            /*String sql="UPDATE empleado "
                    + "SET nombre='Roxana' "
                    + "WHERE dni=25340369";
            PreparedStatement ps=conexion.prepareStatement(sql);
            int registros=ps.executeUpdate();
            System.out.println(" "+registros);*/
            
            //Eliminar un empleado
            /*String sql="DELETE FROM empleado WHERE dni=34000000";
            PreparedStatement ps=conexion.prepareStatement(sql);
            int registros=ps.executeUpdate();
            System.out.println(" "+registros);*/
            
            //Obtener todos los empleados
            
            /*String sql="SELECT* FROM empleado";
            PreparedStatement ps=conexion.prepareStatement(sql);
            ResultSet resultado=ps.executeQuery();
            while(resultado.next()){
                System.out.println("Id "+resultado.getInt("idEmpleado"));
                System.out.println("DNI "+resultado.getInt("dni"));
                System.out.println("Apellido "+resultado.getString("apellido"));
                System.out.println("Nombre "+resultado.getString("nombre"));
                System.out.println("Acceso "+resultado.getInt("acceso"));
                System.out.println("Estado "+resultado.getBoolean("estado"));
            }*/
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar Driver "+ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de Conexion "+ex.getMessage());
        }
        
    }
    
}
