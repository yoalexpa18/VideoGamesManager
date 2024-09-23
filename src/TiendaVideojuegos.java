public class TiendaVideojuegos {
    public static void main(String[] args) {

        Videojuegos prueba = new JuegoDigital("Halo",12,Plataformas.Xbox,Genero.Aventura);
        System.out.println(prueba);

        Xbox consola = new Xbox();

        consola.switchOn();
        System.out.println(consola.getPlataforma());
        consola.installGame(prueba);

    }
}