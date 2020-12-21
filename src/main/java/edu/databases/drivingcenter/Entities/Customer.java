package edu.databases.drivingcenter.Entities;

import jdk.jfr.Name;

import javax.persistence.*;

@Entity
//@Table(name = "customer")
/*@SecondaryTables({
    @SecondaryTable(name = "address", pkJoinColumns = @PrimaryKeyJoinColumn(name = "Address_ID")),
    @SecondaryTable(name = "request", pkJoinColumns = @PrimaryKeyJoinColumn(name = "Request_ID"))
})*/

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Customer_ID;
    //@Column(table = "address")
    private int Address_ID;
   // @Column(table = "request")
    private int Request_ID;
    private String First_Name;
    private String Last_Name;
    private String Date_Of_Birth;
    private String Email_Address;

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public int getAddress_ID() {
        return Address_ID;
    }

    public void setAddress_ID(int address_ID) {
        Address_ID = address_ID;
    }

    public int getRequest_ID() {
        return Request_ID;
    }

    public void setRequest_ID(int request_ID) {
        Request_ID = request_ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getDate_Of_Birth() {
        return Date_Of_Birth;
    }

    public void setDate_Of_Birth(String date_Of_Birth) {
        Date_Of_Birth = date_Of_Birth;
    }

    public String getEmail_Address() {
        return Email_Address;
    }

    public void setEmail_Address(String email_Address) {
        Email_Address = email_Address;
    }

    @Override
    public String toString() {
        return "{\"Customer_ID\":" + Customer_ID +
            "\", \"Address_ID\":" + Address_ID +
            "\", \"Request_ID\":" + Request_ID +
            "\", \"First_Name\":" + First_Name +
            "\", \"Last_Name\":" + Last_Name +
            "\", \"Date_Of_Birth\":" + Date_Of_Birth +
            "\", \"Email_Address\":" + Email_Address +
            '}';
    }
}
