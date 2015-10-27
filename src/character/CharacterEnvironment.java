/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author sofialuzgalbanpatterson
 */
class CharacterEnvironment extends Environment {

    Kirby kirby;
    private Kirby kBig;
    private Kirby kSmall;

//    public CharacterEnvironment(Kirby kirby) {
//        this.kirby = kirby;
//    }
    public CharacterEnvironment() {
        kBig = new Kirby(400, 150, 400, 400);
        kSmall = new Kirby(200, 100, 200, 200);
    }

    @Override
    public void initializeEnvironment() {

    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        if (kSmall != null) {
            kSmall.setX(e.getX());
            kSmall.setY(e.getY());
        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (kBig != null) {
            kBig.draw(graphics);

        }

        if (kSmall != null) {
            kSmall.draw(graphics);
        }
    }

}
