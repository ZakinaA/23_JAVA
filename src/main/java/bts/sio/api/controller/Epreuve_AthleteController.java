package bts.sio.api.controller;


import bts.sio.api.model.Epreuve_Athlete;
import bts.sio.api.model.Sport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import bts.sio.api.service.Epreuve_AthleteService;

import java.util.Optional;

@RestController
public class Epreuve_AthleteController {

    @Autowired
    private Epreuve_AthleteService epreuveAthleteService;

    /**
     * Create - Add a new athlete
     * @param Epreuve_Athlete An object athlete
     * @return The  object saved
     */
    @PostMapping("/epreuve_athlete")
    public Epreuve_Athlete createEpreuve_Athlete(
            @RequestBody Epreuve_Athlete epreuveAthlete) {
        return epreuveAthleteService.saveEpreuve_Athlete(epreuveAthlete);
    }


    /**
     * Read - Get one athlete
     * @param id The id of the Epreuve
     * @return An Epreuve object full filled
     */
    @GetMapping("/epreuve_athlete/{id}")
    public Epreuve_Athlete getEpreuve_Athletes(@PathVariable("id") final Long id) {
        Optional<Epreuve_Athlete> EpreuveAthlete = epreuveAthleteService.getEpreuve_Athlete(id);
        if(EpreuveAthlete.isPresent()) {
            return EpreuveAthlete.get();
        } else {
            return null;
        }
    }

    /**
     * Read - Get all athletes
     * @return - An Iterable object of Athlete full filled
     */
    @GetMapping("/epreuve_athletes")
    public Iterable<Epreuve_Athlete> getEpreuve_Athlete() {
        return epreuveAthleteService.getEpreuve_Athletes();
    }

    /**
     * Update - Update an existing athlete
     * @param id - The id of the athlete to update
     * @param Epreuve_Athlete - The Epreuve object updated
     * @return
     */
    @PutMapping("/epreuve_athlete/{id}")
    public Epreuve_Athlete updateEpreuve_Athlete(@PathVariable("id") final Long id, @RequestBody Epreuve_Athlete Epreuve_Athlete) {
        Optional<Epreuve_Athlete> e = epreuveAthleteService.getEpreuve_Athlete(id);
        if(e.isPresent()) {
            Epreuve_Athlete currentEpreuve_Athlete = e.get();

            String place = Epreuve_Athlete.getPlace();
            if(place != null) {
                currentEpreuve_Athlete.setPlace(place);
            }

            epreuveAthleteService.saveEpreuve_Athlete(currentEpreuve_Athlete);
            return currentEpreuve_Athlete;
        } else {
            return null;
        }
    }


    /**
     * Delete - Delete an athlete
     * @param id - The id of the athlete to delete
     */
    @DeleteMapping("/epreuve_athlete/{id}")
    public void deleteEpreuve(@PathVariable("id") final Long id) {
        epreuveAthleteService.deleteEpreuve_Athlete(id);
    }

}
