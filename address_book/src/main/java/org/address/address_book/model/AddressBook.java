package org.address.address_book.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Scope("prototype")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBook {
    @Id
    int id;
    String first_name;
    String last_name;
    String address;
    String city;

}
