package tripify_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tripify_server.exception.TestNotFoundException;
import tripify_server.model.MyTestModel;
import tripify_server.repository.MyTestRepository;

import java.util.Optional;

@Component
public class TestService {

    @Autowired
    private MyTestRepository repository;

    public String getByID(long id){
        Optional<MyTestModel> opt = repository.findById(id);
        if(!opt.isPresent()){
            throw new TestNotFoundException("Wrong Mong");
        }
        return "Hello World \nMr. "+opt.get().getName();
    }

}
