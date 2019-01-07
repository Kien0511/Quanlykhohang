package com.example.nguyentrungkien.quanlykhohang.Model.Home.Distributor;

import com.example.nguyentrungkien.quanlykhohang.Handle.DownloadJSON;
import com.example.nguyentrungkien.quanlykhohang.Model.DTO.DistributorDTO;
import com.example.nguyentrungkien.quanlykhohang.Util.App;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class DistributorModel {
    public List<DistributorDTO> ListDistributor()
    {
        List<DistributorDTO> list = new ArrayList<>();

        List<HashMap<String,String>> attrs = new ArrayList<>();

        HashMap<String,String> hsHandle = new HashMap<>();

        hsHandle.put("handle","distributor");

        attrs.add(hsHandle);

        DownloadJSON downloadJSON = new DownloadJSON(App._URL,attrs);

        downloadJSON.execute();

        try {
            String data = downloadJSON.get();

            JSONObject jsonObject = new JSONObject(data);

            JSONArray jsonArray = jsonObject.optJSONArray("Distributor");

            for (int i = 0; i < jsonArray.length(); i++)
            {
                JSONObject jsonObject1 = jsonArray.optJSONObject(i);

                DistributorDTO distributorDTO = new DistributorDTO();

                distributorDTO.setDistributor_id(jsonObject1.optInt("distributor_id"));
                distributorDTO.setDistributor_name(jsonObject1.optString("distributor_name"));
                distributorDTO.setDistributor_address(jsonObject1.optString("distributor_address"));
                distributorDTO.setDistributor_phone_number(jsonObject1.optString("distributor_phone_number"));
                distributorDTO.setDistributor_email(jsonObject1.optString("distributor_email"));
                distributorDTO.setDistributor_manager(jsonObject1.optString("distributor_manager"));

                list.add(distributorDTO);
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
