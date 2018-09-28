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
public class Beweging extends HotelElements {

    public Beweging(String soortGebied, int capaciteit, Point2D dimentie, Point2D positie) {
        super(soortGebied, capaciteit, dimentie, positie);
    }

    /**
     *
     * @param vorm
     * @return
     */
    @Override
    public IVorm getVorm(String vorm) {
        return null;
    }

    @Override
    IKleur getKleur() {
        return null;
    }

    @Override
    IBeweging getBeweging() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
