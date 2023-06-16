package com.suivi_rendezvous.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suivi_rendezvous.models.Client;


public interface ClientRepository extends JpaRepository<Client, Integer>{

}
