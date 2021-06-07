package com.cowinMgmt.repositories;

import com.cowinMgmt.model.Center;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CenterRepository extends ElasticsearchRepository<Center, String> {
    List<Center> findByPinCodeOrStateNameOrDistrictNameOrBlockName(String pinCode, String stateName,
                                                                   String districtName, String blockName);

    List<Center> findByPinCode(String pinCode);
}
