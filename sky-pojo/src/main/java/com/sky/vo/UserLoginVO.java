package com.sky.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginVO implements Serializable {

    private Long id;
    private String openid;
    private String token;
    private String shopName;
    private String shopAddress;
    private Long shopId;
    private Double deliveryFee;

    @JsonProperty("shopName")
    public String getShopName() { return shopName; }

    @JsonProperty("shopAddress")
    public String getShopAddress() { return shopAddress; }

    @JsonProperty("shopId")
    public Long getShopId() { return shopId; }

    @JsonProperty("deliveryFee")
    public Double getDeliveryFee() { return deliveryFee; }

}
