package com.company.View;

import com.company.Controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class View extends JFrame {
    private Controller control = new Controller();
    private String currentDisplayedText;
    private  JTextField txt = new JTextField();

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
        // the events are intercept on the panel. So mouseClique event never arrive when i add
        // textfield
        /*
        1- the event is get on glass pane and never arrive.
        2- the event is get in the panel and when i add txtfield , it nerver comes

        * find a way to make a component don't intercepet a mousecliq event
        * find where the event is intercept and sand it where you want to handle it
        * changee the hierarchy
         */


        //add jButton on north
        //TODO: the button is not at the good size
        JButton button = new JButton();
        //button.setMinimumSize(new Dimension(300,300));
        panel.add(button,BorderLayout.NORTH);

        //----------------------------------------------------------
        //display the text on center
        //TODO: the texte is'nt enough visible , change the color
        //TODO: the text is'nt reponsive
        txt.setEditable(false);
        txt.setHorizontalAlignment(JTextField.CENTER);
        txt.setFont(new Font(Font.MONOSPACED,Font.PLAIN,15));
        txt.setText(control.getDisplayedText());
        txt.setBackground(Color.decode("#151515"));
        control.getRandomText();
        txt.setText(control.getDisplayedText());
        panel.add(txt,BorderLayout.CENTER);


        control.getRandomText();
        txt.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                /* super.mousePressed(e); */
                control.getRandomText();
                txt.setText(control.getDisplayedText());
            }
        });




    }
}
