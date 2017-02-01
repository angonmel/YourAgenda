package com.angonmel.Agenda.model;


public class Contacts {


    private String name;
    private String phone;
    private int contactContact;

    public Contacts() {
    }

    @Override
    public String toString(){
        return "\n[\t" + getName() + "\n\t" + getPhone() + "\n" ;


    }

    public String getName() {
        return name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phoneEntered) {
        this.phone = phoneEntered;
    }


    public int getContact() {
        return contactContact;
    }

    public void setContact(int contactContact) {
        this.contactContact = contactContact;
    }





}
