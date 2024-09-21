public class JuegoDigital extends Videojuegos {


        String tipo = "Digital";

    public JuegoDigital(String nombre, double precio, Plataformas plataforma,Genero genero) {
        super(nombre,precio,plataforma,genero);
    }
        double desc = getPrecio() * 0.15;

    @Override
    public String toString() {return super.toString() + String.format("Tipo: %s%nDescuento: %.2f€%nCosto total: %.2f€%n",tipo, desc, precio - desc);
    }
}
