public class TiendaVideojuegos {
    public static void main(String[] args) {

        String prueba = String.valueOf(new JuegoDigital("Zelda",12,Plataformas.Xbox,Genero.Aventura));
        System.out.println(prueba);

        Xbox ps = new Xbox();

        ps.switchOn();
        System.out.println(ps.getPlataforma());
    }
}