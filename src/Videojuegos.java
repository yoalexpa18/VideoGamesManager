import Librerias.UtilesVideojuegos;

public abstract class Videojuegos {

    protected String nombre;
    protected double precio;
    protected Plataformas plataforma;
    protected Genero genero;


    public Videojuegos(String tipo, double precio) {
        this.nombre = UtilesVideojuegos.DEF_NOMBRE;
        this.precio = UtilesVideojuegos.DEF_PRECIO;
        this.plataforma = plataforma;
    }

    public Videojuegos(String nombre, double precio, Plataformas plataforma, Genero genero) {
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
        this.genero = genero;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (UtilesVideojuegos.validarNombre(nombre)) {
            this.nombre = nombre;
        }
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
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
        return plataforma.toString();
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
            testOK = this.nombre.equals(m.nombre) && this.genero.equals(m.genero) && this.precio == m.precio && this.plataforma.equals(m.plataforma);
        }
        return testOK;
    }

    @Override
    public String toString() {
        return String.format("Juego: %s%nGenero: %s%nPlataforma: %s%nPrecio: %.2f€%n", nombre,genero,plataforma ,precio );
    }


}
