public class PlayStation implements Console {

    Plataformas plataformas;

    @Override
    public void switchOn(){
        System.out.printf("%s encendida%n", plataformas.PlayStation);
    }
    @Override
    public void switchOff(){
        System.out.printf("%s apagada%n", plataformas.PlayStation);
    }
    @Override
    public void installGame(Videojuegos videojuegos){
        System.out.printf("%s installado en %s.%n",videojuegos.nombre, plataformas.PlayStation);
    }
    @Override
    public void uninstallGame(Videojuegos videojuegos){
        System.out.printf("%s desinstalado en %s %n",videojuegos.nombre, plataformas.PlayStation);
    }
    @Override
    public void playGame(){
        System.out.printf("%s inicia el juego%n", plataformas.PlayStation);
    }
    @Override
    public String getPlataforma() {
        return "" + plataformas.PlayStation;
    }



}
