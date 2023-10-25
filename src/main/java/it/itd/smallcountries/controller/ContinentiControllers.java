package it.itd.smallcountries.controller;

import it.itd.smallcountries.documents.Continenti;
import it.itd.smallcountries.exceptions.ContinentNotFoundException;
import it.itd.smallcountries.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/continent")
public class ContinentiControllers {
    @Autowired
    ContinentRepository contRepo;

    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Continenti> getAll(){
        return contRepo.findAll();
    }

    @GetMapping(value = "/getById/{id}")
    public Continenti getById(@PathVariable String id)throws ContinentNotFoundException {
        return contRepo.findById(id).orElseThrow(() -> new ContinentNotFoundException());
    }

    @GetMapping(value = "/getCapital/{capital}")
    public Continenti getCapital(@PathVariable String capital){
        return contRepo.findByCapital(capital);
    }

    @GetMapping(value = "/getCapLike/{capital}")
    public Continenti getCaptilLike(@PathVariable String capital){
        return contRepo.findCapitalLike(capital);
    }

    @GetMapping(value = "getDistance/{lat}/{lng}/{distance}")
    public List<Continenti> getDistance(@PathVariable double lat,@PathVariable double lng, @PathVariable double distance){
        double dist= distance / 6378.1;
        return contRepo.findLocation(lat, lng, dist);
    }
}
