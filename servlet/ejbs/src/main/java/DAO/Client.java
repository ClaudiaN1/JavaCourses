package DAO;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

@Entity
//@Table(name = "user")       
//public class AnotherUser{
public class Client {

    @Id
    private int id;
    private String name;
    private String email;
    private String country;
    private LocalDate birthDate;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Transient
    private long age;

    @OneToOne
    @JoinColumn(name = "user_id")     
    private User user;

    public void calculateAge(){
        age =  ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }

    public Client(){}

    public Client(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client user = (Client) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }


    public long getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
