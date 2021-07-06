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
    TODO: put the layout with borderLayout
    TODO: add jButton on north
    TODO: make the background black
    TODO: display the text on center
    TODO:
    TODO:

     */
    private void buildContentPane() {
        JPanel panel = new JPanel();
        panel.setLayout((LayoutManager)null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.decode("#151515"));
    }
}
