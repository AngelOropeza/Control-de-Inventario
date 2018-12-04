package tienda.modelo;

/**
 *
 * @author qooki
 */

/**
 * La clase Marca estructura una instancia que describe las propiedades de una Marca comercial.
 * Sus características son: un nombre y el día de la semana que provee.
 */
public class Marca {
    //Atributos
    private final String nombre;
    private Dia diaDeLaSemanaQueLlega;
    
 /**
 * El constructor implementado crea objetos recibiendo el nombre de la marca y el dia que provee.
 */
    //C O N S T R U C T O R
    public Marca(String _name, Dia _day)
    {
        this.nombre = _name;
        this.diaDeLaSemanaQueLlega = _day;
    }
    
 /**
 * Los métodos empleados en Marca son meramente de obtención de información de los atributos.
 */
    public String obtenerNombre()
    {
        return this.nombre;
    }
    
    public Dia obtenerDia()
    {
        return this.diaDeLaSemanaQueLlega;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if(o == this)
                {
                    return true;
                }
        return false;
    }
    
    @Override
    public String toString()
    {
        return "\nMarca: "+nombre+"\nDia de llegada: "+diaDeLaSemanaQueLlega;
    }
}
