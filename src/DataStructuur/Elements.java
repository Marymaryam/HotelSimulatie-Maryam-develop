/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuur;

/**
 *
 * @author Mollaiedaryani
 */
public class Elements {

    public static HotelElements getFactory(String gekozen){
        if(gekozen.equalsIgnoreCase("vorm")){
            return new Vorm("inja", 3, null, null);
        } else if(gekozen.equalsIgnoreCase("beweging")){
           // return new BewegingFactory();
        } else if(gekozen.equalsIgnoreCase("kleur")){
            //return new KleurFactory();
        }
        return null;
    }
}
