public interface Console {
    //Encender la consola
    void switchOn();

    //Apagar la consola
    void switchOff();

    //Instalar juego
    void installGame();

    //Desinstalar juego
    void uninstallGame();

    //Jugar al juego
    void playGame();

    //Metodo que devuelve la plataforma de la consola
    String getPlataforma();


}
