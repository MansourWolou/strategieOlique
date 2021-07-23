package com.company.Main;

import com.company.View.View;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        View view = new View("Strategie Oblique",300,300);
                        view.setVisible(true);
                    }
                }
        );
    }
}
