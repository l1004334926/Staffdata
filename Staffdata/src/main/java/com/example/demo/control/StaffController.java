package com.example.demo.control;

import com.example.demo.entity.Staff;
import com.example.demo.testData.StaffData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class StaffController {
    @Autowired
    private StaffData staffData;

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public Staff search(@RequestParam("code")String code) {
        String usercode=code;
        System.out.println("查询工号:"+usercode);
        Staff staff=new Staff();
        if (staffData.getStaffData(usercode)!=null){
            staff.setUsercode(staffData.getStaffData(usercode).getUsercode());
            staff.setUsername(staffData.getStaffData(usercode).getUsername());
            staff.setDepartment(staffData.getStaffData(usercode).getDepartment());
            System.out.println(staff.toString());
        }else {
            usercode = "0";
            staff.setUsercode(staffData.getStaffData(usercode).getUsercode());
            staff.setUsername(staffData.getStaffData(usercode).getUsername());
            staff.setDepartment(staffData.getStaffData(usercode).getDepartment());
            System.out.println("查无此人");
        }
        return staff;
    }
}
