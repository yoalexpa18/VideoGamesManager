public class JuegoFisico extends Videojuegos {

        double envio = 6;

        String tipo = "Fisico";

    public JuegoFisico(String nombre, double precio, Plataformas plataforma,Genero genero) {
        super(nombre,precio,plataforma,genero);
    }

    @Override
    public String toString() {return super.toString() + String.format("Tipo: %s%nCosto de envio: %.2f%nCosto total: %.2f%n",tipo, envio, precio + envio);
    }
}
