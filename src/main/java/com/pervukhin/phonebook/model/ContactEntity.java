package com.pervukhin.phonebook.model;

import javafx.beans.property.StringProperty;

public class ContactEntity {
    private StringProperty phoneNumber;
    private StringProperty adress;
    private StringProperty name;

    public ContactEntity(){

    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public StringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }

    public String getAdress() {
        return adress.get();
    }

    public StringProperty adressProperty() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress.set(adress);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }
}
