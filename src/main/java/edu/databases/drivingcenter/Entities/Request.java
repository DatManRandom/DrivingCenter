package edu.databases.drivingcenter.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Request_ID;
    private String Start_Date;
    private String Created_Date;
    private String Created_By;
    private String Last_Modified_Date;
    private String Las_Modified_By;
    private boolean _Status;
    private String Licence_Type;

    public int getRequest_ID() {
        return Request_ID;
    }

    public void setRequest_ID(int request_ID) {
        Request_ID = request_ID;
    }

    public String getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(String start_Date) {
        Start_Date = start_Date;
    }

    public String getCreated_Date() {
        return Created_Date;
    }

    public void setCreated_Date(String created_Date) {
        Created_Date = created_Date;
    }

    public String getCreated_By() {
        return Created_By;
    }

    public void setCreated_By(String created_By) {
        Created_By = created_By;
    }

    public String getLast_Modified_Date() {
        return Last_Modified_Date;
    }

    public void setLast_Modified_Date(String last_Modified_Date) {
        Last_Modified_Date = last_Modified_Date;
    }

    public String getLas_Modified_By() {
        return Las_Modified_By;
    }

    public void setLas_Modified_By(String las_Modified_By) {
        Las_Modified_By = las_Modified_By;
    }

    public boolean is_Status() {
        return _Status;
    }

    public void set_Status(boolean _Status) {
        this._Status = _Status;
    }

    public String getLicence_Type() {
        return Licence_Type;
    }

    public void setLicence_Type(String licence_Type) {
        Licence_Type = licence_Type;
    }

    @Override
    public String toString() {
        return "{\"Request_ID\":" + Request_ID +
            "\", \"Start_Date\":" + Start_Date +
            "\", \"Created_Date\":" + Created_Date +
            "\", \"Created_By\":" + Created_By +
            "\", \"Last_Modified_Date\":" + Last_Modified_Date +
            "\", \"Las_Modified_By\":" + Las_Modified_By +
            "\", \"_Status\":" + _Status +
            "\", \"Licence_Type\":" + Licence_Type +
            '}';
    }
}
