package utitlies;

import org.testng.Assert;

import java.sql.*;
import java.util.*;

public class JDBCTests {

    public static void main(String[] args) throws SQLException {

        Connection connection= DriverManager.getConnection("jdbc:postgresql://3.135.206.245/elardb","impleyer","ciforest");
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from core_company");

        ResultSetMetaData rsMetaData=resultSet.getMetaData();

        List<Map<String, Object>> list=new ArrayList<>();

        while(resultSet.next()){
            Map<String, Object> map=new HashMap<>();
            for(int i=1; i<=rsMetaData.getColumnCount(); i++){
                //            id,                          35
                //         company_name,                 8191f376-e963-4056-aed4-e4d1a3a90100
                map.put(rsMetaData.getColumnName(i), resultSet.getString(rsMetaData.getColumnName(i)));
            }
            list.add(map);
        }

        System.out.println(list);

    }

}
