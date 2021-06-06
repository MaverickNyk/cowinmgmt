package com.cowinMgmt.resource;

import com.cowinMgmt.api.CenterServiceApi;
import com.cowinMgmt.model.Center;
import org.elasticsearch.common.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cowinMgmt/api/v1")
public class CenterResource {

    @Autowired
    CenterServiceApi centerServiceApi;

    @GetMapping("/centers")
    @ResponseBody
    public ResponseEntity<Object> getCenters(@RequestParam(required = false) String pinCode,
                                             @RequestParam(required = false) String stateName,
                                             @RequestParam(required = false) String districtName,
                                             @RequestParam(required = false) String blockName) {
        try {
            validateRequestParams(pinCode, stateName, districtName, blockName);
            List<Center> centers = centerServiceApi.getCenterList(pinCode, stateName, districtName, blockName);
            return ResponseEntity.status(HttpStatus.OK).body(centers);
        }
        catch (Exception ex){
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(ex.getMessage());
        }
    }


    private void validateRequestParams(String pinCode, String stateName,
                                       String districtName, String blockName) throws IllegalArgumentException {
        if (Strings.isNullOrEmpty(pinCode)
                && Strings.isNullOrEmpty(districtName)
                && Strings.isNullOrEmpty(stateName)
                && Strings.isNullOrEmpty(blockName)) {
            throw new IllegalArgumentException("Invalid input parameters");
        }
    }
}