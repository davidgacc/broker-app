package com.example.Application.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Data
@Builder
public class BrokerDAO {

    private BigInteger id;
    private String name;
    private BigInteger document;
    private String code;
    private Date createdAt;
    private BigInteger comissionRate;
    private Boolean active;
}
