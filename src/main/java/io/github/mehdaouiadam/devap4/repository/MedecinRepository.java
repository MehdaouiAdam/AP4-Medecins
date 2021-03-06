package io.github.mehdaouiadam.devap4.repository;

import io.github.mehdaouiadam.devap4.entity.Departement;
import io.github.mehdaouiadam.devap4.entity.Medecin;
import io.github.mehdaouiadam.devap4.entity.Specialitecomplementaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {

    Medecin findMedecinById(Long id);

    List<Medecin> findMedecinsByNomContainingIgnoreCase(String nom);

    List<Medecin> findMedecinsByPrenomContainingIgnoreCase(String prenom);

    List<Medecin> findAllByOrderByIdAsc();
    
    List<Medecin> findMedecinsByDepartementOrderByIdAsc(Departement departement);

    List<Medecin> findMedecinsBySpecialitecomplementaire(Specialitecomplementaire specialitecomplementaire);

    Long countByDepartement(Departement departement);

    Long countBySpecialitecomplementaire(Specialitecomplementaire specialitecomplementaire);

}

