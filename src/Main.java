import java.sql.*;

public class Main {


    public static Connection C() throws SQLException {
        String URL="jdbc:mysql://localhost:3306/examen_2eval";
        String user="root";
        String psswd="Cide2050";
        Connection c=DriverManager.getConnection(URL,user,psswd);
        return c;
    }

    public static void main(String[] args) throws SQLException {
        C();
        Statement statement= C().createStatement();
        ResultSet resultSet= statement.executeQuery("SELECT * FROM medicos");
        while (resultSet.next()){
            System.out.println("dni: " + resultSet.getString("dni") +
                    ", especialidad: " + resultSet.getString("especialidad"));
        }
    }
}
