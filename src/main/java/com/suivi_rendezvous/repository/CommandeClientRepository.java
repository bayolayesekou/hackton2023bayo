package com.suivi_rendezvous.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suivi_rendezvous.models.CommandeClient;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Integer>{

}
