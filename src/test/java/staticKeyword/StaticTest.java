package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void metodaTest() {
        Elev Stefan = new Elev("Andrei", "Mirza");
        Stefan.prezenta();
        Elev Ana = new Elev("Cosmina", "Mirza");
        Ana.prezenta();
        Elev Eduard = new Elev("Cosmin", "Dorha");
        Eduard.prezenta();
    }

}
