package tripify_server.model;

import javax.persistence.*;

@Entity
@Table
public class MyTestModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public MyTestModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
