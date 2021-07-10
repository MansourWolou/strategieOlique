package com.company.Controller;

import java.sql.*;

public class Controller {
    private String displayedText;

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
    public void updateContentDisplay(String updateTxt){
      //  System.out.println(updateTxt.toCharArray().toString()+'ur');
        String req = "UPDATE quote\n" +
                "SET textImput = " + "\'" + updateTxt + "\'" +"\n" +
                "WHERE textImput= " +"\'" + displayedText+ "\'";
        System.out.println(req);
        try {
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
            int rs    = stmt.executeUpdate(req);
            System.out.println(rs);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    };
    private Connection connect(){
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:/home/woloumanour/strategieOblique/src/com/company/text.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        /*
        https://stackoverflow.com/questions/9561832/what-if-i-dont-close-the-database-connection-in-python-sqlite
        this website said that we are not obliged to close the database
         */
        return conn;
    }
    public void getRandomText(){
        String sql = "SELECT *\n" +
                "FROM quote\n" +
                "ORDER BY random()\n" +
                "LIMIT 1;";
        try {
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            System.out.println(rs.getString("textImput"));
            displayedText = rs.getString("textImput");
            conn.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {

        Controller control = new Controller();
        control.getRandomText();
        control.updateContentDisplay("coucou");

    }
}
