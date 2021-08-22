package repository;

import model.FPTemployee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface ITemployeeRepo extends CrudRepository<FPTemployee, Long> {
    @Query(value = "SELECT f FROM FPTemployee as f where f.name like concat('%',:name,'%') ")
    public ArrayList<FPTemployee> findAllByName(@Param("name") String name);
}
