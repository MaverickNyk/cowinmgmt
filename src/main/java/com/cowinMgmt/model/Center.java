package com.cowinMgmt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.List;

@Data
@Document(indexName = "centers", indexStoreType = "center")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Center {
    @Id
    @Field(name = "center_id")
    private String centerId;

    @Field(name = "name")
    private String name;

    @Field(name = "address")
    private String address;

    @Field(name = "state_name")
    private String stateName;

    @Field(name = "district_name")
    private String districtName;

    @Field(name = "block_name")
    private String blockName;

    @Field(name = "pincode")
    private String pinCode;

    @Field(name = "lat")
    private String latitude;

    @Field(name = "long")
    private String longitude;

    @Field(name = "from")
    private String from;

    @Field(name = "to")
    private String to;

    @Field(name = "fee_type")
    private String feeType;

    @Field(name = "sessions")
    private String sessionList;
}