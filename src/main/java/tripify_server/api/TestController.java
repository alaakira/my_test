package tripify_server.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tripify_server.exception.TestNotFoundException;
import tripify_server.model.MyTestModel;
import tripify_server.repository.MyTestRepository;
import tripify_server.service.TestService;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
public class TestController {

    @Autowired
    private MyTestRepository repository;
    @Autowired
    private TestService service;

    @GetMapping
    public String helloWorld(HttpServletRequest request){
        return "Hello World \nMr. "+request.getRemoteAddr();
    }

    @GetMapping("/{id}")
    public String getByID(@PathVariable("id") long id){
        return service.getByID(id);
    }

    @GetMapping("/all")
    public List<MyTestModel> getAll(HttpServletRequest request){
        return repository.findAll();
    }

    @PostMapping
    public MyTestModel add(){
        MyTestModel model = new MyTestModel();
        return repository.save(model);
    }

    @PutMapping("/{id}")
    public MyTestModel edit(@PathVariable ("id") long id,@RequestBody MyTestModel body){
        body.setId(id);
        return repository.save(body);
    }


}
