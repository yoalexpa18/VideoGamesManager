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
    public void installGame(){
        System.out.printf("Juego installado en %s.%n", plataforma.Nintendo);
    }
    @Override
    public void uninstallGame(){
        System.out.printf("Juego desinstalado en %s%n", plataforma.Nintendo);
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
