package de.medieninformatik.softwaretechnik;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JFrame implements ActionListener, MouseListener {

    /**
     * Constructor
     */
    public Main () {
        setSize(800,550);
        addMouseListener(this);
        setTitle("Version 1.0");
    }

    /**
     * The method main starts the programm.
     * @param args standard value
     */
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
    }

    /**
     * The method paint asks for the method drawRectangle.
     * @param g Graphics
     */
    @Override
    public void paint(Graphics g) {
        drawRectangle(x, y);
    }

    /**
     * The method drawRectangle paints the squares.
     * @param x x-value
     * @param y y-value
     */
    public void drawRectangle(int x, int y) {
        Graphics g = this.getGraphics();
        g.setColor(Color.orange);
        g.fillRect(x-20, y-20, 40, 40);
    }

    /**
     * The method clearRectangle clears the canvas.
     */
    public void clearRectangle(){
        Graphics g = this.getGraphics();
        g.clearRect(0, 0,800, 550);
        g.setColor(Color.white);
        g.fillRect(0,0,800,550);
    }

    int x, y;
    int i = 0;

    /**
     * The method mouseClicked is for painting a circle or clearing the canvas. That depends on the parameter i.
     * @param e event when mouse clicked
     */
    public void mouseClicked(MouseEvent e) {
        ++i;
        x = e.getX();
        y = e.getY();

        if (i<=2){
            repaint();
        }
        else if (i==3){
            clearRectangle();
            i = 0;
        }
    }

    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }
}

