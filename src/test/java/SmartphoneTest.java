import org.example.Smartphone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SmartphoneTest {

    @Test
    void checkGetModel(){
        Smartphone smartphone = new Smartphone();
        smartphone.setModel("A8");
        String actual = smartphone.getModel();
        Assertions.assertEquals("A8", actual);
    }

    @Test
    void checkGetManufacturer(){
        Smartphone smartphone = new Smartphone();
        smartphone.setManufacturer("Nokia");
        String actual = smartphone.getManufacturer();
        Assertions.assertEquals("Nokia", actual);
    }

    @Test
    void checkStartRadio(){
        Smartphone smartphone = new Smartphone();
        boolean actual = smartphone.startRadio();
        Assertions.assertTrue(actual);
    }

    @Test
    void checkStopRadio(){
        Smartphone smartphone = new Smartphone();
        boolean actual = smartphone.stopRadio();
        Assertions.assertFalse(actual);
    }

    @Test
    void checkToString(){
        Smartphone smartphone = new Smartphone();
        smartphone.setModel("A1");
        smartphone.setManufacturer("Nokia");
        


        String actual = smartphone.toString();
        Assertions.assertEquals("Smartphone{" +
                "model='" + "A1" + '\'' +
                ", manufacturer='" + "Nokia" + '\'' +
                ", contacts=" + contacts +
                '}', actual);
    }
}
