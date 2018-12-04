package tienda.modelo;

/**
 *
 * @author qooki
 */

/**
 * La clase Administrador es una instancia que permite registrar al usuario que administra la tienda.
 * Las características que se pueden agregar son el nombre, contraseña, usuario (de cuenta) y rango
 */
public class Administrador {
    //Atributos
    private String usuario;
    private String contrasena;
    private String nombre;
    private Byte rango;
    
/**
 * En ésta misma, se emplean dos tipos de constructores:
 * El primero permite crear un objeto con un nombre (String) y con el rango (Byte).
 * El segundo permite la creaciòn del objeto únicamente con el paso del nombre (String).
 */
    public Administrador(String nom, byte rang)
    {
        this.nombre = nom;
        this.rango = rang;
    }
    
    public Administrador(String nom)
    {
        this.nombre = nom;
    }
 /**
 * Los métodos empleados para la clase Administrador son meramente para extracción o muestra de información.
 * El único método con funcionalidad extra es el siguiente:
 * loginCorrecto: Determina si la contraseña escrita y el usuario coinciden con el declarado en el objeto y returna true/false
 */
    public boolean loginCorrecto(String usuario, String contrasena)
    {
        
    }
    
    public byte obtenerRango()
    {
        return this.rango;
    }
    
    public String obtenerNombre()
    {
        return this.nombre;
    }
    
    public String toString()
    {
        return "Usuario: "+usuario+"\nNombre: "+nombre+"\nRango: "+rango;
    }
}
