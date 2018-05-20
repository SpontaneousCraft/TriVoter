package com.spontaneousCraft.TriMain;

import java.util.Date;
import java.util.UUID;

public class Vote {
    // Variables for MySQL table's
    private int id;

    private UUID uuid;

    public Date datetime;

    public int website_id;

    //Getter and Setter Info
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public int getWebsite_id() {
        return website_id;
    }

    public void setWebsite_id(int website_id) {
        this.website_id = website_id;
    }

    public static void addVote(){

    }
}
