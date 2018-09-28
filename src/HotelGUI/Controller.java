package HotelGUI;

import LayoutProcessor.FirstHotelLayoutProcessor;
import LayoutProcessor.SecondHotelLayoutProcessor;
import LayoutProcessor.ThirdHotelLayoutProcessor;
import javafx.event.ActionEvent;
import javafx.stage.FileChooser;

import java.io.File;


public class Controller {
    private static final String hotel1Layout = "hotel1.layout";
    private static final String hotel2Layout = "hotel2.layout";
    private static final String hotel3Layout = "hotel3.layout";

    public void ButtonImportAction(ActionEvent event){

        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);
        String hotelFileName = selectedFile.getName();

        switch (hotelFileName){
            case hotel1Layout:
                new FirstHotelLayoutProcessor().processHotelLayout(hotelFileName);
                    break;
            case hotel2Layout:
                new SecondHotelLayoutProcessor().processHotelLayout(hotelFileName);
                    break;
            case hotel3Layout:
                new ThirdHotelLayoutProcessor().processHotelLayout(hotelFileName);
                    break;
        }
    }

}
