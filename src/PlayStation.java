public class PlayStation implements Console {

    @Override
    public void switchOn(){
        System.out.println("PlayStation encendida");
    }
    @Override
    public void switchOff(){
        System.out.println("PlayStation apagada");
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
        System.out.println("PlayStation inicia el juego");
    }
    @Override
    public String getPlataforma() {
        return "PlayStation";
    }



}
