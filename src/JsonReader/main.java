package JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class main {

    private static final String filePath = "Hotel3.layout";

    public static void main(String[] args) {

        try {
            // read the json file
            FileReader reader = new FileReader(filePath);

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);



            // get an array from the JSON object
            JSONArray hotel= (JSONArray) jsonObject.get("Hotel");

            // take the elements of the json array
            for(int i=0; i<hotel.size(); i++){
                System.out.println("The " + i + " element of the array: "+hotel.get(i));
            }

            // take each value from the json array separately
            for (Object aLang : hotel) {
                JSONObject innerObj = (JSONObject) aLang;
                System.out.println("AreaType " + innerObj.get("AreaType") + " Position " + innerObj.get("Position"));
            }

            // iterator
            Iterator it = hotel.iterator();
            System.out.println("met iterator: ");
            while(it.hasNext())
                System.out.println(it.next());


        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}