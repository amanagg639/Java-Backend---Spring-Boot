package org.address.address_book;

import org.address.address_book.model.AddressBook;
import org.address.address_book.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @GetMapping("getData")
    public List<AddressBook> getData() {
        return addressBookService.getData();
    }

    @GetMapping("getData/{addressId}")
    public AddressBook getDataById(@PathVariable int addressId) {
        return addressBookService.getDataById(addressId);
    }

    @PostMapping("addData")
    public void addData(@RequestBody AddressBook addressBook) {
        addressBookService.addData(addressBook);
    }

    @PutMapping("updateData")
    public void updateData(@RequestBody AddressBook addressBook) {
        addressBookService.updateData(addressBook);
    }

    @DeleteMapping("deleteData/{addressId}")
    public void deleteData(@PathVariable int addressId) {
        addressBookService.deleteData(addressId);
    }
}
