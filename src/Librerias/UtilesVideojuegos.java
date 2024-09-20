package Librerias;

public class UtilesVideojuegos {

    //Valores predeterminados
    public static final String DEF_NOMBRE = "Default";
    public static final String DEF_TIPO = "Fisico";
    public static final double DEF_PRECIO = 0;
    public static final String DEF_PLATAFORMA = "Multiplataforma";

    public static boolean validarNombre(String nombre) {
        return nombre != null && !nombre.isEmpty();
    }

    public static boolean validarTipo(String tipo) {
        return true;
    }

    public static boolean validarPrecio(double precio) {
        return precio >= 0;
    }



}
