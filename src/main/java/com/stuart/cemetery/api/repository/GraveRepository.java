package com.stuart.cemetery.api.repository;


import com.stuart.cemetery.api.model.Grave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GraveRepository extends JpaRepository<Grave, Long> {
}
