package com.example.nguyentrungkien.quanlykhohang.Model.Login;

import com.example.nguyentrungkien.quanlykhohang.Handle.DownloadJSON;
import com.example.nguyentrungkien.quanlykhohang.Util.App;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class LoginModel {
    public String login (String username, String password)
    {
        String employee_name = "";
        List<HashMap<String,String>> attrs = new ArrayList<>();

        HashMap<String,String> hsHandle = new HashMap<>();
        hsHandle.put("handle","login");

        HashMap<String,String> hsUsername = new HashMap<>();
        hsUsername.put("account_username",username);

        HashMap<String,String> hsPassword = new HashMap<>();
        hsPassword.put("account_password",password);

        attrs.add(hsHandle);
        attrs.add(hsUsername);
        attrs.add(hsPassword);

        DownloadJSON downloadJSON = new DownloadJSON(App._URL,attrs);

        downloadJSON.execute();

        try {
            String data = downloadJSON.get();

            JSONObject jsonObject = new JSONObject(data);
            employee_name = jsonObject.optString("employee_name");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return employee_name;
    }
}
