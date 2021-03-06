/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author sofialuzgalbanpatterson
 */
public class Kirby {

    public static Color MY_PINK = new Color(255, 100, 178);

    public void draw(Graphics graphics) {
        graphics.drawRect(x, y, width, height);

//        Graphics2D g2d = (Graphics2D) graphics; 
//        g2d.rotate(Math.toRadians(45));
//        g2d.fillOval(x + 150 , y - 200, width / 2, , height /2);  
//        g2d.rotate(Math.toRadians(-45)); 
        
        
        graphics.setColor(Color.red);
        graphics.fillOval(x + (width * 10 / 100), y + (height * 20 / 100), width / 2, height / 2);

        //body
        graphics.setColor(MY_PINK);
        graphics.fillOval(x, y, width, height);

        //eyes  
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + (width * 35 / 100), y + (height * 30 / 100), width * 10 / 100, height * 20 / 100);
        graphics.fillOval(x + (width * 60 / 100), y + (height * 30 / 100), width * 10 / 100, height * 20 / 100);

        // blue eye color 
        graphics.setColor(new Color(37, 50, 244));
        graphics.fillOval(x + (width * 36 / 100), y + (height * 30 / 100), width * 8 / 100, height * 15 / 100);
        graphics.fillOval(x + (width * 61 / 100), y + (height * 30 / 100), width * 8 / 100, height * 15 / 100);

        //eye reflections
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + (width * 37 / 100), y + (height * 30 / 100), width * 5 / 100, height * 10 / 100);
        graphics.fillOval(x + (width * 62 / 100), y + (height * 30 / 100), width * 5 / 100, height * 10 / 100);

        // pink cheeks
        graphics.setColor(new Color(251, 20, 170));
        graphics.fillOval(588, 450, 40, 30);
        graphics.fillOval(x + (width * 30 / 100), y + (height * 50 / 100), width * 10 / 100, height * 5 / 100);
        graphics.fillOval(x + (width * 66 / 100), y + (height * 50 / 100), width * 10 / 100, height * 5 / 100);
        
        // mouth 
        graphics.setColor(new Color(240, 61, 154));
        graphics.fillOval(585, 400, 40, 80);
        
        
        
        

//        graphics.setColor(Color.BLACK);
//        graphics.fillOval(540, 310, 40, 80);
//        graphics.fillOval(640, 310, 40, 80);
//        graphics.setColor(Color.white);
//        graphics.fillOval(555, 310, 20, 40);
//        graphics.fillOval(655, 310, 20, 40); 
//        graphics.setColor(new Color(37, 50, 244));
//        graphics.fillOval(540, 310, 20, 40);
//        graphics.fillOval(655, 310, 20, 40);
    }

    public Kirby(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;

    }

    private int x;
    private int y;
    private int height;
    private int width;

    void setX(int x) {
    }

    void setY(int y) {
    }

}
