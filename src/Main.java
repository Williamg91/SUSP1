

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    static Datastream data = new Datastream();

    public static void main(String[] args) {
        setupFrame();
        while (true) {

            try {
                Datastream.saveFile(data.generator());
                Thread.sleep(3000);


            } catch (Exception ex) {

            }


        }
    }

    private static void setupFrame() {
        JFrame ramme = new JFrame("hej");
        Panelet panelet = new Panelet(data);
        ramme.add(panelet);
        ramme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramme.setSize(300, 300);
        ramme.setVisible(true);

    }


}
