package com.angonmel.Agenda.managers;

import com.angonmel.Agenda.model.Contacts;
import com.angonmel.Agenda.model.ContactsList;
import com.angonmel.Agenda.view.Message;
import com.angonmel.Agenda.view.Prompt;

import java.util.InputMismatchException;


public class ContactManager {



    public static Contacts addContact(){

        Message.printGetName();
       String inputName = Prompt.read();
       Message.printGetPhone();
       String inputPhone = Prompt.read();


       Contacts contacts = new Contacts();
       contacts.setName(inputName);
       contacts.setPhone(inputPhone);

    return contacts;
    }

    public static void deleteContact(ContactsList contacts){

        Message.printGetPositionToDelete();
        try{
            int positionToDelete = Prompt.readInt();

            if(positionToDelete >= 0 && positionToDelete < contacts.getYourList().size()){

                contacts.getYourList().remove(positionToDelete);
                Message.printContactDeleted();

            }else{
                Message.printErrorDeleted();
            }
        }catch (InputMismatchException e){
            Message.printErrorNotInt();
        }






   }



}
