package no.stevning.flywayexample.repository;

import no.stevning.flywayexample.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
}
