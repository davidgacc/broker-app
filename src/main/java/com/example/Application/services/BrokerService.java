package com.example.Application.services;

import com.example.Application.controller.BrokerController;
import com.example.Application.dto.BrokerDTO;
import com.example.Application.exceptions.StatusException;
import com.example.Application.model.Broker;
import com.example.Application.repository.BrokerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.logging.Logger;

@Service
public class BrokerService {

    private BrokerRepository brokerRepository;

    private static final Logger logger = Logger.getLogger(BrokerController.class.getName());

    public Optional<BrokerDTO> getBroker(Long document) throws StatusException {
        Optional<Broker> broker = brokerRepository.findById(document);
        if (broker.isPresent()){
            if (broker.get().getActive()){
                logger.info("getting data when status is active");
                BrokerDTO brokerActive =  BrokerDTO.builder()
                        .id(broker.get().getId())
                        .name(broker.get().getName())
                        .createdAt(broker.get().getCreatedAt())
                        .active(broker.get().getActive())
                        .document(broker.get().getDocument())
                        .comissionRate(broker.get().getComissionRate())
                        .build();
                return Optional.of(brokerActive);
            } else{
                throw new StatusException();
            }
        }else{
            return Optional.empty();
        }
    }
}
