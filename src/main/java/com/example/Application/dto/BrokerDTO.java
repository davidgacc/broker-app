package com.example.Application.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Data
@Builder
public class BrokerDTO {

    private BigInteger id;
    private String name;
    private BigInteger document;
    private String code;
    private Date createdAt;
    private BigInteger comissionRate;
    private Boolean active;
}
