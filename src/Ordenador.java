import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ordenador implements Console {

    Plataformas plataformas;

    List<Videojuegos> vlis = new ArrayList<>();
    @Override
    public void switchOn() {
        System.out.printf("%s encendido%n", plataformas.Ordenador);
    }

    @Override
    public void switchOff() {
        System.out.printf("%s apagado%n", plataformas.Ordenador);
    }

    @Override
    public void installGame(Videojuegos videojuegos) {
        // Agregar el videojuego a la lista
        vlis.add(videojuegos);

        // Validar la consola y escribir en el archivo si es compatible
        ValidarConsola(Plataformas.valueOf(videojuegos.getPlataforma()), vlis);

        // Mensaje de confirmación
        System.out.printf("%s instalado en %s%n", videojuegos.getNombre(), plataformas.Ordenador);

    }

    @Override
    public void uninstallGame(Videojuegos videojuegos) {
        System.out.printf("%s desinstalado en %s %n", videojuegos.nombre, plataformas.Ordenador);
    }

    @Override
    public void playGame() {
        System.out.printf("%s inicia el juego%n", plataformas.Ordenador);
    }

    @Override
    public String getPlataformas() {
        return "" + plataformas.Ordenador;
    }

    private void ValidarConsola(Plataformas plataforma, List<Videojuegos> vlis) {
        // Comprobar si la plataforma es Ordenador
        if (plataforma == Plataformas.Ordenador) {
            System.out.printf("Juego compatible con %s%n", plataforma);


            try (FileWriter fw = new FileWriter("Ordenador.txt")) {

                // Insertar sobre la lista de videojuegos y escribir los datos en el archivo
                for (Videojuegos v : vlis) {
                    String line = v.getNombre() + "," + v.getPlataforma() + "," + v.getPrecio() + "," + v.getGenero();
                    fw.write(line + "\n");
                }

                System.out.println("Información escrita correctamente en el archivo.");

            } catch (IOException e) {
                System.err.println("Error al escribir en el archivo: " + e.getMessage());
                throw new RuntimeException(e);
            }

        } else {
            // Si la plataforma no es Ordenador
            System.out.printf("Juego incompatible con %s%n", plataforma);
        }
    }



}
