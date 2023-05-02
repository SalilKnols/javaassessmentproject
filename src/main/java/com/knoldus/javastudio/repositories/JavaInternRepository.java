package com.knoldus.javastudio.repositories;

import com.knoldus.javastudio.entities.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JavaInternRepository extends JpaRepository<Intern, String> {

}
