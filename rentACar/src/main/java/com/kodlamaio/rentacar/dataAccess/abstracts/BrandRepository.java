package com.kodlamaio.rentacar.dataAccess.abstracts;

import com.kodlamaio.rentacar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BrandRepository extends JpaRepository<Brand,Integer> {


}
