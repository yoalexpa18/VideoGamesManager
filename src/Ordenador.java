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
    public void installGame(){
        System.out.printf("Juego installado en %s.%n", plataforma.Ordenador);
    }
    @Override
    public void uninstallGame(){
        System.out.printf("Juego desinstalado en %s.%n", plataforma.Ordenador);
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
