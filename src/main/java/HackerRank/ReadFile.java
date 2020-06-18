package HackerRank;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ReadFile {
    public static void main(String [] args){
        File file = new File(System.getProperty("user.dir")+"/data.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String st;
            reader.readLine();

            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            Date matchDate = sf.parse("2019-05-09");
            System.out.println("match date: " + matchDate);
            while ((st = reader.readLine())!=null){
                String strArr [] = st.trim().split("[|]");
                Date date = sf.parse(strArr[3]);

                if(date.compareTo(matchDate)==1){
                    System.out.println(strArr[1]);
                }

            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
