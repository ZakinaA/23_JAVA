package bts.sio.api.service;

import lombok.Data;
import bts.sio.api.model.GenreEpreuve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bts.sio.api.repository.GenreEpreuveRepository;

import java.util.Optional;
@Data
@Service
public class GenreEpreuveService {
    @Autowired
    private GenreEpreuveRepository genreEpreuveRepository;

    public Optional<GenreEpreuve> getGenreEpreuve(final Long id) {
        return genreEpreuveRepository.findById(id);
    }

    public Iterable<GenreEpreuve> getGenreEpreuves() {
        return genreEpreuveRepository.findAll();
    }

    public void deleteGenreEpreuve(final Long id) {
        genreEpreuveRepository.deleteById(id);
    }

    public GenreEpreuve saveGenreEpreuve(GenreEpreuve genreEpreuve) {
        GenreEpreuve saveGenreEpreuve = genreEpreuveRepository.save(genreEpreuve);
        return saveGenreEpreuve;
    }
}