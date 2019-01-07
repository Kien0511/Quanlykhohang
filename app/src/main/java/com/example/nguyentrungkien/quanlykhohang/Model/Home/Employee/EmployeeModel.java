package com.example.nguyentrungkien.quanlykhohang.Model.Home.Employee;

import com.example.nguyentrungkien.quanlykhohang.Handle.DownloadJSON;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.EmployeeDTO;
import com.example.nguyentrungkien.quanlykhohang.Util.App;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class EmployeeModel {
    public List<EmployeeDTO> ListEmployee()
    {
        List<EmployeeDTO> list = new ArrayList<>();

        List<HashMap<String,String>> attrs = new ArrayList<>();

        HashMap<String,String> hsHandle = new HashMap<>();

        hsHandle.put("handle","employee");

        attrs.add(hsHandle);

        DownloadJSON downloadJSON = new DownloadJSON(App._URL,attrs);
        downloadJSON.execute();

        try {
            String data = downloadJSON.get();

            JSONObject jsonObject = new JSONObject(data);

            JSONArray jsonArray = jsonObject.optJSONArray("Employee");

            for (int i = 0; i < jsonArray.length(); i++)
            {
                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                EmployeeDTO employeeDTO = new EmployeeDTO();

                employeeDTO.setEmployee_id(jsonObject1.optInt("employee_id"));
                employeeDTO.setEmployee_name(jsonObject1.optString("employee_name"));
                employeeDTO.setEmployee_address(jsonObject1.optString("employee_address"));
                employeeDTO.setEmployee_birthday(jsonObject1.optString("employee_birthday"));
                employeeDTO.setEmployee_phone_number(jsonObject1.optString("employee_phone_number"));
                employeeDTO.setEmployee_email(jsonObject1.optString("employee_email"));
                employeeDTO.setEmployee_gender(jsonObject1.optString("employee_gender"));
                employeeDTO.setEmployee_identity_card(jsonObject1.optString("employee_identity_card"));
                employeeDTO.setPermissions_id(jsonObject1.optInt("permissions_id"));

                list.add(employeeDTO);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return list;
    }
}
