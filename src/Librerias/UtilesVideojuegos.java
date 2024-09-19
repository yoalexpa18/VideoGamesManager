package Librerias;

public class UtilesVideojuegos {

    //Valores predeterminados
    public static final String DEF_NOMBRE = "Default";
    public static final String DEF_TIPO = "Fisico";
    public static final double DEF_PRECIO = 0;
    public static final String DEF_PLATAFORMA = "Multiplataforma";

    private static final String PLAT_PLAY = "Playstation";
    private static final String PLAT_NINT = "Nintendo";
    private static final String PLAT_COMP = "Ordenador";
    private static final String PLAT_XBOX = "Xbox";

    public static boolean validarNombre(String nombre) {
        return nombre != null && !nombre.isEmpty();
    }

    public static boolean validarTipo(String tipo) {
        return true;
    }

    public static boolean validarPrecio(double precio) {
        return precio >= 0;
    }

    public static boolean validarPlataforma(String plataforma) {
        if (plataforma != null && !plataforma.isEmpty()) {
            return plataforma.equalsIgnoreCase(PLAT_PLAY) || plataforma.equalsIgnoreCase(PLAT_NINT)
                    || plataforma.equalsIgnoreCase(PLAT_COMP) || plataforma.equalsIgnoreCase(PLAT_XBOX);
        }
        return false;
    }

}
