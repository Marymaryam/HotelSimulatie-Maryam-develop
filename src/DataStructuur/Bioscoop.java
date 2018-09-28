/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuur;


import java.awt.*;

/**
 *
 * @author Mollaiedaryani
 */
public class Bioscoop {

    // maak een datastructuur met fields, setters en getters. Deze structuur moet gebruikt kunnen worden door de mapper
    private Point dimentie;
    private Point positie;


    public void setDimentie(Point dimentie){
        this.dimentie = dimentie;
    }

    public Point getDimentie(){
        return dimentie;
    }

    public void setPositie(Point positie){
        this.positie = positie;
    }

    public Point getPositie(){
        return positie;
    }



//    private final Color kleur;

//    public Bioscoop(Color kleur) {
//        this.kleur = Color.RED;
//        positie = null;
//    }

//    public Color getKleur() {
//        return kleur;
//    }
//
//    @Override
//    public void teken() {
//        System.out.print("salam inja bioscoop ast");
//        System.out.print(this.kleur);
//    }

}
