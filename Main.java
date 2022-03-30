package com.AddressBook.TTS;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private String firstname;
    private String lastname;
    private int streetno;
    private String street;
    private String city;
    private int telephonenumber;
    private String emailaddress;



    public AddressBook(String firstname, String lastname, int streetno,
                            String street, String city, int telephonenumber, String emailaddress) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.streetno = streetno;
        this.street = street;
        this.city = city;
        this.telephonenumber = telephonenumber;
        this.emailaddress = emailaddress;
    }



    public AddressBook() {
        // TODO Auto-generated constructor stub
    }
    public String getFirstname() {
        return firstname;
    }



    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }



    public String getLastname() {
        return lastname;
    }



    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public int getStreetno() {
        return streetno;
    }



    public void setStreetno(int streetno) {
        this.streetno = streetno;
    }



    public String getStreet() {
        return street;
    }



    public void setStreet(String street) {
        this.street = street;
    }



    public String getCity() {
        return city;
    }



    public void setCity(String city) {
        this.city = city;
    }



    public int getTelephonenumber() {
        return telephonenumber;
    }



    public void setTelephonenumber(int telephonenumber) {
        this.telephonenumber = telephonenumber;
    }



    public String getEmailaddress() {
        return emailaddress;
    }



    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    public String fullName() {
        return this.firstname + " " + this.lastname;
    }

    public String fullAddress() {
        return this.streetno + " " + this.street + " st. " + this.city + " city";
    }

    public void displayAddress(){
        System.out.println("Name               : " + fullName());
        System.out.println("Address            : " + fullAddress());
        System.out.println("Telephone Number   : " + this.telephonenumber);
        System.out.println("Email Address      : " + this.emailaddress + "@gmail.com"+"\n");
    }
}


public class AddressBookEntry {

    private List<AddressBookEntry> listOfEntries;

    public AddressBookEntry() {
        this.listOfEntries = new ArrayList<>();
    }

    public void add(AddressBook addressBook) {

        this.listOfEntries.add(addressBook);
    }

    public void delete(int index) {
        this.listOfEntries.remove(index);
    }

    public AddressBook get(int index) {
        return this.listOfEntries.get(index);
    }

    public AddressBook[] viewAll() {

        AddressBook[] result = new AddressBook[this.listOfEntries.size()];

        this.listOfEntries.toArray(result);

        return result;
    }
}
