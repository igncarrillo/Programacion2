package ar.edu;

import ar.edu.exceptions.OnlyMinorException;
import ar.edu.models.OtherClass;
import ar.edu.models.Persona;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run()  {
        List<Persona> personas = new ArrayList<>();
        OtherClass other = new OtherClass();
        personas.add(new Persona("Ignacio","Carrillo",null, 25));
        try {
            for (Persona p: personas){
                other.verifyAge(p);
            }
        }
        catch (OnlyMinorException e){
            e.getMessage();
            e.printStackTrace();
        }

    }

}
