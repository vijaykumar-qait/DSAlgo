package test;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GettingResponseFromApi {

    public static void main(String[] args) throws MalformedURLException, IOException {

        // create url

        String toFind = "bangalore";

        URL url = new URL("https://www.metaweather.com/api/location/search/?query="+ toFind);

        // Send Get request and fetch data

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");

        BufferedReader br = new BufferedReader(new InputStreamReader(

                (conn.getInputStream())));


        // Read data line-by-line from buffer & print it out

        String output=br.readLine();

        while (br.readLine() != null){
            output += br.readLine();
        }

        output = output.substring(1, output.length()-1);
        System.out.println(output);

//        while ((output = br.readLine()) != null) {
//
//            System.out.println(output);
//
//        }

        JSONObject json = new JSONObject(output);
        String woeid = json.get("woeid").toString();

        URL url2 = new URL("https://www.metaweather.com/api/location/"+woeid+"/");
        conn = (HttpURLConnection) url2.openConnection();
        conn.setRequestMethod("GET");
        br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String output2 = br.readLine();
        while (br.readLine() != null){
            output2 += br.readLine();
        }

        System.out.println(output2);

        JSONObject json2 = new JSONObject(output2);
        JSONArray arr = json2.getJSONArray("consolidated_weather");

        //patter : 2020-09-02

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        for(int i=0; i<arr.length(); i++){
            JSONObject json3 = arr.getJSONObject(i);
            if(json3.get("applicable_date").equals(date)){
                System.out.println("Today wheather: " + json3.get("weather_state_name"));
                break;
            }
        }

//        JSONObject json3 = (JSONObject)arr.get(0).;
//        System.out.println(json3.toString());

        conn.disconnect();

    }
}
