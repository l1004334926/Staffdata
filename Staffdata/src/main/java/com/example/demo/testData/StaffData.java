package com.example.demo.testData;

import com.example.demo.entity.Staff;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class StaffData {
    private static Map<String, Staff> staffs=null;
    static {
        staffs=new HashMap<String, Staff>();
        staffs.put("1", new Staff("1", "一一一", "技术开发部1"));
        staffs.put("2", new Staff("2", "二二二", "技术开发部2"));
        staffs.put("3", new Staff("3", "三三三", "技术开发部3"));
        staffs.put("0", new Staff("0", "无", "无"));
    }

    public Staff getStaffData(String usercode){
        return staffs.get(usercode);
    }
}
