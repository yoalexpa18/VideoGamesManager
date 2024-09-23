public class Ordenador implements Console {

    Plataformas plataforma;

    @Override
    public void switchOn(){
        System.out.printf("%s encendido%n", plataforma.Ordenador);
    }
    @Override
    public void switchOff(){
        System.out.printf("%s apagado%n", plataforma.Ordenador);
    }
    @Override
    public void installGame(Videojuegos videojuegos){
        System.out.printf("%s installado en %s.%n",videojuegos, plataforma.Ordenador);
    }
    @Override
    public void uninstallGame(Videojuegos videojuegos){
        System.out.printf("%s desinstalado en %s %n",videojuegos.nombre, plataforma.Ordenador);
    }
    @Override
    public void playGame(){
        System.out.printf("%s inicia el juego%n", plataforma.Ordenador);
    }

    @Override
    public String getPlataforma() {
        return "" + plataforma.Ordenador;
    }
}
