package com.angonmel.Agenda.view;

public class Message {


    public static void printHelp() {
        System.out.println("[H] or [Help] for help text.\n" + "[Q] or [Quit] for quit program.\n" + "[L] or [ContactsList] for show contact list.\n" + "[A] or [Add] for add contact.\n" + "[D] or [Delete] for delete contact.\n");
    }

    public static void printTitle(){
        System.out.println("Welcome to --> Your AGENDA");
    }

    public static void printQuit(){
        System.out.println("Finishing program..");
    }

    public static void  printGetName(){
        System.out.println("Please write name");

    }

    public static void  printGetPhone(){
        System.out.println("Please enter number phone");

    }

    public static void printGetPositionToDelete(){
        System.out.println("Please enter the number associated with the contact");
    }

    public static void printContactDeleted(){
        System.out.println("Contact deleted");
    }

    public static void printErrorDeleted(){
        System.out.println("Contact not found");
    }

    public static void printErrorNotInt(){
        System.out.println("The character introducided is not an integer");
    }
}


