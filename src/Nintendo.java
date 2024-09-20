public class Nintendo implements Console {
    @Override
    public void switchOn(){
        System.out.println("Nintendo encendida");
    }
    @Override
    public void switchOff(){
        System.out.println("Nintendo apagada");
    }
    @Override
    public void installGame(){
        System.out.println("Juego installado en Nintendo");
    }
    @Override
    public void uninstallGame(){
        System.out.println("Juego desinstalado en Nintendo");
    }
    @Override
    public void playGame(){
        System.out.println("Nintendo inicia el juego");
    }

    @Override
    public String getPlataforma() {
        return "Nintendo";
    }
}
