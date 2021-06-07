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

    @GetMapping("/centers{pinCode}")
    @ResponseBody
    public ResponseEntity<Object> getCentersByPinCode(@RequestParam(required = false) String pinCode,
                                             @RequestParam(required = false) String stateName,
                                             @RequestParam(required = false) String districtName,
                                             @RequestParam(required = false) String blockName,
                                             @RequestParam(required = false, defaultValue = "20") String limit,
                                             @RequestParam(required = false, defaultValue = "0") String offset) {
        try {
            validateRequestParams(pinCode);
            List<Center> centers = centerServiceApi.getCenterListByPinCode(pinCode);
            return ResponseEntity.status(HttpStatus.OK).body(centers);
        }
        catch (Exception ex){
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(ex.getMessage());
        }
    }

    @GetMapping("/centers")
    @ResponseBody
    public ResponseEntity<Object> getCenters(@RequestParam(required = false) String pinCode,
                                             @RequestParam(required = false) String stateName,
                                             @RequestParam(required = false) String districtName,
                                             @RequestParam(required = false) String blockName,
                                             @RequestParam(required = false, defaultValue = "20") String limit,
                                             @RequestParam(required = false, defaultValue = "0") String offset) {
        try {
            validateRequestParams(pinCode);
            validateRequestParams(stateName);
            validateRequestParams(districtName);
            validateRequestParams(blockName);
            List<Center> centers = centerServiceApi.getCenterList(pinCode, stateName, districtName, blockName);
            return ResponseEntity.status(HttpStatus.OK).body(centers);
        }
        catch (Exception ex){
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(ex.getMessage());
        }
    }


    private void validateRequestParams(String input) throws IllegalArgumentException {
        if (Strings.isNullOrEmpty(input)){
            throw new IllegalArgumentException("Invalid input parameters");
        }
    }
}