package com.example.Application.repository;

import com.example.Application.model.Broker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BrokerRepository extends JpaRepository<Broker, Long> { }


