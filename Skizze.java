import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Skizze
{

    void draw(GraphicsContext gc){
        gc.setFill(Color.BLUE);
        
        double x = Math.random()*400;
        double y = Math.random()*400;
     
        gc.fillOval(x,y,20,20);                
    }

}
