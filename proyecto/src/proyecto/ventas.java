
package proyecto;

public class ventas 
{
    private int codventa, unidadv;
    private String fechaventa, clientev, productov,estado,direccionv; 
    private double preciov,totalv;

    public ventas(int codventa, int unidadv, String fechaventa, String clientev, String productov, double preciov, double totalv, String estado,String direccionv)
    {
        this.clientev=clientev;
        this.codventa=codventa;
        this.fechaventa=fechaventa;
        this.preciov=preciov;
        this.productov=productov;
        this.unidadv=unidadv;
        this.totalv=totalv;
        this.estado=estado;
        this.direccionv=direccionv;
    }

    public int getCodventa() {
        return codventa;
    }

    public void setCodventa(int codventa) {
        this.codventa = codventa;
    }

    public int getUnidadv() {
        return unidadv;
    }

    public void setUnidadv(int unidadv) {
        this.unidadv = unidadv;
    }

    public String getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(String fechaventa) {
        this.fechaventa = fechaventa;
    }

    public String getClientev() {
        return clientev;
    }

    public void setClientev(String clientev) {
        this.clientev = clientev;
    }

    public String getProductov() {
        return productov;
    }

    public void setProductov(String productov) {
        this.productov = productov;
    }

    public double getPreciov() {
        return preciov;
    }

    public void setPreciov(double preciov) {
        this.preciov = preciov;
    }

    public double getTotalv() {
        return totalv;
    }

    public void setTotalv(double totalv) {
        this.totalv = totalv;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccionv() {
        return direccionv;
    }

    public void setDireccionv(String direccionv) {
        this.direccionv = direccionv;
    }
    
    public String toString()
        {
            return fechaventa+"         "+clientev+"            "+codventa;            
        }
    
}
