
package main;
import models.ModelCSV;
import views.ViewCSV;
import controllers.ControllerCSV;

/**
 *
 * @author ManuelAlonsoMH
 */
public class MAIN {

    /**metodo que permite el uso de la aplicacion
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelCSV modelCSV = new ModelCSV();
        ViewCSV viewCSV = new ViewCSV(); 
        ControllerCSV controllercsv = new ControllerCSV(modelCSV, viewCSV);
    }
    
}
