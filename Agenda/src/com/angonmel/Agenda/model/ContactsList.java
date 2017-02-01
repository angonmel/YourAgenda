package com.angonmel.Agenda.model;

import java.util.LinkedList;


public class ContactsList {
    private LinkedList<Contacts> yourList = new LinkedList<>();
    public ContactsList(){}

    public void print(){
        for (Contacts contacts : yourList){
            System.out.println( getYourList().indexOf(contacts) + " : " + contacts.getName() + " --> " + contacts.getPhone());
        }
    }

    public  void add(Contacts contacts){this.yourList.add(contacts);}



    public LinkedList<Contacts> getYourList() {

        return yourList;
    }

    public void setYourList(LinkedList<Contacts> yourList) {
        this.yourList = yourList;
    }

    public void delete(Contacts contacts){this.yourList.remove(contacts);
    }

}
