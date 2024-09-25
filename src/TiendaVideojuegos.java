public class TiendaVideojuegos {
    public static void main(String[] args) {

        Videojuegos prueba = new JuegoDigital("Halo",00,Plataformas.Xbox,Genero.Accion);
        System.out.println(prueba);

        Xbox consola = new Xbox();

        consola.switchOn();
        System.out.println(consola.getPlataformas());
        consola.installGame(prueba);

    }
}