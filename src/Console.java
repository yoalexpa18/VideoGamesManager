
public interface Console {
    //Encender la consola
    void switchOn();

    //Apagar la consola
    void switchOff();

    //Instalar juego
    void installGame(Videojuegos videojuego);

    //Desinstalar juego
    void uninstallGame(Videojuegos videojuego);

    //Jugar al juego
    void playGame();

    //Metodo que devuelve la plataforma de la consola
    String getPlataformas();


}
