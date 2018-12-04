/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.modelo;

/**
 *
 * @author qooki
 */

/**
 * Categoria es una instancia que describe la categoria de un objeto, únicamente registra el nombre de categoria.
 */
class Categoria {
    //Atributos
    private String nombre;
    
    // Constructor 
    protected Categoria(String _nombre)
    {
        this.nombre=_nombre;
    }
    
/**
 * El mètodo de obtener instancia, retorna como su nombre lo dice, la instancia.
 * La sobrecarga del toString se utiliza para obtener el único atributo de "Categoria"
 */
    public Categoria obtenerInstancia()
    {
        return this;
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
        return "Nombre: "+nombre;
    }
            
}

