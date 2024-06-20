package com.mislis;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
  
  //MARK: - Connect to database
    private static Connection connect() throws SQLException{
        boolean databaseExists = new File(Settings.DB_PATH).exists();
        if(!databaseExists){
            createDatabase();
        }
        return DriverManager.getConnection(Settings.DB_URL);
    }

    //MARK: - Create database
    private static void createDatabase(){
        //utilisation de statement car pas de parametre dynamique
        try(Connection conn = DriverManager.getConnection(Settings.DB_URL);
            Statement statement = conn.createStatement()){

            //table liens
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS liens(" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "code TEXT NOT NULL," +
            "titre TEXT NOT NULL,"+
            "lien TEXT UNIQUE NOT NULL,"+ //unique pour eviter les doublons
            "duration TEXT,"+
            "liked BOOLEAN DEFAULT 0,"+
            "disliked BOOLEAN DEFAULT 0,"+
            "description TEXT,"+
            "timesAdded INTEGER DEFAULT 0,"+
            "published_date TEXT NOT NULL,"+
            "added_date TEXT DEFAULT (datetime('now'))"+
            ")");

            //table tags
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS tags(" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "tag TEXT NOT NULL UNIQUE"+
            ")");

            //table liens_tags
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS liens_tags(" +
            "lien_id INTEGER NOT NULL,"+
            "tag_id INTEGER NOT NULL,"+
            "PRIMARY KEY (lien_id, tag_id)," +
            "FOREIGN KEY(lien_id) REFERENCES liens(id),"+
            "FOREIGN KEY(tag_id) REFERENCES tags(id)"+
            ")");

            System.out.println("Database and table created successfully.");
        }catch(SQLException e){
            System.out.println("Error creating database: "+e.getMessage());
        }
    }
}
