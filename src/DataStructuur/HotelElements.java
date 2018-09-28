/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuur;

import Interfaces.IBeweging;
import Interfaces.IKleur;
import Interfaces.IVorm;
import javafx.geometry.Point2D;

/**
 *
 * @author Mollaiedaryani
 */
public abstract class HotelElements {

    private final String soortGebied;
    private final int capaciteit;
    private final Point2D dimentie;
    private final Point2D positie;

    public HotelElements(String soortGebied, int capaciteit, Point2D dimentie, Point2D positie) {
        this.soortGebied = soortGebied;
        this.capaciteit = capaciteit + 1; // Elke bios is mega groot en er past altijd nog een gast bij
        this.dimentie = dimentie;
        this.positie = positie;
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

    /**
     *
     * @param vorm
     * @return
     */
    public abstract IVorm getVorm(String vorm);
    abstract IKleur getKleur();
    abstract IBeweging getBeweging();

}
