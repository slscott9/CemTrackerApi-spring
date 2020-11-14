package com.stuart.cemetery.api.repository;

import com.stuart.cemetery.api.model.Cemetery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CemeteryRepository extends JpaRepository<Cemetery, Long> {
}
