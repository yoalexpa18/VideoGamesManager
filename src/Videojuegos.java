import Librerias.UtilesVideojuegos;

public abstract class Videojuegos {

    protected String nombre;
    protected double precio;
    protected Plataformas plataforma;


    public Videojuegos(String tipo, double precio) {
        this.nombre = UtilesVideojuegos.DEF_NOMBRE;
        this.precio = UtilesVideojuegos.DEF_PRECIO;
        this.plataforma = plataforma;
    }

    public Videojuegos(String nombre, double precio, Plataformas plataforma) {
        if (UtilesVideojuegos.validarNombre(nombre)) {
            this.nombre = nombre;
        } else {
            this.nombre = UtilesVideojuegos.DEF_NOMBRE;
        }
        if (UtilesVideojuegos.validarPrecio(precio)) {
            this.precio = precio;
        } else {
            this.precio = UtilesVideojuegos.DEF_PRECIO;
        }

        this.plataforma = plataforma;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (UtilesVideojuegos.validarNombre(nombre)) {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (UtilesVideojuegos.validarPrecio(precio)) {
            this.precio = precio;
        }
    }


    public String getPlataforma() {
        return String.valueOf(plataforma);
    }

    public void setPlataforma(Plataformas plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public boolean equals(Object obj) {
        //Valor de Retorno
        boolean testOK;

        //Discriminacion
        if (obj == null) {
            testOK = false;
        } else if (!(obj instanceof Videojuegos)) {
            testOK = false;
        } else {
            Videojuegos m = (Videojuegos) obj;
            testOK = this.nombre.equals(m.nombre) && this.precio == m.precio && this.plataforma.equals(m.plataforma);
        }
        return testOK;
    }

    @Override
    public String toString() {
        return String.format("Juego: %s%nPrecio: %.2f€%nPlataforma: %s%n", nombre, precio, plataforma);
    }


}
