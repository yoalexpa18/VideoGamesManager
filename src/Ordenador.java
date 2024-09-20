public class Ordenador implements Console {
    @Override
    public void switchOn(){
        System.out.println("Ordenador encendido");
    }
    @Override
    public void switchOff(){
        System.out.println("Ordenador apagado");
    }
    @Override
    public void installGame(){
        System.out.println("Juego installado en Ordenador");
    }
    @Override
    public void uninstallGame(){
        System.out.println("Juego desinstalado en Ordenador");
    }
    @Override
    public void playGame(){
        System.out.println("Ordenador inicia el juego");
    }

    @Override
    public String getPlataforma() {
        return "Ordenador";
    }
}
