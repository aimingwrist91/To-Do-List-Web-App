package user;


import com.google.gson.Gson;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class FetchList {

    public String json = null;
    HashMap Fetch(ResultSet rs) throws SQLException {
        HashMap<Integer, String> map = new HashMap<>();
        while(rs.next())
        {
            String task = rs.getString("task");
            Integer taskId = rs.getInt("taskId");
            map.put(taskId,task);
        }
        json = new Gson().toJson(map);
        System.out.println(json);

        return map;
    }



}

