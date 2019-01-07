package com.example.nguyentrungkien.quanlykhohang.Model.Home.Origin;

import com.example.nguyentrungkien.quanlykhohang.Handle.DownloadJSON;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.OriginDTO;
import com.example.nguyentrungkien.quanlykhohang.Util.App;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class OriginModel {
    public List<OriginDTO> ListOrigin()
    {
        List<OriginDTO> list = new ArrayList<>();

        List<HashMap<String,String>> attrs = new ArrayList<>();

        HashMap<String,String> hsHandle = new HashMap<>();

        hsHandle.put("handle","origin");

        attrs.add(hsHandle);

        DownloadJSON downloadJSON = new DownloadJSON(App._URL,attrs);
        downloadJSON.execute();

        try {
            String data = downloadJSON.get();

            JSONObject jsonObject = new JSONObject(data);

            JSONArray jsonArray = jsonObject.optJSONArray("Origin");

            for (int i = 0; i < jsonArray.length(); i++)
            {
                JSONObject jsonObject1 = jsonArray.optJSONObject(i);

                OriginDTO originDTO = new OriginDTO();

                originDTO.setOrigin_id(jsonObject1.optInt("origin_id"));
                originDTO.setOrigin_name(jsonObject1.optString("origin_name"));

                list.add(originDTO);
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
