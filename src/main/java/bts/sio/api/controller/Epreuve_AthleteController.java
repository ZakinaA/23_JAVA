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
     * @param epreuve_Athlete An object athlete
     * @return The  object saved
     */
    @PostMapping("/epreuve_athlete")
    public Epreuve_Athlete createEpreuve_Athlete(@RequestBody Epreuve_Athlete epreuveAthlete) {
        return epreuveAthleteService.getEpreuve_Athletes(epreuveAthlete);
    }


    /**
     * Read - Get one athlete
     * @param id The id of the Epreuve
     * @return An Epreuve object full filled
     */
    @GetMapping("/epreuve/{id}")
    public Epreuve getEpreuve(@PathVariable("id") final Long id) {
        Optional<Epreuve> sport = epreuveService.getEpreuve(id);
        if(sport.isPresent()) {
            return sport.get();
        } else {
            return null;
        }
    }

    /**
     * Read - Get all athletes
     * @return - An Iterable object of Athlete full filled
     */
    @GetMapping("/epreuves")
    public Iterable<Epreuve> getEpreuve() {
        return epreuveService.getEpreuves();
    }

    /**
     * Update - Update an existing athlete
     * @param id - The id of the athlete to update
     * @param epreuve - The Epreuve object updated
     * @return
     */
    @PutMapping("/epreuve/{id}")
    public Epreuve updateEpreuve(@PathVariable("id") final Long id, @RequestBody Epreuve epreuve) {
        Optional<Epreuve> e = epreuveService.getEpreuve(id);
        if(e.isPresent()) {
            Epreuve currentEpreuve = e.get();

            String nom = epreuve.getNom();
            if(nom != null) {
                currentEpreuve.setNom(nom);
            }

            Sport sport_id = epreuve.getSport();
            if(sport_id != null) {
                currentEpreuve.setSport(sport_id);;
            }

            epreuveService.saveEpreuve(currentEpreuve);
            return currentEpreuve;
        } else {
            return null;
        }
    }


    /**
     * Delete - Delete an athlete
     * @param id - The id of the athlete to delete
     */
    @DeleteMapping("/epreuve/{id}")
    public void deleteEpreuve(@PathVariable("id") final Long id) {
        epreuveService.deleteEpreuve(id);
    }

}
