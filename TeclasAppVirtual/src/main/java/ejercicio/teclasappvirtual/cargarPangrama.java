
package ejercicio.teclasappvirtual;

/**
 *
 * @author CRIZ
 */

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class cargarPangrama {

    private final ArrayList<String> pangramas;

    public cargarPangrama() {
        pangramas = new ArrayList<>();
    }

    public void cargarPangramasDesdeArchivo(File file) {
        pangramas.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                pangramas.add(line);
            }
            System.out.println("Pangramas cargados correctamente: " + pangramas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String obtenerPangramaAleatorio() {
        if (!pangramas.isEmpty()) {
            Random random = new Random();
            int index = random.nextInt(pangramas.size());
            return pangramas.get(index);
        }
        return "No hay pangramas disponibles";
    }
    
}
