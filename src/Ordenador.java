import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ordenador implements Console {

    Plataformas plataforma;

    @Override
    public void switchOn() {
        System.out.printf("%s encendido%n", plataforma.Ordenador);
    }

    @Override
    public void switchOff() {
        System.out.printf("%s apagado%n", plataforma.Ordenador);
    }

    @Override
    public void installGame(Videojuegos videojuegos) {
        System.out.printf("%s installado en %s.%n", videojuegos, plataforma.Ordenador);
    }

    @Override
    public void uninstallGame(Videojuegos videojuegos) {
        ValidarConsola(videojuegos.plataforma);
        System.out.printf("%s desinstalado en %s %n", videojuegos.nombre, plataforma.Ordenador);
    }

    @Override
    public void playGame() {
        System.out.printf("%s inicia el juego%n", plataforma.Ordenador);
    }

    @Override
    public String getPlataforma() {
        return "" + plataforma.Ordenador;
    }

    private void ValidarConsola(Plataformas plataforma) {

        try {
            File instalar = new File("Ordenador.txt");
            FileWriter fw = new FileWriter(instalar);

            if (plataforma == Plataformas.Ordenador) {
                System.out.printf("Juego compatible para %s%n", plataforma.Ordenador);
                BufferedWriter ecribir = new BufferedWriter(fw);


            } else {
                System.out.printf("Juego incompatible para %s%n", plataforma.Ordenador);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
