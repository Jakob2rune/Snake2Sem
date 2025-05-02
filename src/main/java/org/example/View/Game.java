package org.example.View;

import org.example.Controller.Map;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game extends JFrame{

    public static void main(String[] args) {
        launch();
    }

    public Game(){
        Map map = new Map();
        this.add(map);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void launch() {
        new Game();
    }

    public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){

            case KeyEvent.VK_LEFT:
                    {/* Magic */}
                break;
            case KeyEvent.VK_RIGHT:
                    {/* Magic */}
                break;
            case KeyEvent.VK_UP:
                    {/* Magic */}
                break;
            case KeyEvent.VK_DOWN:
                    {/* Magic */}
                break;
        }
    }













}
