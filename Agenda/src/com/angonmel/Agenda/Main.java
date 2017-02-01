package com.angonmel.Agenda;


import com.angonmel.Agenda.controller.ControlAgenda;
import com.angonmel.Agenda.view.Message;

public class Main {

    public static void main(String[] args) {
        Message.printTitle();

        ControlAgenda agenda = new ControlAgenda();
        agenda.switchMenu();
    }
}