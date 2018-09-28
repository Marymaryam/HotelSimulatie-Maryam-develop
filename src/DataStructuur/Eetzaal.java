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
public class Eetzaal implements IVorm {
    private final String soortGebied;
    private final int capaciteit;
    private final Point2D dimentie;
    private final Point2D positie;
    private final Color kleur;

    public Eetzaal(String soortGebied, int capaciteit, Point2D dimentie, Point2D positie, Color kleur) {
        this.soortGebied = soortGebied;
        this.capaciteit = capaciteit;
        this.dimentie = dimentie;
        this.positie = positie;
        this.kleur = Color.ORANGE;        
    }

    public String getSoortGebied() {
        return soortGebied;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public Point2D getDimentie() {
        return dimentie;
    }

    public Point2D getPositie() {
        return positie;
    }

    public Color getKleur() {
        return kleur;
    }
    
    @Override
    public void teken() {
        System.out.print("");
        System.out.print(this.kleur);
    }
    
}
