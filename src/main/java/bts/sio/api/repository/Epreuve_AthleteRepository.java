package bts.sio.api.repository;

import bts.sio.api.model.Athlete;
import bts.sio.api.model.Epreuve;
import bts.sio.api.model.Epreuve_Athlete;
import bts.sio.api.model.Olympiade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Epreuve_AthleteRepository extends CrudRepository<Epreuve_Athlete, Long> {
}