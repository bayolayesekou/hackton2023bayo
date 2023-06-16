package com.suivi_rendezvous.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suivi_rendezvous.models.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>{

}
