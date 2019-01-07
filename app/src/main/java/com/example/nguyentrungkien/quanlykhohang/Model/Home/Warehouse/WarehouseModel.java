package com.example.nguyentrungkien.quanlykhohang.Model.Home.Warehouse;

import android.util.Log;

import com.example.nguyentrungkien.quanlykhohang.Handle.DownloadJSON;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.WarehouseDTO;
import com.example.nguyentrungkien.quanlykhohang.Util.App;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class WarehouseModel {
    public List<WarehouseDTO> ListWarehouse()
    {
        List<WarehouseDTO> list = new ArrayList<>();

        List<HashMap<String,String>> attrs = new ArrayList<>();

        HashMap<String,String> hsHandle = new HashMap<>();
        hsHandle.put("handle","warehouse");

        attrs.add(hsHandle);

        DownloadJSON downloadJSON = new DownloadJSON(App._URL,attrs);
        downloadJSON.execute();

        try {
            String data = downloadJSON.get();

            JSONObject jsonObject = new JSONObject(data);

            JSONArray jsonArray = jsonObject.optJSONArray("Warehouse");

            for (int i = 0; i < jsonArray.length(); i++)
            {
                JSONObject jsonObject1 = jsonArray.optJSONObject(i);

                WarehouseDTO warehouseDTO = new WarehouseDTO();

                warehouseDTO.setWarehouse_id(jsonObject1.optInt("warehouse_id"));
                warehouseDTO.setWarehouse_name(jsonObject1.optString("warehouse_name"));
                warehouseDTO.setWarehouse_address(jsonObject1.optString("warehouse_address"));
                warehouseDTO.setWarehouse_phone_number(jsonObject1.optString("warehouse_phone_number"));
                warehouseDTO.setWarehouse_manager(jsonObject1.optString("warehouse_manager"));
                warehouseDTO.setWarehouse_note(jsonObject1.optString("warehouse_note"));

                list.add(warehouseDTO);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Log.e("aaaaaaaaaaaaaa",list.size()+"");
        return list;
    }
}
