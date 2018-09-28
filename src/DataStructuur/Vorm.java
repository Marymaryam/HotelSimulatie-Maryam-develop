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
import javafx.scene.paint.Color;


/**
 *
 * @author Mollaiedaryani
 */
public class Vorm extends HotelElements {

    public Vorm(String soortGebied, int capaciteit, Point2D dimentie, Point2D positie) {
        super(soortGebied, capaciteit, dimentie, positie);
        
    } 
    
    @Override
    public IVorm getVorm(String vorm) {
        if(vorm == null){
            return null;
        }
        
//        if(vorm.equalsIgnoreCase("Bioscoop")){
////            return new Gast(Color.RED);
         if(vorm.equalsIgnoreCase("Eetzaal")){
            //return new Eetzaal();
        } else if(vorm.equalsIgnoreCase("Fitness")){
            return new FitnessRuimte();
        } else if(vorm.equalsIgnoreCase("Gast")){
            return new Gast("gast", null, Color.BLUE);
        } else if(vorm.equalsIgnoreCase("Kamer")){
            return new Kamer();
        } else if(vorm.equalsIgnoreCase("Lift")){
            return new Lift();
        } else if(vorm.equalsIgnoreCase("Lobby")){
            return new Lobby();
        } else if(vorm.equalsIgnoreCase("Schoonmaker")){
            return new Schoonmaker();
        } else if(vorm.equalsIgnoreCase("Trap")){
            return new Trap();
        }
        
        return null;
    }

    @Override
    public IKleur getKleur() {
        return null;
    }

    @Override
    public IBeweging getBeweging() {
        return null;
    }
    
}
