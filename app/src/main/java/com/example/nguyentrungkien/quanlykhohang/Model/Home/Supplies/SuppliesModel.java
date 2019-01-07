package com.example.nguyentrungkien.quanlykhohang.Model.Home.Supplies;

import com.example.nguyentrungkien.quanlykhohang.Handle.DownloadJSON;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.SuppliesDTO;
import com.example.nguyentrungkien.quanlykhohang.Util.App;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class SuppliesModel {
    public List<SuppliesDTO> ListSupplies()
    {
        List<SuppliesDTO> list = new ArrayList<>();

        List<HashMap<String,String>> attrs = new ArrayList<>();

        HashMap<String,String> hsHandle = new HashMap<>();

        hsHandle.put("handle","supplies");

        attrs.add(hsHandle);

        DownloadJSON downloadJSON = new DownloadJSON(App._URL,attrs);

        downloadJSON.execute();

        try {
            String data = downloadJSON.get();

            JSONObject jsonObject = new JSONObject(data);

            JSONArray jsonArray = jsonObject.optJSONArray("Supplies");

            for (int i = 0; i < jsonArray.length(); i++)
            {
                JSONObject jsonObject1 = jsonArray.optJSONObject(i);

                SuppliesDTO suppliesDTO = new SuppliesDTO();

                suppliesDTO.setSupplies_id(jsonObject1.optInt("supplies_id"));
                suppliesDTO.setSupplies_name(jsonObject1.optString("supplies_name"));
                suppliesDTO.setSupplies_import_price(jsonObject1.optInt("supplies_import_price"));
                suppliesDTO.setSupplies_export_price(jsonObject1.optInt("supplies_export_price"));
                suppliesDTO.setUnit_id(jsonObject1.optInt("unit_id"));
                suppliesDTO.setSupplies_group_id(jsonObject1.optInt("supplies_group_id"));
                suppliesDTO.setQuality_id(jsonObject1.optInt("quality_id"));
                suppliesDTO.setDistributor_id(jsonObject1.optInt("distributor_id"));
                suppliesDTO.setOrigin_id(jsonObject1.optInt("origin_id"));

                list.add(suppliesDTO);

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
