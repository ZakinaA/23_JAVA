package bts.sio.api.service;

import lombok.Data;
import bts.sio.api.model.Epreuve_Athlete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bts.sio.api.repository.Epreuve_AthleteRepository;

import java.util.Optional;
@Data
@Service
public class Epreuve_AthleteService {
    @Autowired
    private Epreuve_AthleteRepository epreuveAthleteRepository;

    public Optional<Epreuve_Athlete> getEpreuve_Athlete(final Long id) {
        return epreuveAthleteRepository.findById(id);
    }

    public Iterable<Epreuve_Athlete> getEpreuve_Athletes() {
        return epreuveAthleteRepository.findAll();
    }

    public void deleteEpreuve_Athlete(final Long id) {
        epreuveAthleteRepository.deleteById(id);
    }

    public Epreuve_Athlete saveEpreuve_Athlete(Epreuve_Athlete epreuveAthlete) {
        Epreuve_Athlete saveEpreuve_Athlete = epreuveAthleteRepository.save(epreuveAthlete);
        return saveEpreuve_Athlete;
    }
}