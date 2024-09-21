package Librerias;

public class UtilesVideojuegos {

    //Valores predeterminados
    public static final String DEF_NOMBRE = "Default";
    public static final double DEF_PRECIO = 0;

    public static boolean validarNombre(String nombre) {
        return nombre != null && !nombre.isEmpty();
    }


    public static boolean validarPrecio(double precio) {
        return precio >= 0;
    }



}
