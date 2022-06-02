package com.annalis.sample.api.repository;

import com.annalis.sample.api.domain.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat, Integer> {
}
