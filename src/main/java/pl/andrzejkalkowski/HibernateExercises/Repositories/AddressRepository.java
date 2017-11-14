package pl.andrzejkalkowski.HibernateExercises.Repositories;

import org.springframework.stereotype.Component;
import pl.andrzejkalkowski.HibernateExercises.Models.Address;

import java.util.ArrayList;
import java.util.List;

@Component
public class AddressRepository {
    List<Address> addresses = new ArrayList<>();

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public Address findOne(Long id) {
        for (Address a : addresses) {
            if (a.getId().equals(id)) {
                return a;
            }
        }
        throw new IllegalArgumentException("Address with id=" + id + " not found");
    }

    public List<Address> findAll() {
        return addresses;
    }
}
