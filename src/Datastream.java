import java.io.*;
import java.util.Date;
import java.util.Random;

/**
 * Created by William on 28-12-2016.
 */
public class Datastream {
    //This class is utilized for collecting data from outside the program
    //it also writes out data to a file.


    public double generator() {
        double result;
        Random r = new Random();

        result = 60 + (90 - 60) * r.nextDouble();

        //System.out.println(result);
        return result;

    }

    public static void saveFile(double out) {
        try {
            FileWriter fw = new FileWriter("hejMor.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print("Værdi målt: "+ out + "\n På datoen: " + new Date()+ "\n" );
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
