public class Xbox implements Console{

    Plataformas plataformas;

    @Override
    public void switchOn(){
        System.out.printf("%s encendida%n", plataformas.Xbox);
    }
    @Override
    public void switchOff(){
        System.out.printf("%s apagada%n", plataformas.Xbox);
    }
    @Override
    public void installGame(){
        System.out.printf("Juego installado en %s.%n", plataformas.Xbox);
    }
    @Override
    public void uninstallGame(){
        System.out.printf("Juego desinstalado en %s.%n", plataformas.Xbox);
    }
    @Override
    public void playGame(){
        System.out.printf("%s inicia el juego%n", plataformas.Xbox);
    }

    @Override
    public String getPlataforma() {
        return "" + plataformas.Xbox;
    }

}
