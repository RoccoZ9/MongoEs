package it.itd.smallcountries.repository;

import it.itd.smallcountries.documents.Continenti;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ContinentRepository extends MongoRepository<Continenti, String> {
    public Continenti findByCapital(String capital);
    @Query("{'capital':/?0/}")
    public Continenti findCapitalLike(String capLike);

    @Query(value = "{'latlng': {$geoWithin: { $centerSphere: [ [?0, ?1], ?2 ]}}}")
    public List<Continenti> findLocation(double lat, double lng, double distance);
}
