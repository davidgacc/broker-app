package com.example.Application.controller;

import com.example.Application.dto.BrokerDTO;
import com.example.Application.services.BrokerService;
import com.example.Application.exceptions.StatusException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "insurance/v1/broker")
public class BrokerController {

    @Autowired
    private BrokerService brokerService;

    @GetMapping(value = "/{document}",  produces = "application/json")
    public ResponseEntity<BrokerDTO> getData(@PathVariable(value = "document")  Long document) throws StatusException {
        try {
            return ResponseEntity.ok(brokerService.getBroker(document).get());
        }catch (StatusException statusException) {
            return new ResponseEntity(statusException.getMessage(), HttpStatus.CONFLICT);
        }
    }

}
