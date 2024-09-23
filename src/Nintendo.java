public class Nintendo implements Console {

    Plataformas plataforma;

    @Override
    public void switchOn(){
        System.out.printf("%s encendida%n", plataforma.Nintendo);
    }
    @Override
    public void switchOff(){
        System.out.printf("%s apagada%n", plataforma.Nintendo);
    }
    @Override
    public void installGame(Videojuegos videojuegos){
        System.out.printf("%s installado en %s.%n",videojuegos, plataforma.Nintendo);
    }
    @Override
    public void uninstallGame(Videojuegos videojuegos){
        System.out.printf("%s desinstalado en %s %n",videojuegos.nombre, plataforma.Nintendo);
    }
    @Override
    public void playGame(){
        System.out.printf("%s inicia el juego%n", plataforma.Nintendo);
    }

    @Override
    public String getPlataforma() {
        return "" + plataforma.Nintendo;
    }
}
