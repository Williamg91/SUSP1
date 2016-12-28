import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Panelet extends JPanel {
    Datastream data;

    public Panelet(Datastream data) {
        this.data = data;

    }
    //Denne klasse skal bruges til at tegne en løbende opdateret graf med double værdier. Dvs. først en, så den næste.

    private void scaleWindow() {

    }

    public void paintComponent(Graphics g) {
//Tegn X aksen med offset
        g.drawLine(0, this.getHeight() - 45, this.getWidth(), this.getHeight() - 45);
 //Og y aksen med offset
        g.drawLine(45, 0, 45, this.getHeight());
        for(int i=0;i<16;i++){
            //tegn hak for graf
            g.drawLine();
        }

        //g.drawLine(0, 0, 125, 2 * (int) data.generator());


    }


}
