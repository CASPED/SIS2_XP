package recursos;

import Interface.RegistroBus;
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ireene
 */
public class BusUpdater {

    private Conexion bdConexion;

    public BusUpdater() {
        try {
            this.bdConexion = new Conexion();
        } catch (Exception ex) {
            Logger.getLogger(BusUpdater.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void registrarBus(String placa, int capacidad, char estado) {
        int id_bus = generateIdBus();
        String sql = "INSERT INTO `bus` VALUES (" + id_bus + ",'" + placa + "'," + capacidad + ",'" + estado + "')";
        try {
            bdConexion.ejecutar(sql);
            JOptionPane.showMessageDialog(null, "  Los datos se registraron correctamente! ", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroBus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean containsBus(String placa) {
        boolean exist = false;
        try {
            ResultSet sqlConsult = bdConexion.Consulta("select placa from bus where placa = '" + placa + "'");
            exist = sqlConsult.first();
        } catch (SQLException ex) {
            Logger.getLogger(BusUpdater.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist;
    }

    public boolean cambiarEstado(String placa, char nuevo_estado) {
        try {
            boolean contains = containsBus(placa);
            if (contains) {
                bdConexion.ejecutar("UPDATE bus SET ESTADO = '"
                        + nuevo_estado + "' WHERE placa = '" + placa + "'");
                JOptionPane.showMessageDialog(null, " Estado del Bus fue cambiado efectivamente ", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "  La placa del Bus no existe dentro el registro ", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }

    private int generateIdBus() {
        int id_bus = -1;
        try {
            String sql1 = "SELECT max(id_bus) FROM bus";
            ResultSet rs1 = bdConexion.Consulta(sql1);
            String cont1 = "";

            while (rs1.next()) {
                cont1 = rs1.getString(1);
                id_bus = Integer.parseInt(cont1) + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BusUpdater.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_bus;
    }

}
