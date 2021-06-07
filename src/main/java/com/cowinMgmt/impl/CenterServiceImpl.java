package com.cowinMgmt.impl;

import com.cowinMgmt.api.CenterServiceApi;
import com.cowinMgmt.model.Center;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cowinMgmt.repositories.CenterRepository;

import java.util.List;

@Service
public class CenterServiceImpl implements CenterServiceApi {

    @Autowired
    CenterRepository centerRepository;

    @Override
    public List<Center> getCenterList(String pinCode, String stateName,
                                      String districtName, String blockName) {
        List<Center> centerList;

         centerList = centerRepository
                 .findByPinCodeOrStateNameOrDistrictNameOrBlockName(pinCode, stateName, districtName, blockName);

         return centerList;
    }

    @Override
    public List<Center> getCenterListByPinCode(String pinCode) throws Exception {
        List<Center> centerList;

        centerList = centerRepository.findByPinCode(pinCode);

        return centerList;
    }
}
