package supermercado;

abstract class  Producto {
   
    protected long codigo;
    protected int precio;
    protected boolean salida;
    

    public Producto(long codigo, int precio, boolean salida) {
        this.codigo = codigo;
        this.precio = precio;
        this.salida = false;
        
    }
    
    abstract public void producto(); 
}