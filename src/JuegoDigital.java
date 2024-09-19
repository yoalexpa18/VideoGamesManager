public class JuegoDigital extends Videojuegos {

        double desc = 6;

        String tipo = "Digital";

    public JuegoDigital(String nombre, double precio, String plataforma) {
        super(nombre,precio,plataforma);


    }

    @Override
    public String toString() {return super.toString() + String.format("Tipo: %s%nCosto de envio: %.2f%nCosto total: %.2f%n",tipo, desc, precio - desc);
    }
}
