package examenmontielrua.examen;

public class Pedido {
    
    private int Precio;
    private int Cantidad;
    private String Descripcion;

    public int getPrecio() {
        return Precio;
    }
    public int getCantidad(){
        return Cantidad;
    }
    public String getDescripcion(){
        return Descripcion;
    }

    public void setPrecio(int Precio){
        this.Precio = Precio;
    }
    public void setCantidad(int Cantidad){
        this.Cantidad = Cantidad;
    }
    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }
}
