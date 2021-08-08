package ars.cs.miu.edu.repository;

import ars.cs.miu.edu.models.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AirlineReposiory extends JpaRepository<Airline,Long> {
}
