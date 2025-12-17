package com.example.demo.repository;
import com.example.demo.location.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LocationRepository extends JpaRepository<LocationEntity, Long>{
    
}
