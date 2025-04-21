package org.address.address_book.service;

import org.address.address_book.model.AddressBook;
import org.address.address_book.repo.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService {

    @Autowired
    private AddressBookRepository addressBookRepository;

    public List<AddressBook> getData() {
        return addressBookRepository.findAll();
    }

    public AddressBook getDataById(int addressId) {
        return addressBookRepository.findById(addressId).get();
    }

    public void addData(AddressBook addressBook) {
        addressBookRepository.save(addressBook);
    }

    public void updateData(AddressBook addressBook) {
        addressBookRepository.save(addressBook);
    }

    public void deleteData(int addressId) {
        addressBookRepository.deleteById(addressId);
    }
}
