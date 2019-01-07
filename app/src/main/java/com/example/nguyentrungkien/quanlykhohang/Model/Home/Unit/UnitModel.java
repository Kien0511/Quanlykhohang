package com.example.nguyentrungkien.quanlykhohang.Model.Home.Unit;

import com.example.nguyentrungkien.quanlykhohang.Handle.DownloadJSON;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.UnitDTO;
import com.example.nguyentrungkien.quanlykhohang.Util.App;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class UnitModel {
    public List<UnitDTO> ListUnit()
    {
        List<UnitDTO> list = new ArrayList<>();

        List<HashMap<String,String>> attrs = new ArrayList<>();

        HashMap<String,String> hsHandle = new HashMap<>();

        hsHandle.put("handle","unit");

        attrs.add(hsHandle);

        DownloadJSON downloadJSON = new DownloadJSON(App._URL,attrs);

        downloadJSON.execute();

        try {
            String data = downloadJSON.get();

            JSONObject jsonObject = new JSONObject(data);

            JSONArray jsonArray = jsonObject.optJSONArray("Unit");

            for (int i = 0; i < jsonArray.length(); i++)
            {
                JSONObject jsonObject1 = jsonArray.optJSONObject(i);

                UnitDTO unitDTO = new UnitDTO();

                unitDTO.setUnit_id(jsonObject1.optInt("unit_id"));
                unitDTO.setUnit_name(jsonObject1.optString("unit_name"));

                list.add(unitDTO);
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
