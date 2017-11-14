package pl.andrzejkalkowski.HibernateExercises.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue
    Long id;

    String city;
    String street;
    String postalCode;
    int homeNumber;
    int studentId;

    public Address() {
    }

    public Address(String city, String street, String postalCode, int homeNumber, int studentId) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.homeNumber = homeNumber;
        this.studentId = studentId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", homeNumber=" + homeNumber +
                ", studentId=" + studentId +
                '}';
    }
}
