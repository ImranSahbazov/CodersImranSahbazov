package jdbcTask4;

import java.sql.*;

public class DBCon {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        Connection conn = DriverManager.getConnection(url, "postgres", "sentyabr11");


        PreparedStatement ps = conn.prepareStatement("INSERT INTO aprel26.Tələbələr (first_name, last_name, major)\n" +
                "VALUES ('dilare', 'Ezimli', 'Computer Engineering');");

            int cr = ps.executeUpdate();


        PreparedStatement read = conn.prepareStatement("select * from aprel26.Tələbələr");
        {

            ResultSet rs = read.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString("first_name"));
                System.out.print(" ");
                System.out.print(rs.getString("last_name"));
                System.out.println();

            }
        }

        PreparedStatement update = conn.prepareStatement("UPDATE aprel26.Tələbələr\n" +
                "SET first_name='Dragon'\n" +
                "WHERE last_name='Ezimli';");

        int up = update.executeUpdate();


        PreparedStatement delete = conn.prepareStatement("DELETE FROM aprel26.Tələbələr\n" +
                "WHERE last_name = 'Ezimli' ");

        int dt = delete.executeUpdate();
        if(dt>0){
            System.out.println("SUCCEC  "+dt);
        }

    }
}
