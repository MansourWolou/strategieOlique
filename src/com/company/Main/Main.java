package com.company.Main;

import com.company.View.View;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        View view = new View("testoo",520,520);
                        view.setVisible(true);
                    }
                }
        );
    }
}
