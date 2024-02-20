package com.example.labxpert.Repository;

import com.example.labxpert.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPatientRepository extends JpaRepository<Patient,Long> {
    List<Patient> findByDeletedFalse();
    Optional<Patient> findByIdAndDeletedFalse(Long id);
    List<Patient> findByNomAndDeletedFalse(String name);
}