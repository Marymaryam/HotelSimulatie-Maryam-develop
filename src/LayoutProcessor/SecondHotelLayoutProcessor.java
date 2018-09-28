package LayoutProcessor;

import Interfaces.IHotelLayoutProcessor;
import Reader.JsonReader;

public class SecondHotelLayoutProcessor implements IHotelLayoutProcessor {
    @Override
    public void processHotelLayout(String hotelLayout) {

        JsonReader jsonReader = new JsonReader();
        jsonReader.getJsonData(hotelLayout);
    }
}
