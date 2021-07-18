package com.kenneyjuma.SpringBootWebappExample;

import java.util.ArrayList;
import java.util.List;

public class ContactBusinessLogic {
    public List<Contact> getContactList() {
        List<Contact> listContact = new ArrayList<>();
         
        listContact.add(new Contact("Kennedy Juma", "kennedyjuma@gmail.com", "Kenya"));
        listContact.add(new Contact("Kennedy Otieno", "kennedyotieno@yahoo.com", "Tanzania"));
        listContact.add(new Contact("John Paul", "john123@yahoo.com", "New Zealand"));
        
         
        return listContact;
    }

}
