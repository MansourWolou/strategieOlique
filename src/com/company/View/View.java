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

    private void buildContentPane() {
        //put the layout with borderLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        this.getContentPane().add(panel);
        panel.setBackground(Color.decode("#151515"));

        //add jButton on north
        //TODO: the button is not at the good size
        JButton button = new JButton();
        //button.setMinimumSize(new Dimension(300,300));
        panel.add(button,BorderLayout.NORTH);

        //display the text on center
        //TODO: the texte is'nt enough visible , change the color
        //TODO: get the texte from controller only
        JTextField txt = new JTextField();
        txt.setEditable(false);
        txt.setHorizontalAlignment(JTextField.CENTER);
        txt.setFont(new Font(Font.MONOSPACED,Font.PLAIN,15));
        txt.setText("return a resolt from Controller");
        txt.setBackground(Color.decode("#151515"));
        panel.add(txt,BorderLayout.CENTER);

    }
}
