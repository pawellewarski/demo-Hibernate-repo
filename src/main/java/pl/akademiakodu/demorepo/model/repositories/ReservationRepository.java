package pl.akademiakodu.demorepo.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.akademiakodu.demorepo.model.ReservationModel;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationModel, Integer > {




}
