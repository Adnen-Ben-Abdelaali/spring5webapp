package guru.springframework.spring5webapp.model;

import javax.persistence.*;


@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String address;

    public Publisher() {}

    public Publisher(String name, String address) {

        this.name = name;
        this.address = address;
    }

    /* setters and getters */

    // id is aut generated : no setter
    public long getId() {

        return this.id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getAddress() {

        return this.address;
    }

}
