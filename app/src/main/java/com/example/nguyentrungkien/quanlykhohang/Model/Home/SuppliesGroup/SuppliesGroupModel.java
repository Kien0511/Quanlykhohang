package com.example.nguyentrungkien.quanlykhohang.Model.Home.SuppliesGroup;

import com.example.nguyentrungkien.quanlykhohang.Handle.DownloadJSON;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.SuppliesGroupDTO;
import com.example.nguyentrungkien.quanlykhohang.Util.App;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class SuppliesGroupModel {
    public List<SuppliesGroupDTO> ListSuppliesGroup()
    {
        List<SuppliesGroupDTO> list = new ArrayList<>();

        List<HashMap<String,String>> attrs = new ArrayList<>();

        HashMap<String,String> hsHandle = new HashMap<>();

        hsHandle.put("handle","supplies_group");

        attrs.add(hsHandle);

        DownloadJSON downloadJSON = new DownloadJSON(App._URL,attrs);

        downloadJSON.execute();

        try {
            String data = downloadJSON.get();

            JSONObject jsonObject = new JSONObject(data);

            JSONArray jsonArray = jsonObject.optJSONArray("Supplies_group");

            for (int i = 0; i < jsonArray.length(); i++)
            {
                JSONObject jsonObject1 = jsonArray.optJSONObject(i);

                SuppliesGroupDTO suppliesGroupDTO = new SuppliesGroupDTO();

                suppliesGroupDTO.setSupplies_group_id(jsonObject1.optInt("supplies_group_id"));
                suppliesGroupDTO.setSupplies_group_name(jsonObject1.optString("supplies_group_name"));

                list.add(suppliesGroupDTO);
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
