package com.spontaneousCraft.TriMain;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.SQLException;

public class MainClass extends JavaPlugin implements Listener {

    public void onEnable(){
        getServer().getPluginManager().registerEvents(new VoteEventHandler(),this);
        try {
            DatabaseConnection.SQLFunction();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void onDisable(){

    }
}
