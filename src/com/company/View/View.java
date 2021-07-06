package com.company.View;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    public View(String name, int w, int h){
        super(name);
        this.build(w,h);
    }
    //setting the window
    private void build(int w, int h) {
        this.setPreferredSize(new Dimension(w,h));
        this.setLocationRelativeTo((Component) null);
        this.setResizable(false);
        this.setDefaultCloseOperation(2);
        this.pack();
        this.buildContentPane();
    }
    /*
    DONE:
    TODO: add jButton on north
    TODO: make the background black
    TODO: display the text on center
    TODO:
    TODO:

     */
    private void buildContentPane() {
        //put the layout with borderLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        this.getContentPane().add(panel);
        panel.setBackground(Color.decode("#151515"));

        //
        /*
        JButton button = new JButton();
        button.setMinimumSize(new Dimension(300,300));
        panel.add(button,BorderLayout.NORTH);
        */

    }
}
