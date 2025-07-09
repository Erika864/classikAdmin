package com.example.classikAdmin.Repository;

import com.example.classikAdmin.Entity.Licence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LicenceRepository extends JpaRepository<Licence, Integer> {
}
