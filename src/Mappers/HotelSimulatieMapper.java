package Mappers;

import javafx.geometry.Point2D;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import DataStructuur.Bioscoop;

import java.awt.*;

public class HotelSimulatieMapper {

    public void mapCinema(JSONArray jsonArray) {

        Bioscoop bioscoop = new Bioscoop();

        //deze loop moet uiteindelijk dusdanig worden toegepast dat het niet meerdere malen in de code voorkomt [VOOR REFACTOREN]
        for (Object object : jsonArray) {

            JSONObject jsonObject = (JSONObject) object;
            if(jsonObject.get("AreaType").toString().equals("Cinema")){

                var dimentieFormat = jsonObject.get("Dimension").toString().replaceAll("\\s", "");;
                var positieFormat = jsonObject.get("Position").toString().replaceAll("\\s", "");;

                var dimentieCoordinaten = dimentieFormat.split(",");
                var positieCoordinaten = positieFormat.split(",");

                var xDimentie = Integer.parseInt(dimentieCoordinaten[0]);
                var yDimentie = Integer.parseInt(dimentieCoordinaten[1]);
                var xPositie = Integer.parseInt(positieCoordinaten[0]);
                var yPositie = Integer.parseInt(positieCoordinaten[1]);

                bioscoop.setDimentie(new Point(xDimentie, yDimentie));
                bioscoop.setPositie(new Point(xPositie, yPositie));
            }
        }
    }
}
