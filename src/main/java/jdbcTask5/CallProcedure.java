package jdbcTask5;

import java.sql.*;


public class CallProcedure {
    public static void main(String[] args) throws SQLException {


        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "sentyabr11";

        Connection connection = DriverManager.getConnection(url, username, password);
        {
            CallableStatement statement = connection.prepareCall("CALL aprel26.add_new_row(?, ?, ?)");

            statement.setInt(1, 12);
            statement.setString(2, "Cingiz");
            statement.setString(3, "Baki"); //

            statement.execute();

            System.out.println("SUCCEC");
        }

        String functionName = "aprel26.calculate_sum";
        String query = "SELECT " + functionName + "(?, ?)";

        CallableStatement statement = connection.prepareCall(query);
        statement.setInt(1, 10);
        statement.setInt(2, 11);

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {

            int resultValue = resultSet.getInt(1);
            System.out.println("Function Result: " + resultValue);
        }

        resultSet.close();
        statement.close();
        System.out.println("SUCCEC");


    }


}



