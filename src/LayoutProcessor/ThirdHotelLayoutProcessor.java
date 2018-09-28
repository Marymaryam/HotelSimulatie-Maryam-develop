package LayoutProcessor;

import Interfaces.IHotelLayoutProcessor;
import Mappers.HotelSimulatieMapper;
import Reader.JsonReader;
import org.json.simple.JSONArray;

public class ThirdHotelLayoutProcessor implements IHotelLayoutProcessor {

    @Override
    public void processHotelLayout(String hotelLayout) {

        JsonReader jsonReader = new JsonReader();
        JSONArray getJsonData = jsonReader.getJsonData(hotelLayout);

        HotelSimulatieMapper hotelMapper = new HotelSimulatieMapper();
        hotelMapper.mapCinema(getJsonData);

        //GUI WRITER met de gemapte waarden meegeven

    }
}
