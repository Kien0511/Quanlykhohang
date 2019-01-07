package com.example.nguyentrungkien.quanlykhohang.Model.Home.Quality;

import com.example.nguyentrungkien.quanlykhohang.Handle.DownloadJSON;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.QualityDTO;
import com.example.nguyentrungkien.quanlykhohang.Util.App;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class QualityModel {
    public List<QualityDTO> ListQuality()
    {
        List<QualityDTO> list = new ArrayList<>();

        List<HashMap<String,String>> attrs = new ArrayList<>();

        HashMap<String,String> hsHandle = new HashMap<>();

        hsHandle.put("handle","quality");

        attrs.add(hsHandle);

        DownloadJSON downloadJSON = new DownloadJSON(App._URL,attrs);

        downloadJSON.execute();

        try {
            String data = downloadJSON.get();

            JSONObject jsonObject = new JSONObject(data);

            JSONArray jsonArray = jsonObject.optJSONArray("Quality");

            for (int i = 0; i < jsonArray.length(); i++)
            {
                JSONObject jsonObject1 = jsonArray.optJSONObject(i);

                QualityDTO qualityDTO = new QualityDTO();

                qualityDTO.setQuality_id(jsonObject1.optInt("quality_id"));
                qualityDTO.setQuality_name(jsonObject1.optString("quality_name"));

                list.add(qualityDTO);
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
