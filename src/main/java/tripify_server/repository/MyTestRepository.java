package tripify_server.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tripify_server.model.MyTestModel;

import java.util.List;

@Repository
public interface MyTestRepository extends CrudRepository<MyTestModel, Long> {

    @Override
    List<MyTestModel> findAll();

}
