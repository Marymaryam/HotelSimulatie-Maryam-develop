/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuur;

import Interfaces.IVorm;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

/**
 *
 * @author Mollaiedaryani
 */
public class Gast implements IVorm {
    
    private final String soortElement;
    private final Point2D positie;
    private final Color kleur;

    public Gast(String soortElement, Point2D positie, Color kleur) {
        this.soortElement = soortElement;
        this.positie = positie;
        
        this.kleur = Color.BLUE;        
    }

    public String getSoortElement() {
        return soortElement;
    }

    public Point2D getPositie() {
        return positie;
    }

    public Color getKleur() {
        return kleur;
    }

    @Override
    public void teken() {
        System.out.print("salam inja gast ast");
        System.out.print(this.kleur);
    }
    
}
