package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import com.accesadades.jdbc.CRUDHR;
import com.accesadades.jdbc.GestioDBHR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Main {
    public static void main(String[] args) {

        try(BufferedReader message = new BufferedReader(new InputStreamReader(System.in))){
            try{
                Properties properties = new Properties();
                try(InputStream input = GestioDBHR.class.getClassLoader().getResourceAsStream("config.properties")){
                    properties.load(input);

                    String dbUrl = properties.getProperty("db.url");
                    String dbUser = properties.getProperty("db.username");
                    String dbPassword = properties.getProperty("db.password");

                    try(Connection connect = DriverManager.getConnection(dbUrl, dbUser, dbPassword)){
                        System.out.println("Succesful connection");

                        String File_create_script = "db_scripts/scrips_still_to_upload" ;
        
                        InputStream input_sch = GestioDBHR.class.getClassLoader().getResourceAsStream(File_create_script);
    
                        CRUDHR crudbhr = new CRUDHR();
                        crudbhr.CreateDatabase(connect,input_sch);
                        while (sortirapp == false) {
                            MenuOptions(br1,crudbhr,connect);
                        }
                    }
                } catch (Exception e){
                    System.err.println("Error in connection: " + e.getMessage());
                }
            } catch (Exception e) {
                System.err.println("Error when uploading the propiety files: " + e.getMessage());
            }

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void menuBDD(BufferedReader br, CRUDHR crudbhr, Connection connect)
    throws NumberFormatException, IOException, SQLException, InterruptedException {

        Terminal terminal = TerminalBuilder.builder().system(true).build();

    }
}