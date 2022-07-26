package proyecto;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;
import javax.swing.JList;
//import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class compras 
{
    private int codcompra, unidadcompra;
    private String productoc,fechacompra,mesc;
    private double preciounit, totalc;
    
    
    public compras(int codcompra, int unidadcompra, String productoc, String fechacompra, double preciounit, double totalc,String mesc)
    {
        this.codcompra= codcompra;
        this.fechacompra=fechacompra;
        this.preciounit=preciounit;
        this.productoc=productoc;
        this.totalc=totalc;
        this.unidadcompra=unidadcompra;
        this.mesc=mesc;
        
    }

    

    public int getCodcompra() {
        return codcompra;
    }

    public void setCodcompra(int codcompra) {
        this.codcompra = codcompra;
    }

    public int getUnidadcompra() {
        return unidadcompra;
    }

    public void setUnidadcompra(int unidadventa) {
        this.unidadcompra = unidadcompra;
    }

    public String getProductoc() {
        return productoc;
    }

    public void setProductoc(String productoc) {
        this.productoc = productoc;
    }

    public String getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(String fechacompra) {
        this.fechacompra = fechacompra;
    }

    public double getPreciounit() {
        return preciounit;
    }

    public void setPreciounit(double preciounit) {
        this.preciounit = preciounit;
    }

    public double getTotalc() {
        return totalc;
    }

    public void setTotalc(double totalc) {
        this.totalc = totalc;
    }

    public String getMesc() {
        return mesc;
    }

    public void setMesc(String mesc) {
        this.mesc = mesc;
    }

    public String toString()
    {
        return fechacompra+"      Compra       "+codcompra;
    }
    
}
