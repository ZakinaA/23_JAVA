package bts.sio.api.repository;

import bts.sio.api.model.Athlete;
import bts.sio.api.model.Epreuve;
import bts.sio.api.model.GenreEpreuve;
import bts.sio.api.model.Olympiade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreEpreuveRepository extends CrudRepository<GenreEpreuve, Long> {
}
