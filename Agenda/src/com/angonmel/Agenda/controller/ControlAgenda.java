package com.angonmel.Agenda.controller;


import com.angonmel.Agenda.managers.CommandParser;
import com.angonmel.Agenda.managers.ContactManager;
import com.angonmel.Agenda.model.Command;
import com.angonmel.Agenda.model.Contacts;
import com.angonmel.Agenda.model.ContactsList;
import com.angonmel.Agenda.view.Message;
import com.angonmel.Agenda.view.Prompt;

import java.util.LinkedList;
import java.util.List;


public class ControlAgenda {

    ContactsList yourList = new ContactsList();
    Contacts contacts = new Contacts();
    List<String> names = new LinkedList<>();
    List<String> phones = new LinkedList<>();

    public void switchMenu(){


        boolean end = false;

        while (!end){
        String command = Prompt.read();
        Command com = CommandParser.parse(command);
        switch (com){
            case HELP:
                Message.printHelp();
                break;

            case QUIT:
                Message.printQuit();
                end = true;

            case LIST:
                yourList.print();
                break;

            case ADD:


                contacts = ContactManager.addContact();
                yourList.add(contacts);

                break;

            case DELETE:
                ContactManager.deleteContact(yourList);


                break;

            default:
                System.out.println("Incorrect option");


        }


    }

    }





}
