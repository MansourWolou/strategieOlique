package com.company.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Controller {

    public Controller(){

    }
    //controlle the event click anywhere
    public void onClickAnyWhere(){};
    //click on the noth button
    public void onClickButton(){};
    //add content on the bd
    public void addContentOnBd(){};
    //delete the actual display
    public void deleteContentDisplay(){};
    // update the actuel text display
    public void updateContentDisplay(){};
    public  static void connect(){
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:/home/woloumanour/strategieOblique/src/com/company/text.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if (conn != null){
                    conn.close();
                }
            }catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {

        Controller control = new Controller();
        control.connect();
    }
}
