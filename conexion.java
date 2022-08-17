package conex;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;

public class conexion {
    Connection con;
    public conexion(){
        try{
            Class.forName("com.JDBC");
            con=JDBC.getConnection("jdbc:mysql://localhost:3306/isunah_prog2","root","1234");
        }catch (Exception e){
            System.err.println("Error:" +e);
        }
    }
    public static void main(String[] args){
        conexion cn=new conexion();
        Statement st;
        ResultSet rs;
        try{
            st=cn.con.createStatement();
            rs=st.executeQuery("select * from usuario");
            while (rs.next())
                System.out.println(rs.getVarchar("alumno")+" " +rs.getVarchar("name")+" " +rs.getVarchar("password")+" ");
            rs=st.executeQuery("select * from contact_list");
            while (rs.next())
                System.out.println(rs.getVarchar("alumno")+" " +rs.getVarchar("apellido")+" " +rs.getVarchar("email")+" " +rs.getVarchar("telefono")+" ");
        }
    }catch (Exception e){
    }

    private static class JDBC {

        private static Connection getConnection(String jdbcmysqllocalhost3306isunah_prog2, String root, String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public JDBC() {
        }
    }
}
