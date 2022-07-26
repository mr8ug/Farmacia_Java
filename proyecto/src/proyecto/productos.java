package proyecto;

public class productos 
{
    private int codproducto, unidades;
    private String producto;
    private double preciou;

    public productos (int codproducto, int unidades, String producto, double preciou)
    {
        this.codproducto=codproducto;
        this.preciou=preciou;
        this.producto=producto;
        this.unidades=unidades;
    }
    

    public int getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(int codproducto) {
        this.codproducto = codproducto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPreciou() {
        return preciou;
    }

    public void setPreciou(double preciou) {
        this.preciou = preciou;
    }
    
        public String toString()
        {
            return producto;
        }
    
}
