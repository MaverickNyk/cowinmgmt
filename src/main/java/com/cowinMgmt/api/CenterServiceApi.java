package com.cowinMgmt.api;

import com.cowinMgmt.model.Center;

import java.util.List;

public interface CenterServiceApi {
    List<Center> getCenterList(String pinCode, String stateName,
                               String districtName, String blockName) throws Exception;
}
