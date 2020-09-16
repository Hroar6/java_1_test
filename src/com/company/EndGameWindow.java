package com.company;

import javax.swing.*;
import java.awt.*;

public class EndGameWindow extends JFrame {
    private GameWindow gameWindow;
    static final int WINDOW_X = GameWindow.WINDOW_X;
    static final int WINDOW_Y = GameWindow.WINDOW_Y;
    static final int WINDOW_WIDTH = 300;
    static final int WINDOW_HEIGHT = 100;
    JLabel jLabel = new JLabel("фыв", SwingConstants.CENTER);
//    private JLabel jLabel;

    public EndGameWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setTitle("result");
        setBounds(WINDOW_X, WINDOW_Y, WINDOW_WIDTH, WINDOW_HEIGHT);


        add(jLabel);
        JPanel jPanel = new JPanel(new GridLayout(1, 1));
        JButton buttonExit = new JButton("OK");
        jPanel.add(buttonExit);
        add(jPanel, BorderLayout.SOUTH);

        buttonExit.addActionListener(e -> {
            setVisible(false);
        });

        setVisible(false);
    }

    public void changeText(String text) {
        jLabel.setText(text);
    }


}
