package analyzer1;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import analyzer.entity.Item;
import analyzer.service.SqliteHelper;

public class SqliteTest {
    
    @Test
    public void testHelper() {
        try {
            SqliteHelper h = new SqliteHelper("analyzer.db");
            h.executeUpdate("drop table if exists item;");
            h.executeUpdate("create table item(id varchar(120) PRIMARY KEY,itemName varchar(120),num varchar(120),validDate varchar(120));");
            h.executeUpdate("delete from item;");
            h.executeUpdate("insert into item values('1', 'AHV', '2018', '2018-12-01');");
            h.executeUpdate("insert into item values('2', 'BHV', '2018', '2018-12-01');");
            h.executeUpdate("insert into item values('3', 'CHV', '2018', '2018-12-01');");
            h.executeUpdate("insert into item values('4', 'DHV', '2018', '2018-12-01');");
            h.executeUpdate("insert into item values('5', 'EHV', '2018', '2018-12-01');");
            h.executeUpdate("insert into item values('6', 'FHV', '2018', '2018-12-01');");
            h.executeUpdate("insert into item values('7', 'GHV', '2018', '2018-12-01');");
            h.executeUpdate("insert into item values('8', 'HHV', '2018', '2018-12-01');");
            
            List<Item> sList = h.executeQuery("select * from item");
            System.out.println(sList.size());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}