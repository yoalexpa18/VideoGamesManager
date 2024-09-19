public class JuegoFisico extends Videojuegos {

        double envio = 6;

        String tipo = "Fisico";

    public JuegoFisico(String nombre, double precio, String plataforma) {
        super(nombre,precio,plataforma);
    }

    @Override
    public String toString() {return super.toString() + String.format("Tipo: %s%nCosto de envio: %.2f%nCosto total: %.2f%n",tipo, envio, precio + envio);
    }
}
