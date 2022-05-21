package com.example.sklepinternetowy.repository;

import com.example.sklepinternetowy.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Long> {
}
