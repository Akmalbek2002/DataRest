package com.example.datarest.Repository;

import com.example.datarest.Entity.Maxsulot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
@RepositoryRestResource(path = "maxsulot")
public interface MaxsulotRepository extends JpaRepository<Maxsulot,Integer> {

    Optional<Maxsulot> findById(Integer integer);

}
