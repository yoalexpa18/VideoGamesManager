public class Xbox implements Console{
    @Override
    public void switchOn(){
        System.out.println("Xbox encendida");
    }
    @Override
    public void switchOff(){
        System.out.println("Xbox apagada");
    }
    @Override
    public void installGame(){
        System.out.println("Juego installado en PlayStation");
    }
    @Override
    public void uninstallGame(){
        System.out.println("Juego desinstalado en PlayStation");
    }
    @Override
    public void playGame(){
        System.out.println("Xbox inicia el juego");
    }

    @Override
    public String getPlataforma() {
        return "Xbox";
    }

}
