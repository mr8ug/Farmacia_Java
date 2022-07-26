/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.FileOutputStream;
import java.io.IOException;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BorderLayout;

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
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;

//
public class Proyecto extends JFrame  implements ActionListener {

JButton b11,b12,b13,b14;
JPanel panel11, panel12,panel13,panel14;


//Clientes
//------------------------
	JPanel panel2,panel21,panel22,panel23,panel24,panel25;

	JButton b201,b202,b203,b204,b205,b206;
	JButton b211,b212,b213,b214;
	JButton b221,b222,b223;
	JButton b231,b232,b233,b234;
        JButton b241,b242,b243;
        
	
	JLabel l211,l212,l213,l214,l215,l216,l217,l218,l219;
            JLabel l213a,l214a,l215a,l216a,l217a,l218a,l219a;
        JLabel l221,l222,l223,l224,l225,l226,l227,l228,l229,l2210,l2211,l2212,l2213,l2214;
            JLabel l228a,l229a,l2210a,l2211a,l2212a,l2213a,l2214a;        
	JLabel l231;
        JLabel l241,l242,l243;
//editar---------        
        JLabel l251,l252,l253,l254,l255,l256,l257,l258;
        JTextField t253,t254,t255,t256,t257;
        JButton b251,b252,b253;
        JComboBox c251;
        
        
	
	JTextField t211;
	JTextField t221,t222,t223,t224,t225,t226;
	
	JComboBox c211;	//combo para buscar clientes
        JComboBox c231,c232,c221;//c221 es para establecer departamentos
	
        JList d221, d241;
        DefaultListModel modeloLista = new DefaultListModel();
        JList d222;
        DefaultListModel modeloLista22 = new DefaultListModel();
        DefaultListModel modeloLista24 = new DefaultListModel();
        
        JScrollPane jspScrollLista;
        JScrollPane scrollPane;
        
        JList d231,d231b;
        DefaultListModel modeloLista23 = new DefaultListModel();
        DefaultListModel modeloLista23b = new DefaultListModel();
        JScrollPane barra23;
        
//Compras
//-------------------
	JPanel panel3,panel31,panel32,panel33,panel34;
	JButton b301,b302,b303,b304;
	JButton b311,b312,b313;
	JButton b321,b322,b323;
	JButton b331,b332,b333;

	JLabel l311,l312,l313,l314,l315;
            JLabel l313a,l314a;
        JLabel l321, l322;

	JTextField t311,t312;

	JComboBox c311;/*combo de productos*/ JComboBox c312; //combo No de unidades
        JComboBox c321;
	
        DefaultListModel modeloLista32 = new DefaultListModel();
	JList d32;
        DefaultListModel modeloLista32b = new DefaultListModel();
	JList d32b;
	
        
        JLabel titu,titu2;
//Ventas
//-------------------
	JPanel panel4,panel41,panel42,panel43,panel44,panel45;

        JButton b401,b402,b403,b404,b405,b406;
	JButton b411,b412,b413,b414;
	JButton b421,b422;
	JButton b431,b432,b433;

	JComboBox c411,c412,c413;
        
        JLabel l411,l412,l413;JLabel l414, l421; 
        
        JList d411,d42;
        DefaultListModel modeloLista2 = new DefaultListModel();
        DefaultListModel modeloLista42 = new DefaultListModel();
        JButton b423;
        
        JFileChooser pdf1;
        JTextField t411;

        JLabel l431,l432;
        JComboBox c431;
        JList d43,d43b;
        DefaultListModel modeloLista43 = new DefaultListModel();
        DefaultListModel modeloLista43b = new DefaultListModel();
        
        JButton b441,b442,b443;
        JLabel l441,l442;
        JComboBox c441;
        JList d44,d44b;
        DefaultListModel modeloLista44 = new DefaultListModel();
        DefaultListModel modeloLista44b = new DefaultListModel();

        JButton b451,b452,b453;
        JLabel l451,l452,l453,l454,l455,l456,l457,l458,l459;
            JLabel l453a,l454a,l455a,l456a,l457a,l458a;
        JComboBox c451,c452;
        
//INVENTARIO----------------------------

	JPanel panel5;
	JButton b501,b502,b503,b504,b505;

	JLabel l501,l502,l503,l504,l505,l506,l507,l508;
            JLabel l503a,l504a,l505a,l506a;

	JComboBox c501;/*combo de productos*/ 
        JList d5;
        DefaultListModel modeloLista5 = new DefaultListModel();
        JList invisible;
        DefaultListModel modeloLista5b = new DefaultListModel();
        
        JTextField t5; JButton b5;
//-----------------------
//------------------------

JButton b31,b32,b33,b34;
JTextField c31,c32,c33,c34,c35,c36,c37;
JLabel t31,t32,t33,t34,t35,t36,t37,t38,t39;

Font titulo,subtitulo,subsubtitulo,tnormal;

	public Proyecto()
	{
		setTitle("Farmacia CuraTodo");
		setSize(600,700);				
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(Proyecto.EXIT_ON_CLOSE);
		
		//FUENTES
				titulo=new Font("Arial", Font.BOLD, 15);
				subtitulo=new Font("Arial",Font.BOLD, 13);		
                                subsubtitulo=new Font("Arial",Font.BOLD, 10);		
                                
		
//PANEL 1: MENU PRINCIPAL-----------------
//-------------------------------
				
		panel11= new JPanel();
		panel12= new JPanel();
		panel13= new JPanel();
		
		panel22= new JPanel();
		
		getContentPane().add(panel11);

		panel11.setVisible(true);		
		panel11.setLayout(null);
		
		b11= new JButton();
		b12= new JButton();
		b13= new JButton();
		b14= new JButton();
				
		b11.setText("Clientes");		
		b11.setBounds(20,25,100,30);			
		b11.addActionListener((ActionListener) this);
		panel11.add(b11);
		
		b12.setText("Compras");		
		b12.setBounds(20,75,100,30);		
		b12.addActionListener((ActionListener) this);
		panel11.add(b12);
		
		b13.setText("Ventas");		
		b13.setBounds(20,125,100,30);
		b13.addActionListener((ActionListener) this);
		panel11.add(b13);
		
		b14.setText("Inventario");		
		b14.setBounds(20,175,100,30);
		b14.addActionListener((ActionListener) this);
		panel11.add(b14);
		//panel11.setVisible(true);

//----------------------------------
//PANEL 2: CLIENTES :v
		
		//---------------PANEL PRINCIPAL
		//-------------------
		panel2= new JPanel();
		panel2.setLayout(null);
		panel2.setVisible(false);
//		panel2.setBackground(Color.RED);
				
		b201= new JButton();
		b202= new JButton();
		b203= new JButton();
		b204= new JButton();
                b205= new JButton();
                b206=new JButton();
                
		b201.setText("Regresar");
		b201.setBounds(20,25,100,30);			
		b201.addActionListener((ActionListener) this);
		panel2.add(b201);
		
		b202.setText("Buscar Cliente");
		b202.setBounds(20,75,200,30);			
		b202.addActionListener((ActionListener) this);
		panel2.add(b202);
		
		b203.setText("Registrar Cliente");
		b203.setBounds(20,125,200,30);			
		b203.addActionListener((ActionListener) this);
		panel2.add(b203);

                b204.setText("Compras por Clientes");
		b204.setBounds(20,175,200,30);			
		b204.addActionListener((ActionListener) this);
		panel2.add(b204);                
		
		b205.setText("Registro últimos 30 dias");
		b205.setBounds(20,225,200,30);			
		b205.addActionListener((ActionListener) this);
		panel2.add(b205);

		b206.setText("Editar Información de clientes");
		b206.setBounds(20,275,200,30);			
		b206.addActionListener((ActionListener) this);
		panel2.add(b206);
                
		//---------------PANEL 21: BUSCAR CLIENTE
		//-------------------
                //CLIENTES YA REGISTRADOS
                    String nit, cui, nombre, apellido, edad, direccion,fecha;  
                    double consumo; int numdecompra;
                    
                    nit = "7327327-2";
                    cui = "4564-55656-0101";                    
                    nombre = "Luis";
                    apellido = "Torres";
                    edad = "15";                    	
                    direccion = "Chimaltenango";   
                    fecha = "12 - oct - 2016";
                    consumo=123123;
                    numdecompra=5;
                    
                    clientes cliente1 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "73273-2";
                    cui = "4564-55656-0101";                    
                    nombre = "Jose";
                    apellido = "fernando";
                    edad = "15";                    	
                    direccion = "Chimaltenango";                                        
                    fecha = "17 - sep - 2017";
                    consumo=15000;
                    numdecompra=5;
                    clientes cliente2 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "56987-2";
                    cui = "4824-32156-0258";                    
                    nombre = "Pedro";
                    apellido = "Juarez";
                    edad = "25";                    	
                    direccion = "Chimaltenango";                                        
                    fecha = "12 - enero - 2017";
                    consumo=12213;
                    numdecompra=5;
                    clientes cliente3 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "89543-1";
                    cui = "9584-89453-4851";                    
                    nombre = "Ana";
                    apellido = "Moralez";
                    edad = "20";                    	
                    direccion = "Guatemala";                                        
                    fecha = "23 - jul - 2017";
                    consumo=13268;
                    numdecompra=5;
                    clientes cliente4 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "86542-13";
                    cui = "58962-87654-48632";                    
                    nombre = "Carlos";
                    apellido = "Grajeda";
                    edad = "21";                    	
                    direccion = "Sacatepequez";                                        
                    fecha = "02 - mayo - 2015";
                    consumo=5023;
                    numdecompra=5;
                    clientes cliente5 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "68952-5";
                    cui = "35487-86579-56421";                    
                    nombre = "Pablo";
                    apellido = "Velazques";
                    edad = "18";                    	
                    direccion = "Huehuetenango";                                        
                    fecha = "28 - Ago - 2017";
                    consumo=10000;
                    numdecompra=5;
                    clientes cliente6 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "97854-6";
                    cui = "8935-56987-7812";                    
                    nombre = "Luz";
                    apellido = "Hernandez";
                    edad = "22";                    	
                    direccion = "Zacapa";                                        
                    fecha = "17 - abril - 2016";
                    consumo=15612;
                    numdecompra=5;
                    clientes cliente7 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "56988-3";
                    cui = "8654-78912-5872";                    
                    nombre = "Manuel";
                    apellido = "Perez";
                    edad = "23";                    	
                    direccion = "Jutiapa";                                        
                    fecha = "17 - sep - 2014";
                    consumo=5000;
                    numdecompra=5;
                    clientes cliente8 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "52368-7";
                    cui = "6589-89512-1201";                    
                    nombre = "lizbeth";
                    apellido = "Bautista";
                    edad = "19";                    	
                    direccion = "El Progreso";                                        
                    fecha = "20 - sep - 2017";
                    consumo=12000;
                    numdecompra=5;
                    clientes cliente9 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "45687-8";
                    cui = "2353-58658-1221";                    
                    nombre = "Rosa";
                    apellido = "Baldez";
                    edad = "24";                    	
                    direccion = "Sacatepequez";                                        
                    fecha = "05 - Ene - 2012";
                    consumo=12350;
                    numdecompra=5;
                    clientes cliente10 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "56223-6";
                    cui = "4455-50235-0221";                    
                    nombre = "Fernanda";
                    apellido = "Juarez";
                    edad = "18";                    	
                    direccion = "Chimaltenango";                                        
                    fecha = "03 - sep - 2017";
                    consumo=13251;
                    numdecompra=5;
                    clientes cliente11 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "56897-5";
                    cui = "2050-36510-1320";                    
                    nombre = "Andrea";
                    apellido = "Solarez";
                    edad = "22";                    	
                    direccion = "Sacatepequez";                                        
                    fecha = "22 - Feb - 2016";
                    consumo=12365;
                    numdecompra=5;
                    clientes cliente12 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "22364-1";
                    cui = "1213-78742-2300";                    
                    nombre = "Karmen";
                    apellido = "Ortiz";
                    edad = "19";                    	
                    direccion = "Peten";                                        
                    fecha = "12 - Marzo - 2013";
                    consumo=12140;
                    numdecompra=5;
                    clientes cliente13 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "70023-2";
                    cui = "2335-55688-0021";                    
                    nombre = "Daniel";
                    apellido = "Quezada";
                    edad = "25";                    	
                    direccion = "Jutiapa";                                        
                    fecha = "02 - Sep - 2013";
                    consumo=12000;
                    numdecompra=5;
                    clientes cliente14 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    
                    nit = "12332-1";
                    cui = "2235-23112-2323";                    
                    nombre = "Juan";
                    apellido = "Perez";
                    edad = "26";                    	
                    direccion = "Escuintla";                                        
                    fecha = "24 - Nov - 2012";
                    consumo=13500;
                    numdecompra=5;
                    clientes cliente15 = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);                

//-------------------
//PRODUCTOS-------------------
//------------------------------------
                    int codproducto, unidades;
                    String producto;
                    double preciou;
                    
                    codproducto = 556651;
                    producto = "Aspirina 100 mg";                    
                    unidades = 500;
                    preciou = 2.50;
                    productos producto1 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 56564;
                    producto = "Dolo neuroheidelg 75mg inyectado";                    
                    unidades = 300;
                    preciou = 62.75;
                    productos producto2 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 778756;
                    producto = "Acetaminofen 120MG/5ML*60 ml";                    
                    unidades = 134;
                    preciou = 5.03;
                    productos producto3 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 56756;
                    producto = "Neuroheidelg 25000 inyectado";                    
                    unidades = 185;
                    preciou = 58.40;
                    productos producto4 = new productos(codproducto, unidades,producto,preciou);
                    
                    codproducto = 4327756;
                    producto = "Retranquil natural 30 capsulas";                    
                    unidades = 345;
                    preciou = 53.75;
                    productos producto5 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 21365;
                    producto = "Dolo neuroheidelg 50Mg ";                    
                    unidades = 355;
                    preciou = 50.25;
                    productos producto6 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 42365;
                    producto = "Andrivit ampolla";                    
                    unidades = 455;
                    preciou = 54.80;
                    productos producto7 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 23656;
                    producto = "Brucobal 500 mg";                    
                    unidades = 353;
                    preciou = 25.75;
                    productos producto8 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 63215;
                    producto = "Acetaminofen 120 MG";                    
                    unidades = 505;
                    preciou = 5.75;
                    productos producto9 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 63215;
                    producto = "Amoxicilina 250 MG";                    
                    unidades = 405;
                    preciou = 20.70;
                    productos producto10 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 32366;
                    producto = "Baykid dolor y fiebre";                    
                    unidades = 125;
                    preciou = 12.85;
                    productos producto11 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 336545;
                    producto = "Aleve 220 MG";                    
                    unidades = 302;
                    preciou = 20.95;
                    productos producto12 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 362499;
                    producto = "Aspirina advenced 0.5G";                    
                    unidades = 200;
                    preciou = 22.35;
                    productos producto13 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 33654;
                    producto = "Sudagrip tos 1220 Ml";                    
                    unidades = 324;
                    preciou = 24.15;
                    productos producto14 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 865549;
                    producto = "Mucarbol";                    
                    unidades = 257;
                    preciou = 36.95;
                    productos producto15 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 266648;
                    producto = "Trimetroz jarabe 120 ML";                    
                    unidades = 345;
                    preciou = 33.96;
                    productos producto16 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 44456;
                    producto = "Amoxylarhr 500 MG";                    
                    unidades = 390;
                    preciou = 31.25;
                    productos producto17 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 6325166;
                    producto = "Entero Furon 100 tabletas";                    
                    unidades = 501;
                    preciou = 57.75;
                    productos producto18 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 564462;
                    producto = "Alka-Ad 2MG";                    
                    unidades = 553;
                    preciou = 36.00;
                    productos producto19 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 362654;
                    producto = "Dearexin 220 MG ";                    
                    unidades = 233;
                    preciou = 32.75;
                    productos producto20 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 366556;
                    producto = "Coderpina 1 tableta";                    
                    unidades = 503;
                    preciou = 1.75;
                    productos producto21 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 362556;
                    producto = "Tapcin Adulto";                    
                    unidades = 383;
                    preciou = 1.00;
                    productos producto22 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 435677;
                    producto = "Atenua Kit 1 ampolla";                    
                    unidades = 403;
                    preciou = 55.68;
                    productos producto23 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 463556;
                    producto = "Bienex 15 Mg";                    
                    unidades = 253;
                    preciou = 253.75;
                    productos producto24 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 436544;
                    producto = "Catasil 10 Mg";                    
                    unidades = 105;
                    preciou = 75.75;
                    productos producto25 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 4332655;
                    producto = "Coxal 200 MG";                    
                    unidades = 215;
                    preciou = 161.25;
                    productos producto26 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 465568;
                    producto = "Diclochell 75 Mg";                    
                    unidades = 500;
                    preciou = 39.25;
                    productos producto27 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 433356;
                    producto = "Montelukast 5Mg (Genfar)";                    
                    unidades = 250;
                    preciou = 92.33;
                    productos producto28 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 626231;
                    producto = "Salbutamol 4Mg (Genfar)";                    
                    unidades = 460;
                    preciou = 41.75;
                    productos producto29 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 434243;
                    producto = "Teofilina Liberacion Prolongada 125 MG";                    
                    unidades = 410;
                    preciou = 55.00;
                    productos producto30 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 466995;
                    producto = "Ambrox Baby Bon";                    
                    unidades = 385;
                    preciou = 47.75;
                    productos producto31 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 463211;
                    producto = "Ambroxel-c 120Ml";                    
                    unidades = 245;
                    preciou = 79.75;
                    productos producto32 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 48554;
                    producto = "Brofloud Compuesto";                    
                    unidades = 275;
                    preciou = 80.25;
                    productos producto33 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 487745;
                    producto = "Tetracycline Mk 500 MG";                    
                    unidades = 235;
                    preciou = 95.55;
                    productos producto34 = new productos(codproducto, unidades,producto,preciou);

                    codproducto = 44466566;
                    producto = "Sultamiclina 375 Mg";                    
                    unidades = 202;
                    preciou = 117.20;
                    productos producto35 = new productos(codproducto, unidades,producto,preciou);

//--------------------------------VENTAS                
//--------------VENTAS
                    int codventa, unidadv;
                    String fechaventa, clientev, productov,estado,direccionv; 
                    double preciov,totalv;
                    
                    codventa = 101501;
                    unidadv = 25;                    
                    fechaventa = "15 - oct - 2016";
                    clientev = cliente15.getNombre()+" "+cliente15.getApellido();
                    productov = producto11.getProducto();                    	
                    preciov = producto11.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    direccionv=cliente15.getDireccion();
                    ventas venta1 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 112213;
                    unidadv = 25;                    
                    fechaventa = "22 - nov - 2016";
                    clientev = cliente11.getNombre()+" "+cliente11.getApellido();
                    direccionv=cliente11.getDireccion();
                    productov = producto1.getProducto();                    	
                    preciov = producto1.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta2 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 030533;
                    unidadv = 25;                    
                    fechaventa = "05 - mar - 2016";
                    clientev = cliente7.getNombre()+" "+cliente7.getApellido();
                    direccionv=cliente7.getDireccion();
                    productov = producto15.getProducto();                    	
                    preciov = producto15.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta3 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 915664;
                    unidadv = 25;                    
                    fechaventa = "15 - sep - 2016";
                    clientev = cliente8.getNombre()+" "+cliente8.getApellido();
                    direccionv=cliente8.getDireccion();
                    productov = producto3.getProducto();                    	
                    preciov = producto3.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta4 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 81570;
                    unidadv = 25;                    
                    fechaventa = "15 - ago - 2016";
                    clientev = cliente4.getNombre()+" "+cliente4.getApellido();
                    direccionv=cliente4.getDireccion();
                    productov = producto12.getProducto();                    	
                    preciov = producto12.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta5 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 41599;
                    unidadv = 25;                    
                    fechaventa = "15 - abr - 2016";
                    clientev = cliente9.getNombre()+" "+cliente9.getApellido();
                    direccionv=cliente9.getDireccion();
                    productov = producto22.getProducto();                    	
                    preciov = producto22.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta6 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 111546;
                    unidadv = 25;                    
                    fechaventa = "15 - nov - 2016";
                    clientev = cliente2.getNombre()+" "+cliente2.getApellido();
                    direccionv=cliente2.getDireccion();
                    productov = producto6.getProducto();                    	
                    preciov = producto6.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta7 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 121527;
                    unidadv = 25;                    
                    fechaventa = "15 - dic - 2016";
                    clientev = cliente13.getNombre()+" "+cliente13.getApellido();
                    direccionv=cliente13.getDireccion();
                    productov = producto28.getProducto();                    	
                    preciov = producto28.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta8 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 011527;
                    unidadv = 25;                    
                    fechaventa = "15 - ene - 2016";
                    clientev = cliente12.getNombre()+" "+cliente12.getApellido();
                    direccionv=cliente12.getDireccion();
                    productov = producto14.getProducto();                    	
                    preciov = producto14.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta9 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 101827;
                    unidadv = 25;                    
                    fechaventa = "18 - oct - 2016";
                    clientev = cliente1.getNombre()+" "+cliente1.getApellido();
                    direccionv=cliente1.getDireccion();
                    productov = producto9.getProducto();                    	
                    preciov = producto9.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta10 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 365978;
                    unidadv = 10;                    
                    fechaventa = "20 - Jun - 2015";
                    clientev = cliente2.getNombre()+" "+cliente2.getApellido();
                    direccionv=cliente2.getDireccion();
                    productov = producto5.getProducto();                    	
                    preciov = producto5.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta11 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 136254;
                    unidadv = 15;                    
                    fechaventa = "15 - jul - 2015";
                    clientev = cliente12.getNombre()+" "+cliente12.getApellido();
                    direccionv=cliente12.getDireccion();
                    productov = producto20.getProducto();                    	
                    preciov = producto20.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta12 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 326589;
                    unidadv = 20;                    
                    fechaventa = "26 - Ago - 2015";
                    clientev = cliente13.getNombre()+" "+cliente13.getApellido();
                    direccionv=cliente13.getDireccion();
                    productov = producto5.getProducto();                    	
                    preciov = producto5.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta13 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 211259;
                    unidadv = 5;                    
                    fechaventa = "11 - sep - 2015";
                    clientev = cliente6.getNombre()+" "+cliente6.getApellido();
                    direccionv=cliente6.getDireccion();
                    productov = producto1.getProducto();                    	
                    preciov = producto1.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta14 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 987988;
                    unidadv = 30;                    
                    fechaventa = "16 - oct - 2015";
                    clientev = cliente8.getNombre()+" "+cliente8.getApellido();
                    direccionv=cliente8.getDireccion();
                    productov = producto12.getProducto();                    	
                    preciov = producto12.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta15 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 633621;
                    unidadv = 28;                    
                    fechaventa = "19 - Nov - 2015";
                    clientev = cliente15.getNombre()+" "+cliente15.getApellido();
                    direccionv=cliente15.getDireccion();
                    productov = producto3.getProducto();                    	
                    preciov = producto3.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta16 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 362594;
                    unidadv = 35;                    
                    fechaventa = "05 - Dic - 2015";
                    clientev = cliente14.getNombre()+" "+cliente14.getApellido();
                    direccionv=cliente14.getDireccion();
                    productov = producto16.getProducto();                    	
                    preciov = producto16.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta17 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 112365;
                    unidadv = 14;                    
                    fechaventa = "17 - Ene - 2016";
                    clientev = cliente3.getNombre()+" "+cliente3.getApellido();
                    direccionv=cliente3.getDireccion();
                    productov = producto22.getProducto();                    	
                    preciov = producto22.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta18 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 332014;
                    unidadv = 35;                    
                    fechaventa = "10 - Feb - 2016";
                    clientev = cliente11.getNombre()+" "+cliente11.getApellido();
                    direccionv=cliente11.getDireccion();
                    productov = producto5.getProducto();                    	
                    preciov = producto5.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta19 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 622136;
                    unidadv = 26;                    
                    fechaventa = "08 - Marz - 2016";
                    clientev = cliente7.getNombre()+" "+cliente7.getApellido();
                    direccionv=cliente7.getDireccion();
                    productov = producto9.getProducto();                    	
                    preciov = producto9.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta20 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 100021;
                    unidadv = 26;                    
                    fechaventa = "02 - Abr - 2016";
                    clientev = cliente13.getNombre()+" "+cliente13.getApellido();
                    direccionv=cliente13.getDireccion();
                    productov = producto6.getProducto();                    	
                    preciov = producto6.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta21 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 185586;
                    unidadv = 16;                    
                    fechaventa = "21 - May - 2016";
                    clientev = cliente4.getNombre()+" "+cliente4.getApellido();
                    direccionv=cliente4.getDireccion();
                    productov = producto23.getProducto();                    	
                    preciov = producto23.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta22 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 566984;
                    unidadv = 20;                    
                    fechaventa = "26 - Jun - 2016";
                    clientev = cliente13.getNombre()+" "+cliente13.getApellido();
                    direccionv=cliente13.getDireccion();
                    productov = producto8.getProducto();                    	
                    preciov = producto8.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta23 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 166998;
                    unidadv = 16;                    
                    fechaventa = "26 - Jul - 2016";
                    clientev = cliente6.getNombre()+" "+cliente6.getApellido();
                    direccionv=cliente6.getDireccion();
                    productov = producto2.getProducto();                    	
                    preciov = producto2.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta24 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 126446;
                    unidadv = 15;                    
                    fechaventa = "06 - Ago - 2016";
                    clientev = cliente15.getNombre()+" "+cliente15.getApellido();
                    direccionv=cliente15.getDireccion();
                    productov = producto16.getProducto();                    	
                    preciov = producto16.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta25 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 235546;
                    unidadv = 28;                    
                    fechaventa = "24 - Sep - 2016";
                    clientev = cliente3.getNombre()+" "+cliente3.getApellido();
                    direccionv=cliente13.getDireccion();
                    productov = producto22.getProducto();                    	
                    preciov = producto22.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta26 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 223654;
                    unidadv = 13;                    
                    fechaventa = "29 - oct - 2016";
                    clientev = cliente14.getNombre()+" "+cliente14.getApellido();
                    direccionv=cliente14.getDireccion();
                    productov = producto10.getProducto();                    	
                    preciov = producto10.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta27 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 111222;
                    unidadv = 14;                    
                    fechaventa = "20 - Nov - 2016";
                    clientev = cliente15.getNombre()+" "+cliente15.getApellido();
                    direccionv=cliente15.getDireccion();
                    productov = producto2.getProducto();                    	
                    preciov = producto2.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta28 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 177227;
                    unidadv = 22;                    
                    fechaventa = "08 - Dic - 2016";
                    clientev = cliente11.getNombre()+" "+cliente11.getApellido();
                    direccionv=cliente11.getDireccion();
                    productov = producto24.getProducto();                    	
                    preciov = producto24.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Completado";
                    ventas venta29 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 155654;
                    unidadv = 15;                    
                    fechaventa = "08 - Ene - 2017";
                    clientev = cliente6.getNombre()+" "+cliente6.getApellido();
                    direccionv=cliente6.getDireccion();
                    productov = producto8.getProducto();                    	
                    preciov = producto8.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Lista para enviar";
                    ventas venta30 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    
                    codventa = 100221;
                    unidadv = 10;                    
                    fechaventa = "25 - Feb - 2017";
                    clientev = cliente5.getNombre()+" "+cliente5.getApellido();
                    direccionv=cliente5.getDireccion();
                    productov = producto19.getProducto();                    	
                    preciov = producto19.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Lista para enviar";                    
                    ventas venta31 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 102335;
                    unidadv = 19;                    
                    fechaventa = "10 - Mar - 2017";
                    clientev = cliente1.getNombre()+" "+cliente1.getApellido();
                    direccionv=cliente1.getDireccion();
                    productov = producto10.getProducto();                    	
                    preciov = producto10.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Lista para enviar";                    
                    ventas venta32 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 123456;
                    unidadv = 20;                    
                    fechaventa = "12 - Abr - 2017";
                    clientev = cliente12.getNombre()+" "+cliente12.getApellido();
                    direccionv=cliente12.getDireccion();
                    productov = producto13.getProducto();                    	
                    preciov = producto13.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Lista para enviar";                    
                    ventas venta33 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 101110;
                    unidadv = 30;                    
                    fechaventa = "15 - May - 2017";
                    clientev = cliente1.getNombre()+" "+cliente1.getApellido();
                    direccionv=cliente1.getDireccion();
                    productov = producto5.getProducto();                    	
                    preciov = producto5.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Lista para enviar";                    
                    ventas venta34 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                    
                    codventa = 133256;
                    unidadv = 35;                    
                    fechaventa = "20 - Jun - 2017";
                    clientev = cliente5.getNombre()+" "+cliente5.getApellido();
                    direccionv=cliente5.getDireccion();
                    productov = producto10.getProducto();                    	
                    preciov = producto10.getPreciou();   
                    totalv = unidadv*preciov;
                    estado="Lista para enviar";                    
                    ventas venta35 = new ventas(codventa,unidadv,fechaventa,clientev,productov,preciov,totalv,estado,direccionv);
                                        
//--------------------COMPRAS
//-------COMPRAS-----------

    int codcompra, unidadcompra;
    String productoc,fechacompra,mesc;
    double preciounit, totalc;
    
    
    codcompra = 1234235;
    unidadcompra = 500;
    fechacompra="12 - oct - 2016";
    productoc=producto2.getProducto();    
    preciounit=producto2.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Octubre 2016";
    compras compra1= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc,mesc);
    
    codcompra = 100055;
    unidadcompra = 400;
    fechacompra="15 - oct - 2016";
    productoc=producto3.getProducto();    
    preciounit=producto3.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Octubre 2016";	
    compras compra2= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 10055;
    unidadcompra = 300;
    fechacompra="18 - oct - 2016";
    productoc=producto4.getProducto();    
    preciounit=producto4.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Octubre 2016";	    
    compras compra3= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 140445;
    unidadcompra = 200;
    fechacompra="02 - nov - 2016";
    productoc=producto9.getProducto();    
    preciounit=producto9.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Noviembre 2016";
    compras compra4= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 12205;
    unidadcompra = 50;
    fechacompra="14 - nov - 2016";
    productoc=producto6.getProducto();    
    preciounit=producto6.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Noviembre 2016";
    compras compra5= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 10115;
    unidadcompra = 130;
    fechacompra="22 - nov - 2016";
    productoc=producto12.getProducto();    
    preciounit=producto12.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Noviembre 2016";
    compras compra6= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 11;
    unidadcompra = 432;
    fechacompra="02 - dic - 2016";
    productoc=producto15.getProducto();    
    preciounit=producto15.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Diciembre 2016";
    compras compra7= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 86556;
    unidadcompra = 232;
    fechacompra="12 - dic - 2016";
    productoc=producto18.getProducto();    
    preciounit=producto18.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Diciembre 2016";
    compras compra8= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 9090;
    unidadcompra = 532;
    fechacompra="20 - dic - 2016";
    productoc=producto1.getProducto();    
    preciounit=producto1.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Diciembre 2016";    
    compras compra9= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 43445;
    unidadcompra = 444;
    fechacompra="11 - ene - 2017";
    productoc=producto4.getProducto();    
    preciounit=producto4.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Enero 2017";
    compras compra10= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 45443;
    unidadcompra = 123;
    fechacompra="12 - ene - 2017";
    productoc=producto10.getProducto();    
    preciounit=producto10.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Enero 2017";
    compras compra11= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 90000;
    unidadcompra = 321;
    fechacompra="22 - ene - 2017";
    productoc=producto5.getProducto();    
    preciounit=producto5.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Enero 2017";
    compras compra12= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 98978;
    unidadcompra = 242;
    fechacompra="15 - feb - 2017";
    productoc=producto7.getProducto();    
    preciounit=producto7.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Febrero 2017";
    compras compra13= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 90990;
    unidadcompra = 533;
    fechacompra="18 - feb - 2017";
    productoc=producto11.getProducto();    
    preciounit=producto11.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Febrero 2017";
    compras compra14= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 99878;
    unidadcompra = 300;
    fechacompra="22 - feb - 2017";
    productoc=producto13.getProducto();    
    preciounit=producto13.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Febrero 2017";
    compras compra15= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 97867;
    unidadcompra = 240;
    fechacompra="11 - mar - 2017";
    productoc=producto11.getProducto();    
    preciounit=producto11.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Marzo 2017";
    compras compra16= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 77777;
    unidadcompra = 150;
    fechacompra="15 - mar - 2017";
    productoc=producto18.getProducto();    
    preciounit=producto18.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Marzo 2017";
    compras compra17= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 11215;
    unidadcompra = 522;
    fechacompra="22 - mar - 2017";
    productoc=producto21.getProducto();    
    preciounit=producto21.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Marzo 2017";
    compras compra18= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 10005;
    unidadcompra = 411;
    fechacompra="13 - abr - 2017";
    productoc=producto14.getProducto();    
    preciounit=producto14.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Abril 2017";
    compras compra19= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 7651155;
    unidadcompra = 355;
    fechacompra="18 - abr - 2017";
    productoc=producto24.getProducto();    
    preciounit=producto24.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Abril 2017";
    compras compra20= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 4451155;
    unidadcompra = 500;
    fechacompra="30 - abr - 2017";
    productoc=producto26.getProducto();    
    preciounit=producto26.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Abril 2017";
    compras compra21= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 23432155;
    unidadcompra = 400;
    fechacompra="02 - may - 2017";
    productoc=producto15.getProducto();    
    preciounit=producto15.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Mayo 2017";
    compras compra22= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 13243255;
    unidadcompra = 364;
    fechacompra="12 - may - 2017";
    productoc=producto22.getProducto();    
    preciounit=producto22.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Mayo 2017";
    compras compra23= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 51155;
    unidadcompra = 360;
    fechacompra="19 - may - 2017";
    productoc=producto27.getProducto();    
    preciounit=producto27.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Mayo 2017";
    compras compra24= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 21155;
    unidadcompra = 455;
    fechacompra="03 - jun - 2017";
    productoc=producto16.getProducto();    
    preciounit=producto16.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Junio 2017";
    compras compra25= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra =22155;
    unidadcompra = 244;
    fechacompra="06 - jun - 2017";
    productoc=producto20.getProducto();    
    preciounit=producto20.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Junio 2017";
    compras compra26= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 1123213;
    unidadcompra = 233;
    fechacompra="13 - jun - 2017";
    productoc=producto28.getProducto();    
    preciounit=producto28.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Junio 2017";
    compras compra27= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 112325;
    unidadcompra = 200;
    fechacompra="11 - jul - 2017";
    productoc=producto17.getProducto();    
    preciounit=producto17.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Julio 2017";    
    compras compra28= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 11005;
    unidadcompra = 100;
    fechacompra="15 - jul - 2017";
    productoc=producto29.getProducto();    
    preciounit=producto29.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Julio 2017";
    compras compra29= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 1155;
    unidadcompra = 50;
    fechacompra="18 - jul- 2017";
    productoc=producto19.getProducto();    
    preciounit=producto19.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Julio 2017";    
    compras compra30= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 434454;
    unidadcompra = 175;
    fechacompra="08 - ago - 2017";
    productoc=producto23.getProducto();    
    preciounit=producto23.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Agosto 2017";
    compras compra31= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 23132;
    unidadcompra = 265;
    fechacompra="10 - ago - 2017";
    productoc=producto25.getProducto();    
    preciounit=producto25.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Agosto 2017";
    compras compra32= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 75754574;
    unidadcompra = 500;
    fechacompra="23 - ago - 2017";
    productoc=producto14.getProducto();    
    preciounit=producto14.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Agosto 2017";
    compras compra33= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 11155;
    unidadcompra = 200;
    fechacompra="01 - sep - 2017";
    productoc=producto9.getProducto();    
    preciounit=producto9.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Septiembre 2017";
    compras compra34= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 16556;
    unidadcompra = 100;
    fechacompra="12 - sep - 2017";
    productoc=producto17.getProducto();    
    preciounit=producto17.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Septiembre 2017";
    compras compra35= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
    
    codcompra = 11155;
    unidadcompra = 130;
    fechacompra="20 - sep - 2017";
    productoc=producto2.getProducto();    
    preciounit=producto2.getPreciou();
    totalc=unidadcompra*preciounit;
    mesc="Septiembre 2017";
    compras compra36= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc, mesc);
                    
//--------------------------------                    
		panel21=new JPanel();
		panel21.setLayout(null);
		panel21.setVisible(false);
//		panel21.setBackground(Color.RED);
		
		//boton regresar		
		b211= new JButton();		
		b211.setText("Regresar");		
		b211.setBounds(20,25,100,30);			
		b211.addActionListener((ActionListener) this);
		panel21.add(b211);
		//label
                
		l211=new JLabel();
		l211.setText("Buscar - Clientes");
		l211.setBounds(22,50,250,100);
		l211.setFont(titulo);
		panel21.add(l211);

		l212=new JLabel();
		l212.setText("NIT");
		l212.setBounds(22,102,50,100);
		l212.setFont(titulo);
		panel21.add(l212);		
		
		b212= new JButton();		
		b212.setText("Buscar");		
		b212.setBounds(300,135,100,30);			
		b212.addActionListener((ActionListener) this);
		panel21.add(b212);
		
		l214=new JLabel();
		l214.setText("NIT:");
		l214.setBounds(50,200,100,50);
		l214.setFont(subtitulo);
		panel21.add(l214);		

                l215=new JLabel();
		l215.setText("CUI:");
		l215.setBounds(50,225,100,50);
		l215.setFont(subtitulo);
		panel21.add(l215);		

                l216=new JLabel();
		l216.setText("Nombre:");
		l216.setBounds(50,250,100,50);
		l216.setFont(subtitulo);
		panel21.add(l216);		

                l217=new JLabel();
		l217.setText("Direccion:");
		l217.setBounds(50,275,100,50);
		l217.setFont(subtitulo);
		panel21.add(l217);		

                l218=new JLabel();
		l218.setText("Edad:");
		l218.setBounds(50,300,100,50);
		l218.setFont(subtitulo);
		panel21.add(l218);		

                l219=new JLabel();
		l219.setText("Fecha de Registro:");
		l219.setBounds(50,325,140,50);
		l219.setFont(subtitulo);
		panel21.add(l219);		
                		
		l213=new JLabel();
		l213.setText("Consumo:");
		l213.setBounds(50,350,200,50);
		l213.setFont(subtitulo);
		panel21.add(l213);		
		                		
		c211=new JComboBox(); //combobox de nit's
                c211.setBounds(140, 135, 150, 30);

                    c211.addItem(cliente1.getNit());
                    c211.addItem(cliente2.getNit());
                    c211.addItem(cliente3.getNit());
                    c211.addItem(cliente4.getNit());
                    c211.addItem(cliente5.getNit());
                    c211.addItem(cliente6.getNit());
                    c211.addItem(cliente7.getNit());
                    c211.addItem(cliente8.getNit());
                    c211.addItem(cliente9.getNit());
                    c211.addItem(cliente10.getNit());
                    c211.addItem(cliente11.getNit());
                    c211.addItem(cliente12.getNit());
                    c211.addItem(cliente13.getNit());
                    c211.addItem(cliente14.getNit());
                    c211.addItem(cliente15.getNit());
                    
                panel21.add(c211);
            //label que muestran el cliente buscado
		
		l214a=new JLabel();
		l214a.setBounds(200,200,200,50);
		l214a.setFont(subtitulo);
		panel21.add(l214a);		

                l215a=new JLabel();
		//l215a.setText("CUI:");
		l215a.setBounds(200,225,200,50);
		l215a.setFont(subtitulo);
		panel21.add(l215a);		

                l216a=new JLabel();
		//l216a.setText("Nombre:");
		l216a.setBounds(200,250,200,50);
		l216a.setFont(subtitulo);
		panel21.add(l216a);		

                l217a=new JLabel();
		//l217a.setText("Edad:");
		l217a.setBounds(200,275,200,50);
		l217a.setFont(subtitulo);
		panel21.add(l217a);		

                l218a=new JLabel();
		//l218a.setText("Dirección:");
		l218a.setBounds(200,300,200,50);
		l218a.setFont(subtitulo);
		panel21.add(l218a);		

                l219a=new JLabel();
		//l219a.setText("Consumo:");
		l219a.setBounds(200,325,200,50);
		l219a.setFont(subtitulo);
		panel21.add(l219a);		
                		
		l213a=new JLabel();
		//l213a.setText("Fecha de Registro");                
		l213a.setBounds(200,350,200,50);
		l213a.setFont(subtitulo);
		panel21.add(l213a);		
		            
		b213= new JButton();		
		b213.setText("Registrar nuevo cliente");		
		b213.setBounds(140,420,200,30);			
		b213.addActionListener((ActionListener) this);
		panel21.add(b213);                

                b214= new JButton();		
		b214.setText("Generar PDF de todos los clientes");		
		b214.setBounds(120,475,240,30);			
		b214.addActionListener((ActionListener) this);
		panel21.add(b214);                
                
                
		//---------------PANEL 12: INGRESAR CLIENTE
		//-------------------
		//---------------------
						
		panel22.setLayout(null);
		panel22.setVisible(false);
//		panel12.setBackground(Color.RED);
		
		//boton regresar		
		b221= new JButton();		
		b221.setText("Regresar");		
		b221.setBounds(20,25,100,30);			
		b221.addActionListener((ActionListener) this);
		panel22.add(b221);
		//label
		l221=new JLabel();
		l221.setText("Clientes");
		l221.setBounds(22,50,100,100);
		l221.setFont(titulo);
		panel22.add(l221);

		//-----label de los textos alv		
		l222=new JLabel();
		l222.setText("NIT");
		l222.setBounds(22,100,100,100);
		l222.setFont(subtitulo);
		panel22.add(l222);
		
		l223=new JLabel();
		l223.setText("CUI");
		l223.setBounds(22,125,100,100);
		l223.setFont(subtitulo);
		panel22.add(l223);
		
		l224=new JLabel();
		l224.setText("Nombre");
		l224.setBounds(22,150,100,100);
		l224.setFont(subtitulo);
		panel22.add(l224);
		
		l225=new JLabel();
		l225.setText("Apellido");
		l225.setBounds(22,175,100,100);
		l225.setFont(subtitulo);
		panel22.add(l225);
		
		l226=new JLabel();
		l226.setText("Edad");
		l226.setBounds(22,200,100,100);
		l226.setFont(subtitulo);
		panel22.add(l226);
		
		l227=new JLabel();
		l227.setText("Dirección");
		l227.setBounds(22,225,100,100);
		l227.setFont(subtitulo);
		panel22.add(l227);
		
		
		//------cajas de texto
		
		t221=new JTextField(50);
		panel22.add(t221);
		t221.setBounds(140, 140, 150, 20);
		
		t222=new JTextField(50);
		panel22.add(t222);
		t222.setBounds(140, 165, 150, 20);

		t223=new JTextField(50);
		panel22.add(t223);
		t223.setBounds(140, 190, 150, 20);
		
		t224=new JTextField(50);
		panel22.add(t224);
		t224.setBounds(140, 215, 150, 20);

		t225=new JTextField(50);
		panel22.add(t225);
		t225.setBounds(140, 240, 150, 20);
		
/*		t226=new JTextField(50);
		panel22.add(t226);
		t226.setBounds(140, 265, 150, 20);
*/	
                c221=new JComboBox();                
		c221.setBounds(140, 265, 150, 20);
                
                    c221.addItem("Alta Verapaz");
                    c221.addItem("Baja Verapaz");
                    c221.addItem("Chimaltenango");		
                    c221.addItem("Chiquimula");
                    c221.addItem("El Progreso");
                    c221.addItem("Escuintla");
                    c221.addItem("Guatemala");		
                    c221.addItem("Huehuetenango");
                    c221.addItem("Izabal");
                    c221.addItem("Jalapa");
                    c221.addItem("Jutiapa");		
                    c221.addItem("Peten");
                    c221.addItem("Quetzaltenango");
                    c221.addItem("Quiche");
                    c221.addItem("Retalhuleu");		
                    c221.addItem("Sacatepequez");
                    c221.addItem("San Marcos");
                    c221.addItem("Santa Rosa");
                    c221.addItem("Solola");		
                    c221.addItem("Suchitepequez");
                    c221.addItem("Totonicapan");
                    c221.addItem("Zacapa");

                panel22.add(c221);
		//----boton agregar
		b222= new JButton();		
		b222.setText("Agregar");		
		b222.setBounds(100,300,100,30);
		b222.addActionListener((ActionListener) this);
		panel22.add(b222);

                //label que muestran los datos
                l228=new JLabel();
		l228.setText("NIT:");
		l228.setBounds(30,350,100,100);
		l228.setFont(subtitulo);
		panel22.add(l228);
		
                l229=new JLabel();
		l229.setText("CUI:");
		l229.setBounds(30,375,100,100);
		l229.setFont(subtitulo);
		panel22.add(l229);
		
                l2210=new JLabel();
		l2210.setText("Nombre:");
		l2210.setBounds(30,400,100,100);
		l2210.setFont(subtitulo);
		panel22.add(l2210);
		
                l2211=new JLabel();
		l2211.setText("Edad:");
		l2211.setBounds(30,425,100,100);
		l2211.setFont(subtitulo);
		panel22.add(l2211);
		
                l2212=new JLabel();
		l2212.setText("Direccion:");
		l2212.setBounds(30,450,100,100);
		l2212.setFont(subtitulo);
		panel22.add(l2212);
		
                l2213=new JLabel();
		l2213.setText("Fecha de Registro:");
		l2213.setBounds(30,475,150,100);
		l2213.setFont(subtitulo);
		panel22.add(l2213);

                l2214=new JLabel();
		l2214.setText("Consumo:");
		l2214.setBounds(30,500,100,100);
		l2214.setFont(subtitulo);
		panel22.add(l2214);
                                
		
                //label que muestran los datos Este si es
                l228a=new JLabel();
                //nit
		l228a.setBounds(200,350,200,100);
		l228a.setFont(subtitulo);
		panel22.add(l228a);
		
                l229a=new JLabel();
		//cui
		l229a.setBounds(200,375,200,100);
		l229a.setFont(subtitulo);
		panel22.add(l229a);
		
                l2210a=new JLabel();
		//nombre
		l2210a.setBounds(200,400,200,100);
		l2210a.setFont(subtitulo);
		panel22.add(l2210a);
		
                l2211a=new JLabel();
		//edad
		l2211a.setBounds(200,425,200,100);
		l2211a.setFont(subtitulo);
		panel22.add(l2211a);
		
                l2212a=new JLabel();
		//direccion
		l2212a.setBounds(200,450,200,100);
		l2212a.setFont(subtitulo);
		panel22.add(l2212a);
		
                l2213a=new JLabel();
		//fecha registro
		l2213a.setBounds(200,475,200,100);
		l2213a.setFont(subtitulo);
		panel22.add(l2213a);
		
                l2214a=new JLabel();
		//fecha registro
		l2214a.setBounds(200,500,200,100);
		l2214a.setFont(subtitulo);
		panel22.add(l2214a);
		                
                //Jlist
                d221= new JList();
//                d221.setBounds(350,140,180,350);
                d221.setModel(modeloLista);		
                d221.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                
                d221.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent me)
                        {
                            if(me.getClickCount() == 2)
                            {// Cuenta la cantidad de clicks para saber si es doble                        
                                    mostrarcliente();                                                                                                    
                            }
                        }
                    }
                );
                
                panel22.add(d221);
                
                modeloLista.addElement(cliente1);
                modeloLista.addElement(cliente2);
                modeloLista.addElement(cliente3);
                modeloLista.addElement(cliente4);
                modeloLista.addElement(cliente5);
                modeloLista.addElement(cliente6);
                modeloLista.addElement(cliente7);
                modeloLista.addElement(cliente8);
                modeloLista.addElement(cliente9);
                modeloLista.addElement(cliente10);
                modeloLista.addElement(cliente11);
                modeloLista.addElement(cliente12);
                modeloLista.addElement(cliente13);
                modeloLista.addElement(cliente14);
                modeloLista.addElement(cliente15);

                JScrollPane barra22 = new JScrollPane(d221); 
                barra22.setBounds(350,140,180,150); 
                //Agrega la barra de desplazamiento al panel 
                panel22.add(barra22); 
                
		//---------------------------
		
            //--------------panel de ventas por cliente			
		panel23=new JPanel();//ventas por clientes 
		panel23.setLayout(null);
		panel23.setVisible(false);
//		panel23.setBackground(Color.RED);
		
		//boton regresar		
		b231= new JButton();		
		b231.setText("Regresar");		
		b231.setBounds(20,25,100,30);			
		b231.addActionListener((ActionListener) this);
		panel23.add(b231);
		//label
		l231=new JLabel();
		l231.setText("Reportes Clientes");
		l231.setBounds(22,50,250,100);
		l231.setFont(titulo);
		panel23.add(l231);
		
		b232= new JButton();		
		b232.setText("Compras por cliente");		
		b232.setBounds(300,135,150,30);			
//		b232.addActionListener((ActionListener) this);
		panel23.add(b232);

                //comboboxes
		c231=new JComboBox(); //combobox de nit's
                c231.setBounds(50, 135, 200, 30);

                    c231.addItem("Mostrar todas");
                    c231.addItem(cliente1);
                    c231.addItem(cliente2);
                    c231.addItem(cliente3);
                    c231.addItem(cliente4);
                    c231.addItem(cliente5);
                    c231.addItem(cliente6);
                    c231.addItem(cliente7);
                    c231.addItem(cliente8);
                    c231.addItem(cliente9);
                    c231.addItem(cliente10);
                    c231.addItem(cliente11);
                    c231.addItem(cliente12);
                    c231.addItem(cliente13);
                    c231.addItem(cliente14);
                    c231.addItem(cliente15);                    
                panel23.add(c231);                

                d231= new JList();
                d231.setModel(modeloLista23);		
                d231.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                
                d231.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent me)
                        {
                            if(me.getClickCount() == 2)
                            {// Cuenta la cantidad de clicks para saber si es doble                        
                                    mostrarcompra23();                                                                                                    
                            }
                        }
                    }
                );                
        //jspScrollLista = new JScrollPane(d32);

                modeloLista23.addElement(venta1);
                modeloLista23.addElement(venta2);
                modeloLista23.addElement(venta3);
                modeloLista23.addElement(venta4);
                modeloLista23.addElement(venta5);
                modeloLista23.addElement(venta6);
                modeloLista23.addElement(venta7);
                modeloLista23.addElement(venta8);
                modeloLista23.addElement(venta9);
                modeloLista23.addElement(venta10);
                modeloLista23.addElement(venta11);
                modeloLista23.addElement(venta12);
                modeloLista23.addElement(venta13);
                modeloLista23.addElement(venta14);
                modeloLista23.addElement(venta15);
                modeloLista23.addElement(venta16);
                modeloLista23.addElement(venta17);
                modeloLista23.addElement(venta18);
                modeloLista23.addElement(venta19);
                modeloLista23.addElement(venta20);
                modeloLista23.addElement(venta21);
                modeloLista23.addElement(venta22);
                modeloLista23.addElement(venta23);
                modeloLista23.addElement(venta24);
                modeloLista23.addElement(venta25);
                modeloLista23.addElement(venta26);
                modeloLista23.addElement(venta27);
                modeloLista23.addElement(venta28);
                modeloLista23.addElement(venta29);
                modeloLista23.addElement(venta30);
                modeloLista23.addElement(venta31);
                modeloLista23.addElement(venta32);
                modeloLista23.addElement(venta33);
                modeloLista23.addElement(venta34);
                modeloLista23.addElement(venta35);
                panel23.add(d231);                                               
                barra23 = new JScrollPane(d231); 
                barra23.setBounds(50,175,400,350); 
                //Agrega la barra de desplazamiento al panel 
                panel23.add(barra23); 
           
                        d231b= new JList();
                        d231b.setModel(modeloLista23b);		
                        d231b.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                        d231b.setBounds(50,175,450,120); 

                modeloLista23b.addElement(venta1);
                modeloLista23b.addElement(venta2);
                modeloLista23b.addElement(venta3);
                modeloLista23b.addElement(venta4);
                modeloLista23b.addElement(venta5);
                modeloLista23b.addElement(venta6);
                modeloLista23b.addElement(venta7);
                modeloLista23b.addElement(venta8);
                modeloLista23b.addElement(venta9);
                modeloLista23b.addElement(venta10);
                modeloLista23b.addElement(venta11);
                modeloLista23b.addElement(venta12);
                modeloLista23b.addElement(venta13);
                modeloLista23b.addElement(venta14);
                modeloLista23b.addElement(venta15);
                modeloLista23b.addElement(venta16);
                modeloLista23b.addElement(venta17);
                modeloLista23b.addElement(venta18);
                modeloLista23b.addElement(venta19);
                modeloLista23b.addElement(venta20);
                modeloLista23b.addElement(venta21);
                modeloLista23b.addElement(venta22);
                modeloLista23b.addElement(venta23);
                modeloLista23b.addElement(venta24);
                modeloLista23b.addElement(venta25);
                modeloLista23b.addElement(venta26);
                modeloLista23b.addElement(venta27);
                modeloLista23b.addElement(venta28);
                modeloLista23b.addElement(venta29);
                modeloLista23b.addElement(venta30);
                modeloLista23b.addElement(venta31);
                modeloLista23b.addElement(venta32);
                modeloLista23b.addElement(venta33);
                modeloLista23b.addElement(venta34);
                modeloLista23b.addElement(venta35);
                
b232.addActionListener(new ActionListener() 
{
    public void actionPerformed(ActionEvent e) 
        {            
            String abc= String.valueOf(c231.getSelectedItem());            
            modeloLista23.clear();    
            for (int i=0; i<modeloLista23b.size();i++)
            {            
                ventas vents=(ventas)modeloLista23b.getElementAt(i);            
                if (abc!="Mostrar todas")
                {    
                    if (abc.toLowerCase().contains(vents.getClientev().toLowerCase()))
                    {                                                            
                        modeloLista23.addElement(vents);      
                    }
                }
                else
                {
                        modeloLista23.addElement(vents);      
                }
            }
        }
});

                b233= new JButton();		
		b233.setText("Generar PDF");		
		b233.setBounds(230,570,120,30);			
		b233.addActionListener((ActionListener) this);
		panel23.add(b233);                
                
//-------------------------------------
//--------------panel de clientes útlimos 30 dias
		panel24=new JPanel();//clientes últimos 30 dias
		panel24.setLayout(null);
		panel24.setVisible(false);
//		panel23.setBackground(Color.RED);
		
		//boton regresar		
		b241= new JButton();		
		b241.setText("Regresar");		
		b241.setBounds(20,25,100,30);			
		b241.addActionListener((ActionListener) this);
		panel24.add(b241);
		//label
		l241=new JLabel();
		l241.setText("Clientes Registrados en los Últimos 30 Días");
		l241.setBounds(22,50,500,100);
		l241.setFont(titulo);
		panel24.add(l241);
		
                l242=new JLabel();
		l242.setText("Para obtener detalles, haga click sobre el cliente");
		l242.setBounds(22,100,500,100);
		l242.setFont(subtitulo);
		panel24.add(l242);		
                //Jlist
                d241= new JList();
                d241.setBounds(22,175,450,200);
                d241.setModel(modeloLista24);		
                d241.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                
                d241.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent me)
                        {
                            if(me.getClickCount() == 2)
                            {// Cuenta la cantidad de clicks para saber si es doble                        
                                    mostrarcliente30();                                                                                                    
                            }
                        }
                    }
                );
                
                panel24.add(d241);
                
                modeloLista24.addElement(cliente2);
                modeloLista24.addElement(cliente6);
                modeloLista24.addElement(cliente9);
                modeloLista24.addElement(cliente11);

		b243= new JButton();		
		b243.setText("Generar PDF");		
		b243.setBounds(200,385,120,30);			
		b243.addActionListener((ActionListener) this);
		panel24.add(b243);


//-----------EDITAR INFO CLIENTE

						
                panel25= new JPanel();
                panel25.setLayout(null);
		panel25.setVisible(false);
//		panel15.setBackground(Color.RED);
		
		//boton regresar		
		b251= new JButton();		
		b251.setText("Regresar");		
		b251.setBounds(20,25,100,30);			
		b251.addActionListener((ActionListener) this);
		panel25.add(b251);
		//label
		l251=new JLabel();
		l251.setText("NIT:");
		l251.setBounds(22,75,250,30);
		l251.setFont(titulo);
		panel25.add(l251);

                JTextField t251 = new JTextField();
                panel25.add(t251);
		t251.setBounds(100, 75, 150, 20);

                b252= new JButton();		
		b252.setText("Buscar");		
		b252.setBounds(275,75,100,20);			
		b252.addActionListener((ActionListener) this);
		panel25.add(b252);
		
                //-----label de los textos alv		

		JLabel lnit=new JLabel();
		lnit.setText("NIT");
		lnit.setBounds(22,125,100,30);
		lnit.setFont(subtitulo);
		panel25.add(lnit);


                l254=new JLabel();
		l254.setText("CUI");
		l254.setBounds(22,150,100,30);
		l254.setFont(subtitulo);
		panel25.add(l254);
		
		l255=new JLabel();
		l255.setText("Nombre");
		l255.setBounds(22,175,100,30);
		l255.setFont(subtitulo);
		panel25.add(l255);
		
		l256=new JLabel();
		l256.setText("Apellido");
		l256.setBounds(22,200,100,30);
		l256.setFont(subtitulo);
		panel25.add(l256);
		
		l257=new JLabel();
		l257.setText("Edad");
		l257.setBounds(22,225,100,30);
		l257.setFont(subtitulo);
		panel25.add(l257);
		
		l258=new JLabel();
		l258.setText("Dirección");
		l258.setBounds(22,250,100,30);
		l258.setFont(subtitulo);
		panel25.add(l258);
		
		//------cajas de texto
		
		t253=new JTextField(50);
		panel25.add(t253);
		t253.setBounds(140, 125, 150, 20);
		
		t254=new JTextField(50);
		panel25.add(t254);
		t254.setBounds(140, 150, 150, 20);

		t255=new JTextField(50);
		panel25.add(t255);
		t255.setBounds(140, 175, 150, 20);
		
		t256=new JTextField(50);
		panel25.add(t256);
		t256.setBounds(140, 200, 150, 20);

		t257=new JTextField(50);
		panel25.add(t257);
		t257.setBounds(140, 225, 150, 20);
	
                c251=new JComboBox();                
		c251.setBounds(140, 250, 150, 20);                
                    c251.addItem("Alta Verapaz");
                    c251.addItem("Baja Verapaz");
                    c251.addItem("Chimaltenango");		
                    c251.addItem("Chiquimula");
                    c251.addItem("El Progreso");
                    c251.addItem("Escuintla");
                    c251.addItem("Guatemala");		
                    c251.addItem("Huehuetenango");
                    c251.addItem("Izabal");
                    c251.addItem("Jalapa");
                    c251.addItem("Jutiapa");		
                    c251.addItem("Peten");
                    c251.addItem("Quetzaltenango");
                    c251.addItem("Quiche");
                    c251.addItem("Retalhuleu");		
                    c251.addItem("Sacatepequez");
                    c251.addItem("San Marcos");
                    c251.addItem("Santa Rosa");
                    c251.addItem("Solola");		
                    c251.addItem("Suchitepequez");
                    c251.addItem("Totonicapan");
                    c251.addItem("Zacapa");
                panel25.add(c251);

		//----boton Detalles
		b253= new JButton();		
		b253.setText("Guardar");		
		b253.setBounds(100,300,100,30);
		b253.addActionListener((ActionListener) this);
		panel25.add(b253);


b252.addActionListener(new ActionListener() 
{
//            @Override
    public void actionPerformed(ActionEvent e) 
        {
            String texto;
            texto=t251.getText();                    
            for (int i=0; i<modeloLista.size();i++)
            {            
                clientes prod=(clientes)modeloLista.getElementAt(i);            
                //l228a.setText(prod.getProducto());            
                if (texto.toLowerCase().contains(prod.getNit().toLowerCase()))
                {                                        
                    t253.setText(prod.getNit());
                    t254.setText(prod.getCui());
                    t255.setText(prod.getNombre());
                    t256.setText(prod.getApellido());
                    t257.setText(prod.getEdad());
                    c251.setSelectedItem(prod.getDireccion());                                
                }
            }
        }
});
                


b253.addActionListener(new ActionListener() 
{
//            @Override
    public void actionPerformed(ActionEvent e) 
        {            
            String texto;
//JOptionPane.showInternalMessageDialog(null, "Datos Actualizados");
            texto=t251.getText();                    
            for (int i=0; i<modeloLista.size();i++)
            {            
                clientes prod=(clientes)modeloLista.getElementAt(i);            
                //l228a.setText(prod.getProducto());            
                if (texto.toLowerCase().contains(prod.getNit().toLowerCase()))
                {                                        
                    prod.setNit(t253.getText());
                    prod.setCui(t254.getText());
                    prod.setNombre(t255.getText());
                    prod.setApellido(t256.getText());
                    prod.setEdad(t257.getText());
                    prod.setDireccion(String.valueOf(c251.getSelectedItem()));

                    //JOptionPane.showMessageDialog(this,"Datos actualizados");
                }
            }
        }
});





                
//-------------------------------
//PANEL 3: COMPRAS qlg :V
//-------------------------

		panel3= new JPanel();
		panel3.setLayout(null);
		panel3.setVisible(false);
//		panel3.setBackground(Color.RED);
		
		
		b301= new JButton();//regresar
		b302= new JButton();//nueva compra
		b303= new JButton();		//compra por cliente
                b304=new JButton();
                
		b301.setText("Regresar");
		b301.setBounds(20,25,100,30);			
		b301.addActionListener((ActionListener) this);
		panel3.add(b301);
		
		b302.setText("Nueva Compra");
		b302.setBounds(20,75,200,30);			
		b302.addActionListener((ActionListener) this);
		panel3.add(b302);
		
		b303.setText("Compras por Mes");
		b303.setBounds(20,125,200,30);			
		b303.addActionListener((ActionListener) this);
		panel3.add(b303);

                //---------------PANEL 31: NUEVA COMPRA
		//-------------------
		panel31=new JPanel();
		panel31.setLayout(null);
		panel31.setVisible(false);
//		panel31.setBackground(Color.RED);
		
		//boton regresar		
		
		
		b311= new JButton();		
		b312= new JButton();
		b313= new JButton();
				
		b311.setText("Regresar");		
		b311.setBounds(20,25,100,30);			
		b311.addActionListener((ActionListener) this);
		panel31.add(b311);
		
		l311=new JLabel();
		l311.setText("Nueva Compra");
		l311.setBounds(22,50,200,100);
		l311.setFont(titulo);
		panel31.add(l311);

		//-----label de los textos alv		
		l312=new JLabel();
		l312.setText("Producto");
		l312.setBounds(25,90,100,100);
		l312.setFont(subtitulo);
		panel31.add(l312);
                              
//
		c311 = new JComboBox();
		c311.setBounds(100,130,230,30);
		c311.addItem(producto1);
		c311.addItem(producto2);
		c311.addItem(producto3);
		c311.addItem(producto4);
		c311.addItem(producto5);
		c311.addItem(producto6);
		c311.addItem(producto7);
		c311.addItem(producto8);
		c311.addItem(producto9);
		c311.addItem(producto10);
		c311.addItem(producto11);
		c311.addItem(producto12);
		c311.addItem(producto13);
		c311.addItem(producto14);
		c311.addItem(producto15);
		c311.addItem(producto16);
		c311.addItem(producto17);
		c311.addItem(producto18);
		c311.addItem(producto19);
		c311.addItem(producto20);
		c311.addItem(producto25);
		c311.addItem(producto26);
		c311.addItem(producto27);
		c311.addItem(producto28);
		c311.addItem(producto29);
		c311.addItem(producto30);
		c311.addItem(producto31);
		c311.addItem(producto32);
		c311.addItem(producto33);
		c311.addItem(producto34);
		c311.addItem(producto35);

		
		panel31.add(c311);
		//
		
                c312 = new JComboBox();
		c312.setBounds(275,240,100,20);
		c312.addItem(1);
		c312.addItem(2);
		c312.addItem(3);
		c312.addItem(4);
		c312.addItem(5);
                c312.addItem(6);
                c312.addItem(7);
                c312.addItem(8);
                c312.addItem(9);
                c312.addItem(10);
                c312.addItem(10);
                c312.addItem(11);
                c312.addItem(12);
                c312.addItem(13);
                c312.addItem(14);
                c312.addItem(15);
                c312.addItem(16);
                c312.addItem(17);
                c312.addItem(18);
                c312.addItem(19);
                c312.addItem(20);
                
		panel31.add(c312);
                
		b312.setText("Ver Detalles");
		b312.setBounds(350,130,130,30);			
		b312.addActionListener((ActionListener) this);
		panel31.add(b312);
 		
		l313=new JLabel();
		l313.setText("Precio unitario: Q");
		l313.setBounds(50,150,125,100);
		l313.setFont(subtitulo);
		panel31.add(l313);
		
		l314=new JLabel();
		l314.setText("Unidades disponibles:");
		l314.setBounds(50,175,200,100);
		l314.setFont(subtitulo);
		panel31.add(l314);

                l315=new JLabel();
		l315.setText("Unidades por comprar:");
		l315.setBounds(50,200,200,100);
		l315.setFont(subtitulo);
		panel31.add(l315);
                

		l313a=new JLabel();
		//l313a.setText("Precio unitario:");
		l313a.setBounds(275,150,100,100);
		l313a.setFont(subtitulo);
		panel31.add(l313a);
		
		l314a=new JLabel();
		//l314a.setText("Unidades disponibles:");
		l314a.setBounds(275,175,200,100);
		l314a.setFont(subtitulo);
		panel31.add(l314a);
                
                
		b313.setText("Comprar :)");
		b313.setBounds(100,280,100,30);			
		b313.addActionListener((ActionListener) this);
		panel31.add(b313);
		
		
		//---------------PANEL 31: COMRPAS DEL MES
		//-------------------
		//---------------------
				
		panel32=new JPanel();
		panel32.setLayout(null);
		panel32.setVisible(false);
//		panel31.setBackground(Color.RED);
		
		//boton regresar		
		
		
		b321= new JButton();		
		b322= new JButton();
				
		b321.setText("Regresar");		
		b321.setBounds(20,25,100,30);			
		b321.addActionListener((ActionListener) this);
		panel32.add(b321);
		
		l321=new JLabel();
		l321.setText("Farmacia CuraTodo: Compras por mes");
		l321.setBounds(22,50,300,100);
		l321.setFont(titulo);
		panel32.add(l321);
                                
		l322=new JLabel();
		l322.setText("Mes");
		l322.setBounds(40,100,100,100);
		l322.setFont(titulo);
		panel32.add(l322);
                              
//
		c321 = new JComboBox();
		c321.setBounds(100,130,230,30);
		c321.addItem("Mostrar todas");		
                c321.addItem("Octubre 2016");
		c321.addItem("Noviembre 2016");
		c321.addItem("Diciembre 2016");
		c321.addItem("Enero 2017");
		c321.addItem("Febrero 2017");
		c321.addItem("Marzo 2017");
		c321.addItem("Abril 2017");
		c321.addItem("Mayo 2017");
		c321.addItem("Junio 2017");
		c321.addItem("Julio 2017");
		c321.addItem("Agosto 2017");
		c321.addItem("Septiembre 2017");		
		panel32.add(c321);
		//                                                               
                b322.setText("Ver Detalles");//boton ver detalles del mes		
		b322.setBounds(340,130,130,30);			
		b322.addActionListener((ActionListener) this);
		panel32.add(b322);

                //Jlist
                d32= new JList();
//                d32.setBounds(50,175,400,350);
                d32.setModel(modeloLista32);		
                d32.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                
                d32.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent me)
                        {
                            if(me.getClickCount() == 2)
                            {// Cuenta la cantidad de clicks para saber si es doble                        
                                    mostrarcompra32();                                                                                                    
                            }
                        }
                    }
                );                
        //jspScrollLista = new JScrollPane(d32);

                modeloLista32.addElement(compra1);
                modeloLista32.addElement(compra2);
                modeloLista32.addElement(compra3);
                modeloLista32.addElement(compra4);
                modeloLista32.addElement(compra5);
                modeloLista32.addElement(compra6);
                modeloLista32.addElement(compra7);
                modeloLista32.addElement(compra8);
                modeloLista32.addElement(compra9);
                modeloLista32.addElement(compra10);
                modeloLista32.addElement(compra11);
                modeloLista32.addElement(compra12);
                modeloLista32.addElement(compra13);
                modeloLista32.addElement(compra14);
                modeloLista32.addElement(compra15);
                modeloLista32.addElement(compra16);
                modeloLista32.addElement(compra17);
                modeloLista32.addElement(compra18);
                modeloLista32.addElement(compra19);
                modeloLista32.addElement(compra20);
                modeloLista32.addElement(compra21);
                modeloLista32.addElement(compra22);
                modeloLista32.addElement(compra23);
                modeloLista32.addElement(compra24);
                modeloLista32.addElement(compra25);
                modeloLista32.addElement(compra26);
                modeloLista32.addElement(compra27);
                modeloLista32.addElement(compra28);
                modeloLista32.addElement(compra29);
                modeloLista32.addElement(compra30);
                modeloLista32.addElement(compra31);
                modeloLista32.addElement(compra32);
                modeloLista32.addElement(compra33);
                modeloLista32.addElement(compra34);
                modeloLista32.addElement(compra35);
                modeloLista32.addElement(compra36);
                panel32.add(d32);                                               
                JScrollPane barraDesplazamiento = new JScrollPane(d32); 
                barraDesplazamiento.setBounds(50,175,400,350); 
                //Agrega la barra de desplazamiento al panel 
                panel32.add(barraDesplazamiento); 
           
  
                d32b= new JList();
                d32b.setModel(modeloLista32b);		
                d32b.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                d32b.setBounds(50,175,450,120); 
                
                modeloLista32b.addElement(compra1);
                modeloLista32b.addElement(compra2);
                modeloLista32b.addElement(compra3);
                modeloLista32b.addElement(compra4);
                modeloLista32b.addElement(compra5);
                modeloLista32b.addElement(compra6);
                modeloLista32b.addElement(compra7);
                modeloLista32b.addElement(compra8);
                modeloLista32b.addElement(compra9);
                modeloLista32b.addElement(compra10);
                modeloLista32b.addElement(compra11);
                modeloLista32b.addElement(compra12);
                modeloLista32b.addElement(compra13);
                modeloLista32b.addElement(compra14);
                modeloLista32b.addElement(compra15);
                modeloLista32b.addElement(compra16);
                modeloLista32b.addElement(compra17);
                modeloLista32b.addElement(compra18);
                modeloLista32b.addElement(compra19);
                modeloLista32b.addElement(compra20);
                modeloLista32b.addElement(compra21);
                modeloLista32b.addElement(compra22);
                modeloLista32b.addElement(compra23);
                modeloLista32b.addElement(compra24);
                modeloLista32b.addElement(compra25);
                modeloLista32b.addElement(compra26);
                modeloLista32b.addElement(compra27);
                modeloLista32b.addElement(compra28);
                modeloLista32b.addElement(compra29);
                modeloLista32b.addElement(compra30);
                modeloLista32b.addElement(compra31);
                modeloLista32b.addElement(compra32);
                modeloLista32b.addElement(compra33);
                modeloLista32b.addElement(compra34);
                modeloLista32b.addElement(compra35);
                modeloLista32b.addElement(compra36);                
                            
b322.addActionListener(new ActionListener() 
{
    public void actionPerformed(ActionEvent e) 
        {            
            String abc2= String.valueOf(c321.getSelectedItem());            
            modeloLista32.clear();    
            for (int i=0; i<modeloLista32b.size();i++)
            {            
                compras compa=(compras)modeloLista32b.getElementAt(i);            
                if (abc2!="Mostrar todas")
                {    
                    if (abc2.toLowerCase().contains(compa.getMesc().toLowerCase()))
                    {                                                            
                        modeloLista32.addElement(compa);      
                    }
                }
                else
                {
                        modeloLista32.addElement(compa);      
                }
            }
        }
});                                              
                b323= new JButton();		
		b323.setText("Generar PDF");		
		b323.setBounds(230,570,120,30);			
		b323.addActionListener((ActionListener) this);
		panel32.add(b323);
		                
//----------------
		
//PANEL 3: VENTAS qlg :V
//-------------------------
		panel4= new JPanel();
		panel4.setLayout(null);
		panel4.setVisible(false);
//		panel3.setBackground(Color.RED);
		
		
		b401= new JButton();//regresar
		b402= new JButton();//nuevo pedido
		b403= new JButton();//Orden compra [1 venta]
                b404= new JButton();//Orden lista para envío
		b405= new JButton();//Orden por dirección
                b406= new JButton();//Editar estado de venta
                
                
		b401.setText("Regresar");
		b401.setBounds(20,25,100,30);			
		b401.addActionListener((ActionListener) this);
		panel4.add(b401);
		
		b402.setText("Nuevo Pedido");
		b402.setBounds(20,75,200,30);			
		b402.addActionListener((ActionListener) this);
		panel4.add(b402);
		
		b403.setText("Listado de Ventas");
		b403.setBounds(20,125,200,30);			
		b403.addActionListener((ActionListener) this);
		panel4.add(b403);
                
		b404.setText("Orden lista para enviar");
		b404.setBounds(20,175,200,30);			
		b404.addActionListener((ActionListener) this);
		panel4.add(b404);

                b405.setText("Orden por ubicación");
		b405.setBounds(20,225,200,30);			
		b405.addActionListener((ActionListener) this);
		panel4.add(b405);

                b406.setText("Editar estado de venta");
		b406.setBounds(20,275,200,30);			
		b406.addActionListener((ActionListener) this);
		panel4.add(b406);

				
		panel41=new JPanel();
		panel41.setLayout(null);
		panel41.setVisible(false);		
		
		b411= new JButton();		
		b412= new JButton();
                b413= new JButton();		
		b414= new JButton();
                
				
		b411.setText("Regresar");		
		b411.setBounds(20,25,100,30);			
		b411.addActionListener((ActionListener) this);
		panel41.add(b411);
		
		l411=new JLabel();
		l411.setText("Cliente");
		l411.setBounds(40,95,100,30);
		l411.setFont(titulo);
		panel41.add(l411);

		c411=new JComboBox(); //combobox de clientes
                c411.setBounds(150, 100, 230, 20);

                    c411.addItem(cliente1.getNombre()+" "+cliente1.getApellido());
                    c411.addItem(cliente2.getNombre()+" "+cliente2.getApellido());
                    c411.addItem(cliente3.getNombre()+" "+cliente3.getApellido());
                    c411.addItem(cliente4.getNombre()+" "+cliente4.getApellido());
                    c411.addItem(cliente5.getNombre()+" "+cliente5.getApellido());
                    c411.addItem(cliente6.getNombre()+" "+cliente6.getApellido());
                    c411.addItem(cliente7.getNombre()+" "+cliente7.getApellido());
                    c411.addItem(cliente8.getNombre()+" "+cliente8.getApellido());
                    c411.addItem(cliente9.getNombre()+" "+cliente9.getApellido());
                    c411.addItem(cliente10.getNombre()+" "+cliente10.getApellido());
                    c411.addItem(cliente11.getNombre()+" "+cliente11.getApellido());
                    c411.addItem(cliente12.getNombre()+" "+cliente12.getApellido());
                    c411.addItem(cliente13.getNombre()+" "+cliente13.getApellido());
                    c411.addItem(cliente14.getNombre()+" "+cliente14.getApellido());
                    c411.addItem(cliente15.getNombre()+" "+cliente15.getApellido());
                    
                //c211.addActionListener((ActionListener) this);
                panel41.add(c411);                
                
                
		l412=new JLabel();
		l412.setText("Producto");
		l412.setBounds(40,135,100,30);
		l412.setFont(titulo);
		panel41.add(l412);
                              
		c412 = new JComboBox();//combo de productos
		c412.setBounds(150,140,230,20);
		c412.addItem(producto1);
		c412.addItem(producto2);
		c412.addItem(producto3);
		c412.addItem(producto4);
		c412.addItem(producto5);
		c412.addItem(producto6);
		c412.addItem(producto7);
		c412.addItem(producto8);
		c412.addItem(producto9);
		c412.addItem(producto10);
		c412.addItem(producto11);
		c412.addItem(producto12);
		c412.addItem(producto13);
		c412.addItem(producto14);
		c412.addItem(producto15);
		c412.addItem(producto16);
		c412.addItem(producto17);
		c412.addItem(producto18);
		c412.addItem(producto19);
		c412.addItem(producto20);
                c412.addItem(producto21);
		c412.addItem(producto22);
		c412.addItem(producto23);
		c412.addItem(producto24);		
		c412.addItem(producto25);
		c412.addItem(producto26);
		c412.addItem(producto27);
		c412.addItem(producto28);
		c412.addItem(producto29);
		c412.addItem(producto30);
		c412.addItem(producto31);
		c412.addItem(producto32);
		c412.addItem(producto33);
		c412.addItem(producto34);
		c412.addItem(producto35);		
		panel41.add(c412);

                l413=new JLabel();
		l413.setText("Unidades");
		l413.setBounds(40,175,100,30);
		l413.setFont(titulo);
		panel41.add(l413);

                c413 = new JComboBox();
		c413.setBounds(150,180,100,20);
		c413.addItem(1);
		c413.addItem(2);
		c413.addItem(3);
		c413.addItem(4);
		c413.addItem(5);
                c413.addItem(6);
                c413.addItem(7);
                c413.addItem(8);
                c413.addItem(9);
                c413.addItem(10);
                c413.addItem(11);
                c413.addItem(12);
                c413.addItem(13);
                c413.addItem(14);
                c413.addItem(15);
                c413.addItem(16);
                c413.addItem(17);
                c413.addItem(18);
                c413.addItem(19);
                c413.addItem(20);
		panel41.add(c413);
                
                b412.setText("Agregar");		
		b412.setBounds(280,175,100,30);			
		b412.addActionListener((ActionListener) this);
		panel41.add(b412);
		                               
                l414 = new JLabel();
		l414.setText("Detalle de Orden de Compra");
		l414.setBounds(40,225,250,30);
		l414.setFont(titulo);
		panel41.add(l414);
                                        
                d411=new JList();
                d411.setBounds(75,275,450,300);
                d411.setModel(modeloLista2);		
                d411.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                panel41.add(d411);
                
                b413.setText("Generar Orden de Compra en PDF");		
		b413.setBounds(225,600,250,30);			
		b413.addActionListener((ActionListener) this);
		panel41.add(b413);

                t411 = new JTextField();
                t411.setBounds(2,600,150,30);			
                t411.setVisible(false);
		//panel41.add(t411);

///panel orden de compra

		//---------------PANEL TODAS LAS VENTAS
				
		panel42=new JPanel();
		panel42.setLayout(null);
		panel42.setVisible(false);
//		panel31.setBackground(Color.RED);
		
		//boton regresar		
		
		
		b421= new JButton();		
		b422= new JButton();
				
		b421.setText("Regresar");		
		b421.setBounds(20,25,100,30);			
		b421.addActionListener((ActionListener) this);
		panel42.add(b421);
		
		l421=new JLabel();
		l421.setText("Farmacia CuraTodo");
		l421.setBounds(22,50,250,100);
		l421.setFont(titulo);
		panel42.add(l421);

		titu2=new JLabel();
		titu2.setText("Listado de Ventas");
		titu2.setBounds(175,100,250,100);
		titu2.setFont(titulo);
		panel42.add(titu2);

                //Jlist
                d42= new JList();
                d42.setModel(modeloLista42);		
                d42.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                
                d42.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent me)
                        {
                            if(me.getClickCount() == 2)
                            {// Cuenta la cantidad de clicks para saber si es doble                        
                                    mostrarcompra42();                                                                                                    
                            }
                        }
                    }
                );                
        
                modeloLista42.addElement(venta1);
                modeloLista42.addElement(venta2);
                modeloLista42.addElement(venta3);
                modeloLista42.addElement(venta4);
                modeloLista42.addElement(venta5);
                modeloLista42.addElement(venta6);
                modeloLista42.addElement(venta7);
                modeloLista42.addElement(venta8);
                modeloLista42.addElement(venta9);
                modeloLista42.addElement(venta10);
                modeloLista42.addElement(venta11);
                modeloLista42.addElement(venta12);
                modeloLista42.addElement(venta13);
                modeloLista42.addElement(venta14);
                modeloLista42.addElement(venta15);
                modeloLista42.addElement(venta16);
                modeloLista42.addElement(venta17);
                modeloLista42.addElement(venta18);
                modeloLista42.addElement(venta19);
                modeloLista42.addElement(venta20);
                modeloLista42.addElement(venta21);
                modeloLista42.addElement(venta22);
                modeloLista42.addElement(venta23);
                modeloLista42.addElement(venta24);
                modeloLista42.addElement(venta25);
                modeloLista42.addElement(venta26);
                modeloLista42.addElement(venta27);
                modeloLista42.addElement(venta28);
                modeloLista42.addElement(venta29);
                modeloLista42.addElement(venta30);
                modeloLista42.addElement(venta31);
                modeloLista42.addElement(venta32);
                modeloLista42.addElement(venta33);
                modeloLista42.addElement(venta34);
                modeloLista42.addElement(venta35);
                panel42.add(d42);                                               
                JScrollPane bar = new JScrollPane(d42); 
                bar.setBounds(50,175,400,350); 
                //Agrega la barra de desplazamiento al panel 
                panel42.add(bar); 
           
                b423= new JButton();		
		b423.setText("Generar PDF");		
		b423.setBounds(230,570,120,30);			
		b423.addActionListener((ActionListener) this);
		panel42.add(b423);

                //------------PANEL VENTAS LISTAS PARA ENVIAR

		panel43=new JPanel();
		panel43.setLayout(null);
		panel43.setVisible(false);
//		panel43.setBackground(Color.RED);
		
		//boton regresar		
		
		
		b431= new JButton();		
		b432= new JButton();
                b433= new JButton();
                
				
		b431.setText("Regresar");		
		b431.setBounds(20,25,100,30);			
		b431.addActionListener((ActionListener) this);
		panel43.add(b431);
		
		l431=new JLabel();
		l431.setText("Farmacia CuraTodo: Ventas");
		l431.setBounds(22,50,300,100);
		l431.setFont(titulo);
		panel43.add(l431);
                
		l432=new JLabel();
		l432.setText("Estado");
		l432.setBounds(25,100,50,100);
		l432.setFont(titulo);
		panel43.add(l432);
                              
//
		c431 = new JComboBox();
		c431.setBounds(100,130,230,30);
		c431.addItem("Mostrar todas");		
                c431.addItem("Lista para enviar");
		c431.addItem("Completado");
		panel43.add(c431);
		//                                                               
                b432.setText("Ver Ventas");//boton ver ventas listas o completas
		b432.setBounds(340,130,130,30);			
		b432.addActionListener((ActionListener) this);
		panel43.add(b432);

                //Jlist
                d43= new JList();
//                d43.setBounds(50,175,400,350);
                d43.setModel(modeloLista43);		
                d43.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                
                d43.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent me)
                        {
                            if(me.getClickCount() == 2)
                            {// Cuenta la cantidad de clicks para saber si es doble                        
                                    mostrarventa43();                                                                                                    
                            }
                        }
                    }
                );                

                modeloLista43.addElement(venta1);
                modeloLista43.addElement(venta2);
                modeloLista43.addElement(venta3);
                modeloLista43.addElement(venta4);
                modeloLista43.addElement(venta5);
                modeloLista43.addElement(venta6);
                modeloLista43.addElement(venta7);
                modeloLista43.addElement(venta8);
                modeloLista43.addElement(venta9);
                modeloLista43.addElement(venta10);
                modeloLista43.addElement(venta11);
                modeloLista43.addElement(venta12);
                modeloLista43.addElement(venta13);
                modeloLista43.addElement(venta14);
                modeloLista43.addElement(venta15);
                modeloLista43.addElement(venta16);
                modeloLista43.addElement(venta17);
                modeloLista43.addElement(venta18);
                modeloLista43.addElement(venta19);
                modeloLista43.addElement(venta20);
                modeloLista43.addElement(venta21);
                modeloLista43.addElement(venta22);
                modeloLista43.addElement(venta23);
                modeloLista43.addElement(venta24);
                modeloLista43.addElement(venta25);
                modeloLista43.addElement(venta26);
                modeloLista43.addElement(venta27);
                modeloLista43.addElement(venta28);
                modeloLista43.addElement(venta29);
                modeloLista43.addElement(venta30);
                modeloLista43.addElement(venta31);
                modeloLista43.addElement(venta32);
                modeloLista43.addElement(venta33);
                modeloLista43.addElement(venta34);
                modeloLista43.addElement(venta35);
                panel43.add(d43);                                               
                JScrollPane barra43 = new JScrollPane(d43); 
                barra43.setBounds(50,175,400,350); 
                //Agrega la barra de desplazamiento al panel 
                panel43.add(barra43);            
  
                d43b= new JList();
                d43b.setModel(modeloLista43b);		
                d43b.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                d43b.setBounds(50,175,450,120); 
                
                modeloLista43b.addElement(venta1);
                modeloLista43b.addElement(venta2);
                modeloLista43b.addElement(venta3);
                modeloLista43b.addElement(venta4);
                modeloLista43b.addElement(venta5);
                modeloLista43b.addElement(venta6);
                modeloLista43b.addElement(venta7);
                modeloLista43b.addElement(venta8);
                modeloLista43b.addElement(venta9);
                modeloLista43b.addElement(venta10);
                modeloLista43b.addElement(venta11);
                modeloLista43b.addElement(venta12);
                modeloLista43b.addElement(venta13);
                modeloLista43b.addElement(venta14);
                modeloLista43b.addElement(venta15);
                modeloLista43b.addElement(venta16);
                modeloLista43b.addElement(venta17);
                modeloLista43b.addElement(venta18);
                modeloLista43b.addElement(venta19);
                modeloLista43b.addElement(venta20);
                modeloLista43b.addElement(venta21);
                modeloLista43b.addElement(venta22);
                modeloLista43b.addElement(venta23);
                modeloLista43b.addElement(venta24);
                modeloLista43b.addElement(venta25);
                modeloLista43b.addElement(venta26);
                modeloLista43b.addElement(venta27);
                modeloLista43b.addElement(venta28);
                modeloLista43b.addElement(venta29);
                modeloLista43b.addElement(venta30);
                modeloLista43b.addElement(venta31);
                modeloLista43b.addElement(venta32);
                modeloLista43b.addElement(venta33);
                modeloLista43b.addElement(venta34);
                modeloLista43b.addElement(venta35);
                
b432.addActionListener(new ActionListener() 
{
    public void actionPerformed(ActionEvent e) 
        {            
            String abc2= String.valueOf(c431.getSelectedItem());            
            modeloLista43.clear();    
            for (int i=0; i<modeloLista43b.size();i++)
            {            
                ventas veenta=(ventas)modeloLista43b.getElementAt(i);            
                if (abc2!="Mostrar todas")
                {    
                    if (abc2.toLowerCase().contains(veenta.getEstado().toLowerCase()))
                    {                                                            
                        modeloLista43.addElement(veenta);      
                    }
                }
                else
                {
                        modeloLista43.addElement(veenta);      
                }
            }
        }
});                                              
                b433= new JButton();		
		b433.setText("Generar PDF");		
		b433.setBounds(230,570,120,30);			
		b433.addActionListener((ActionListener) this);
		panel43.add(b433);
		                
//----------------
//------------------VENTAS POR DIRECCION xd

		panel44=new JPanel();
		panel44.setLayout(null);
		panel44.setVisible(false);
//		panel44.setBackground(Color.RED);
		
		//boton regresar						
		b441= new JButton();		
		b442= new JButton();
                b443= new JButton();
                				
		b441.setText("Regresar");		
		b441.setBounds(20,25,100,30);			
		b441.addActionListener((ActionListener) this);
		panel44.add(b441);
		
		l441=new JLabel();
		l441.setText("Farmacia CuraTodo: Ventas según departamento");
		l441.setBounds(22,50,350,100);
		l441.setFont(titulo);
		panel44.add(l441);
                
		l442=new JLabel();
		l442.setText("Departamento");
		l442.setBounds(25,130,100,30);
		l442.setFont(titulo);
		panel44.add(l442);
                              
//
		c441 = new JComboBox();
		c441.setBounds(175,130,230,30);
		c441.addItem("Mostrar todas");		
                c441.addItem("Alta Verapaz");
		c441.addItem("Baja Verapaz");
                c441.addItem("Chimaltenango");		
                c441.addItem("Chiquimula");
		c441.addItem("El Progreso");
                c441.addItem("Escuintla");
                c441.addItem("Guatemala");		
                c441.addItem("Huehuetenango");
		c441.addItem("Izabal");
                c441.addItem("Jalapa");
                c441.addItem("Jutiapa");		
                c441.addItem("Peten");
		c441.addItem("Quetzaltenango");
                c441.addItem("Quiche");
                c441.addItem("Retalhuleu");		
                c441.addItem("Sacatepequez");
		c441.addItem("San Marcos");
                c441.addItem("Santa Rosa");
                c441.addItem("Solola");		
                c441.addItem("Suchitepequez");
		c441.addItem("Totonicapan");
                c441.addItem("Zacapa");
                panel44.add(c441);
		//                                                               
                b442.setText("Ver Ventas");//boton ver ventas por direccion
		b442.setBounds(440,130,130,30);			
		b442.addActionListener((ActionListener) this);
		panel44.add(b442);

                //Jlist
                d44= new JList();
//                d44.setBounds(50,175,400,350);
                d44.setModel(modeloLista44);		
                d44.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                
                d44.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent me)
                        {
                            if(me.getClickCount() == 2)
                            {// Cuenta la cantidad de clicks para saber si es doble                        
                                    mostrarventa44();                                                                                                    
                            }
                        }
                    }
                );                

                modeloLista44.addElement(venta1);
                modeloLista44.addElement(venta2);
                modeloLista44.addElement(venta3);
                modeloLista44.addElement(venta4);
                modeloLista44.addElement(venta5);
                modeloLista44.addElement(venta6);
                modeloLista44.addElement(venta7);
                modeloLista44.addElement(venta8);
                modeloLista44.addElement(venta9);
                modeloLista44.addElement(venta10);
                modeloLista44.addElement(venta11);
                modeloLista44.addElement(venta12);
                modeloLista44.addElement(venta13);
                modeloLista44.addElement(venta14);
                modeloLista44.addElement(venta15);
                modeloLista44.addElement(venta16);
                modeloLista44.addElement(venta17);
                modeloLista44.addElement(venta18);
                modeloLista44.addElement(venta19);
                modeloLista44.addElement(venta20);
                modeloLista44.addElement(venta21);
                modeloLista44.addElement(venta22);
                modeloLista44.addElement(venta23);
                modeloLista44.addElement(venta24);
                modeloLista44.addElement(venta25);
                modeloLista44.addElement(venta26);
                modeloLista44.addElement(venta27);
                modeloLista44.addElement(venta28);
                modeloLista44.addElement(venta29);
                modeloLista44.addElement(venta30);
                modeloLista44.addElement(venta31);
                modeloLista44.addElement(venta32);
                modeloLista44.addElement(venta33);
                modeloLista44.addElement(venta34);
                modeloLista44.addElement(venta35);
                panel44.add(d44);                                               
                JScrollPane barra44 = new JScrollPane(d44); 
                barra44.setBounds(50,175,400,350); 
                //Agrega la barra de desplazamiento al panel 
                panel44.add(barra44);            
  
                d44b= new JList();
                d44b.setModel(modeloLista44b);		
                d44b.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                d44b.setBounds(50,175,450,120); 
                
                modeloLista44b.addElement(venta1);
                modeloLista44b.addElement(venta2);
                modeloLista44b.addElement(venta3);
                modeloLista44b.addElement(venta4);
                modeloLista44b.addElement(venta5);
                modeloLista44b.addElement(venta6);
                modeloLista44b.addElement(venta7);
                modeloLista44b.addElement(venta8);
                modeloLista44b.addElement(venta9);
                modeloLista44b.addElement(venta10);
                modeloLista44b.addElement(venta11);
                modeloLista44b.addElement(venta12);
                modeloLista44b.addElement(venta13);
                modeloLista44b.addElement(venta14);
                modeloLista44b.addElement(venta15);
                modeloLista44b.addElement(venta16);
                modeloLista44b.addElement(venta17);
                modeloLista44b.addElement(venta18);
                modeloLista44b.addElement(venta19);
                modeloLista44b.addElement(venta20);
                modeloLista44b.addElement(venta21);
                modeloLista44b.addElement(venta22);
                modeloLista44b.addElement(venta23);
                modeloLista44b.addElement(venta24);
                modeloLista44b.addElement(venta25);
                modeloLista44b.addElement(venta26);
                modeloLista44b.addElement(venta27);
                modeloLista44b.addElement(venta28);
                modeloLista44b.addElement(venta29);
                modeloLista44b.addElement(venta30);
                modeloLista44b.addElement(venta31);
                modeloLista44b.addElement(venta32);
                modeloLista44b.addElement(venta33);
                modeloLista44b.addElement(venta34);
                modeloLista44b.addElement(venta35);
                
b442.addActionListener(new ActionListener() 
{
    public void actionPerformed(ActionEvent e) 
        {            
            String abc2= String.valueOf(c441.getSelectedItem());            
            modeloLista44.clear();                
            for (int i=0; i<modeloLista44b.size();i++)
            {            
                ventas veenta=(ventas)modeloLista44b.getElementAt(i);            
                /*String direc;
                direc=veenta.getClientev();
                String dd;*/
                
                if (abc2!="Mostrar todas")
                {    
                    if (abc2.toLowerCase().contains(veenta.getDireccionv().toLowerCase()))
                    {                                                            
                        modeloLista44.addElement(veenta);      
                    }
                }
                else
                {
                        modeloLista44.addElement(veenta);      
                }
            }
        }
});                                              
                b443= new JButton();		
		b443.setText("Generar PDF");		
		b443.setBounds(230,570,120,30);			
		b443.addActionListener((ActionListener) this);
		panel44.add(b443);

                //--------------
                //----------
		panel45=new JPanel();
		panel45.setLayout(null);
		panel45.setVisible(false);
//		panel45.setBackground(Color.RED);
		
		//boton regresar		
				
		b451= new JButton();		
		b452= new JButton();
		b453= new JButton();
				
		b451.setText("Regresar");		
		b451.setBounds(20,25,100,30);			
		b451.addActionListener((ActionListener) this);
		panel45.add(b451);
		
		l451=new JLabel();
		l451.setText("Farmacia CuraTodo: Ventas");
		l451.setBounds(22,50,200,100);
		l451.setFont(titulo);
		panel45.add(l451);

		//-----label de los textos alv		
		l452=new JLabel();
		l452.setText("Venta");
		l452.setBounds(25,90,100,100);
		l452.setFont(subtitulo);
		panel45.add(l452);
                              
//
		c451 = new JComboBox();
		c451.setBounds(100,130,300,30);
		c451.addItem(venta1);
		c451.addItem(venta2);
		c451.addItem(venta3);
		c451.addItem(venta4);
		c451.addItem(venta5);
		c451.addItem(venta6);
		c451.addItem(venta7);
		c451.addItem(venta8);
		c451.addItem(venta9);
		c451.addItem(venta10);
		c451.addItem(venta11);
		c451.addItem(venta12);
		c451.addItem(venta13);
		c451.addItem(venta14);
		c451.addItem(venta15);
		c451.addItem(venta16);
		c451.addItem(venta17);
		c451.addItem(venta18);
		c451.addItem(venta19);
		c451.addItem(venta20);
		c451.addItem(venta21);
		c451.addItem(venta22);
		c451.addItem(venta23);
		c451.addItem(venta24);
		c451.addItem(venta25);
		c451.addItem(venta26);
		c451.addItem(venta27);
		c451.addItem(venta28);
		c451.addItem(venta29);
		c451.addItem(venta30);
		c451.addItem(venta31);
		c451.addItem(venta32);
		c451.addItem(venta33);
		c451.addItem(venta34);
		c451.addItem(venta35);
                		
		panel45.add(c451);
		//

		b452.setText("Ver Detalles");
		b452.setBounds(425,130,130,30);			
		b452.addActionListener((ActionListener) this);
		panel45.add(b452);
 		
		l453=new JLabel();
		l453.setText("Cod venta:");
		l453.setBounds(75,150,125,100);
		l453.setFont(subtitulo);
		panel45.add(l453);
		
		l454=new JLabel();
		l454.setText("Cliente:");
		l454.setBounds(75,175,200,100);
		l454.setFont(subtitulo);
		panel45.add(l454);

                l455=new JLabel();
		l455.setText("Producto:");
		l455.setBounds(75,200,200,100);
		l455.setFont(subtitulo);
		panel45.add(l455);

                l456=new JLabel();
		l456.setText("Unidades:");
		l456.setBounds(75,225,200,100);
		l456.setFont(subtitulo);
		panel45.add(l456);

                l457=new JLabel();
		l457.setText("Total: Q");
		l457.setBounds(75,250,200,100);
		l457.setFont(subtitulo);
		panel45.add(l457);

                l458=new JLabel();
		l458.setText("Estado actual:");
		l458.setBounds(75,275,200,100);
		l458.setFont(subtitulo);
		panel45.add(l458);
//---
		l453a=new JLabel();
		//cod venta
		l453a.setBounds(275,150,100,100);
		l453a.setFont(subtitulo);
		panel45.add(l453a);
		
		l454a=new JLabel();
		//cliente
		l454a.setBounds(275,175,200,100);
		l454a.setFont(subtitulo);
		panel45.add(l454a);
		
		l455a=new JLabel();
		//producto
		l455a.setBounds(275,200,200,100);
		l455a.setFont(subtitulo);
		panel45.add(l455a);
		
		l456a=new JLabel();
		//unidaddes
		l456a.setBounds(275,225,200,100);
		l456a.setFont(subtitulo);
		panel45.add(l456a);
		
		l457a=new JLabel();
		//total
		l457a.setBounds(275,250,200,100);
		l457a.setFont(subtitulo);
		panel45.add(l457a);
		
		l458a=new JLabel();
		//estado actual
		l458a.setBounds(275,275,200,100);
		l458a.setFont(subtitulo);
		panel45.add(l458a);
                
                l459=new JLabel();
		l459.setText("Editar estado: ");
		l459.setBounds(30,325,100,100);
		l459.setFont(subtitulo);
		panel45.add(l459);                

                c452 = new JComboBox();
		c452.setBounds(150,370,150,20);
                    c452.addItem("Lista para enviar");
                    c452.addItem("Completado");		
		panel45.add(c452);
                                
		b453.setText("Guardar");
		b453.setBounds(100,425,100,30);			
		b453.addActionListener((ActionListener) this);
		panel45.add(b453);
		





//--------------------PANEL INVENTARIO
//-------------------------------

            panel5 = new JPanel();
            panel5.setLayout(null);
            panel5.setVisible(false);
//		panel31.setBackground(Color.RED);

            //boton regresar		
            b501 = new JButton();
            b502 = new JButton();
            b503 = new JButton();
            b504 = new JButton();
            b505 = new JButton();            

            b501.setText("Regresar");
            b501.setBounds(20, 25, 100, 30);
            b501.addActionListener((ActionListener) this);
            panel5.add(b501);

            l501 = new JLabel();
            l501.setText("INVENTARIO");
            l501.setBounds(22, 50, 200, 100);
            l501.setFont(titulo);
            panel5.add(l501);

            //-----label de los textos alv		
            l502 = new JLabel();
            l502.setText("Producto");
            l502.setBounds(25, 90, 100, 100);
            l502.setFont(subtitulo);
            panel5.add(l502);

//
                    c501 = new JComboBox();
                    c501.setBounds(100, 130, 230, 30);
                    c501.addItem(producto1);
                    c501.addItem(producto2);
                    c501.addItem(producto3);
                    c501.addItem(producto4);
                    c501.addItem(producto5);
                    c501.addItem(producto6);
                    c501.addItem(producto7);
                    c501.addItem(producto8);
                    c501.addItem(producto9);
                    c501.addItem(producto10);
                    c501.addItem(producto11);
                    c501.addItem(producto12);
                    c501.addItem(producto13);
                    c501.addItem(producto14);
                    c501.addItem(producto15);
                    c501.addItem(producto16);
                    c501.addItem(producto17);
                    c501.addItem(producto18);
                    c501.addItem(producto19);
                    c501.addItem(producto20);
                    c501.addItem(producto21);
                    c501.addItem(producto22);
                    c501.addItem(producto23);
                    c501.addItem(producto24);		                    
                    c501.addItem(producto25);
                    c501.addItem(producto26);
                    c501.addItem(producto27);
                    c501.addItem(producto28);
                    c501.addItem(producto29);
                    c501.addItem(producto30);
                    c501.addItem(producto31);
                    c501.addItem(producto32);
                    c501.addItem(producto33);
                    c501.addItem(producto34);
                    c501.addItem(producto35);
                    panel5.add(c501);
                    c501.setVisible(false);
                    //
                    b502.setText("Ver Detalles");
                    b502.setBounds(350, 130, 130, 30);
                    b502.addActionListener((ActionListener) this);
                    b502.setVisible(false);
                    panel5.add(b502);

            t5 = new JTextField();
            t5.setBounds(100, 130, 230, 30);
            panel5.add(t5);
            
            b5 = new JButton();
            b5.setText("Buscar");
            b5.setBounds(350, 130, 130, 30);
            //b5.addActionListener((ActionListener) this);
            panel5.add(b5);           
//lista :v
                //Jlist
                d5= new JList();
                d5.setModel(modeloLista5);		
                d5.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                
                d5.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent me)
                        {
                            if(me.getClickCount() == 2)
                            {// Cuenta la cantidad de clicks para saber si es doble                        
                                    mostrarproducto5();
                            }
                        }
                    }
                );                       
                modeloLista5.addElement(producto1);
                modeloLista5.addElement(producto2);
                modeloLista5.addElement(producto3);
                modeloLista5.addElement(producto4);
                modeloLista5.addElement(producto5);
                modeloLista5.addElement(producto6);
                modeloLista5.addElement(producto7);
                modeloLista5.addElement(producto8);
                modeloLista5.addElement(producto9);
                modeloLista5.addElement(producto10);
                modeloLista5.addElement(producto11);
                modeloLista5.addElement(producto12);
                modeloLista5.addElement(producto13);
                modeloLista5.addElement(producto14);
                modeloLista5.addElement(producto15);
                modeloLista5.addElement(producto16);
                modeloLista5.addElement(producto17);
                modeloLista5.addElement(producto18);
                modeloLista5.addElement(producto19);
                modeloLista5.addElement(producto20);
                modeloLista5.addElement(producto21);
                modeloLista5.addElement(producto22);
                modeloLista5.addElement(producto23);
                modeloLista5.addElement(producto24);
                modeloLista5.addElement(producto25);
                modeloLista5.addElement(producto26);
                modeloLista5.addElement(producto27);
                modeloLista5.addElement(producto28);
                modeloLista5.addElement(producto29);
                modeloLista5.addElement(producto30);
                modeloLista5.addElement(producto31);
                modeloLista5.addElement(producto32);
                modeloLista5.addElement(producto33);
                modeloLista5.addElement(producto34);
                modeloLista5.addElement(producto35);
                panel5.add(d5);                                               
            JScrollPane barra5 = new JScrollPane(d5); 
            barra5.setBounds(50,175,450,120); 
            //Agrega la barra de desplazamiento al panel 
            panel5.add(barra5); 

                invisible= new JList();
                invisible.setModel(modeloLista5b);		
                invisible.setBorder(BorderFactory.createLineBorder(Color.BLACK));// Añade borde a JList
                invisible.setBounds(50,175,450,120); 
                
                modeloLista5b.addElement(producto1);
                modeloLista5b.addElement(producto2);
                modeloLista5b.addElement(producto3);
                modeloLista5b.addElement(producto4);
                modeloLista5b.addElement(producto5);
                modeloLista5b.addElement(producto6);
                modeloLista5b.addElement(producto7);
                modeloLista5b.addElement(producto8);
                modeloLista5b.addElement(producto9);
                modeloLista5b.addElement(producto10);
                modeloLista5b.addElement(producto11);
                modeloLista5b.addElement(producto12);
                modeloLista5b.addElement(producto13);
                modeloLista5b.addElement(producto14);
                modeloLista5b.addElement(producto15);
                modeloLista5b.addElement(producto16);
                modeloLista5b.addElement(producto17);
                modeloLista5b.addElement(producto18);
                modeloLista5b.addElement(producto19);
                modeloLista5b.addElement(producto20);
                modeloLista5b.addElement(producto21);
                modeloLista5b.addElement(producto22);
                modeloLista5b.addElement(producto23);
                modeloLista5b.addElement(producto24);
                modeloLista5b.addElement(producto25);
                modeloLista5b.addElement(producto26);
                modeloLista5b.addElement(producto27);
                modeloLista5b.addElement(producto28);
                modeloLista5b.addElement(producto29);
                modeloLista5b.addElement(producto30);
                modeloLista5b.addElement(producto31);
                modeloLista5b.addElement(producto32);
                modeloLista5b.addElement(producto33);
                modeloLista5b.addElement(producto34);
                modeloLista5b.addElement(producto35);            
          
b5.addActionListener(new ActionListener() 
{
//            @Override
    public void actionPerformed(ActionEvent e) 
        {
            String texto;
            texto=t5.getText();        
            modeloLista5.clear();    
            
            l503a.setText("");
            l504a.setText("");
            l505a.setText("");
            l506a.setText("");
            
            for (int i=0; i<modeloLista5b.size();i++)
            {            
                productos prod=(productos)modeloLista5b.getElementAt(i);            
                //l228a.setText(prod.getProducto());            
                if (prod.getProducto().toLowerCase().contains(texto.toLowerCase()))
                {                                        
                    modeloLista5.addElement(prod);      
                }
            }
        }
});

            l503 = new JLabel();
            l503.setText("Producto:");
            l503.setBounds(75, 275, 125, 100);
            l503.setFont(subtitulo);
            panel5.add(l503);

            l504 = new JLabel();
            l504.setText("Unidades disponibles:");
            l504.setBounds(75, 300, 200, 100);
            l504.setFont(subtitulo);
            panel5.add(l504);

            l505 = new JLabel();
            l505.setText("Precio Unitario:  Q");
            l505.setBounds(75, 325, 200, 100);
            l505.setFont(subtitulo);
            panel5.add(l505);

            l506 = new JLabel();
            l506.setText("Capital:  Q");
            l506.setBounds(75, 350, 200, 100);
            l506.setFont(subtitulo);
            panel5.add(l506);

            l503a = new JLabel();
            //producto
            l503a.setBounds(275, 275, 250, 100);
            l503a.setFont(subtitulo);
            panel5.add(l503a);

            l504a = new JLabel();
            //existencias
            l504a.setBounds(275, 300, 200, 100);
            l504a.setFont(subtitulo);
            panel5.add(l504a);

            l505a = new JLabel();
            //Precio unitaro
            l505a.setBounds(275, 325, 200, 100);
            l505a.setFont(subtitulo);
            panel5.add(l505a);

            l506a = new JLabel();
            //Capital
            l506a.setBounds(275, 350, 200, 100);
            l506a.setFont(subtitulo);
            panel5.add(l506a);

            l507 = new JLabel();
            l507.setText("Producto con pocas unidades");
            l507.setBounds(50, 400, 400, 100);
            l507.setFont(subtitulo);
            l507.setVisible(false);
            panel5.add(l507);
            
            b503.setText("Comprar más");
            b503.setBounds(275, 430, 130, 30);
            b503.addActionListener((ActionListener) this);
            b503.setVisible(false);
            panel5.add(b503);            

            l508 = new JLabel();
            l508.setText("Reportes");
            l508.setBounds(50, 500, 100, 30);
            l508.setFont(titulo);
            panel5.add(l508);       
            
            b504.setText("Todos los productos");
            b504.setBounds(100, 550, 200, 25);
            b504.addActionListener((ActionListener) this);
            panel5.add(b504);            
            
            b505.setText("Productos escasos");
            b505.setBounds(100, 580, 200, 25);
            b505.addActionListener((ActionListener) this);
            panel5.add(b505);            
            
//----------------
//----------------------		
	}
	
	public void actionPerformed (ActionEvent evento)
	{
		if (evento.getSource()==b11)//clientes
		{			
			getContentPane().add(panel2);
			panel2.setVisible(true);
			panel11.setVisible(false);
		}	
		
		if (evento.getSource()==b12)//compras
		{
			getContentPane().add(panel3);
			panel3.setVisible(true);
			panel11.setVisible(false);
		}
		
		if (evento.getSource()==b13)//ventas
		{
			//JOptionPane.showMessageDialog(null,"boton 1");
			getContentPane().add(panel4);
			panel4.setVisible(true);
			panel11.setVisible(false);		
                }
		
		if (evento.getSource()==b14)//inventario
		{			
                        getContentPane().add(panel5);
			panel5.setVisible(true);
			panel11.setVisible(false);		
                }		
		
//-------------------------------
//--------------------------
		//Botones de Cliente		
		if (evento.getSource()==b201)
		{			
			panel11.setVisible(true);
			panel2.setVisible(false);
		}
		
		if (evento.getSource()==b202)
		{			
			getContentPane().add(panel21);
			panel21.setVisible(true);
			panel2.setVisible(false);
		}
		if (evento.getSource()==b203)
		{			
			getContentPane().add(panel22);
			panel22.setVisible(true);
			panel2.setVisible(false);
		}		
		if (evento.getSource()==b204)
		{			
			getContentPane().add(panel23);
			panel23.setVisible(true);
			panel2.setVisible(false);
		}

                if (evento.getSource()==b205)
		{			
			getContentPane().add(panel24);
			panel24.setVisible(true);
			panel2.setVisible(false);
		}
                if (evento.getSource()==b206)
		{			
			getContentPane().add(panel25);
			panel25.setVisible(true);
			panel2.setVisible(false);
		}
		
		//-------------------
		//-----------------------------
		if (evento.getSource()==b211)//regresar [panel buscar cleinte]
		{			
			panel2.setVisible(true);
			panel21.setVisible(false);
		}

                if (evento.getSource()==b212)//buscar cliente
		{			
                    mostrarcliente2();                
                }
                if (evento.getSource()==b213)//registrar cliente
		{			
                    getContentPane().add(panel22);                    
                    panel22.setVisible(true);
                    panel21.setVisible(false);
                }

                if (evento.getSource()==b214)//generar pdf
		{			
            
                    pdf1= new JFileChooser();
                    int op=pdf1.showSaveDialog(this);

                    if (op == JFileChooser.APPROVE_OPTION)
                    {            
                        File f = pdf1.getSelectedFile();
                        t411.setText(f.toString());                                                        
                        String ruta = t411.getText();
                        try {
                            FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
                            Document doc = new Document();
                            PdfWriter.getInstance(doc, archivo);
                            doc.open();

                            String conte="LISTADO DE CLIENTES\n";
                            doc.add(new Paragraph(conte));
                            int size = modeloLista.size();
                            for (int i = 0; i < size; i++) {

                                clientes ab = (clientes)modeloLista.getElementAt(i);        
                                String contenido=i+1 + "  |  "+ ab.getNombre()+" " +ab.getApellido()+"   \n"
                                        +"          NIT: "+ab.getNit()+"\n"
                                        +"          CUI: "+ab.getCui()+"\n"
                                        +"          Direccion: "+ab.getDireccion()+"\n"
                                        +"          Edad: "+ab.getEdad()+" años\n"
                                        +"          Fecha de registro: "+ab.getFecha()+"\n"
                                        +"          Consumo: Q"+ab.getConsumo()+"\n\n";
                                doc.add(new Paragraph(contenido));

                            }

                            doc.close();
                            JOptionPane.showMessageDialog(null,"PDF Creado exitosamente :D");

                        } catch (Exception e) {
                        }
                    }
                }
                                
		//--------------------------
		
		if (evento.getSource()==b221)
		{			
			panel2.setVisible(true);
			panel22.setVisible(false);
		}

                if (evento.getSource()==b251)
		{			
			panel2.setVisible(true);
			panel25.setVisible(false);
		}		
		if (evento.getSource()==b222) //    AGREGAR CLIENTE
		{		
                    String nit, cui, nombre, apellido, edad, direccion,fecha; 
                    double consumo; int numdecompra;
                    nit = t221.getText();
                    cui = t222.getText();                    
                    nombre = t223.getText();
                    apellido = t224.getText();
                    edad = t225.getText();                    	
                    direccion = String.valueOf(c221.getSelectedItem());
                    fecha = "23 - sep - 2017";
                    consumo=0;
                    numdecompra=0;
                    
                    clientes ncliente = new clientes(nit, cui, nombre, apellido, edad, direccion,fecha,consumo,numdecompra);
                    modeloLista.addElement(ncliente);
                    c211.addItem(ncliente.getNit());
                    c231.addItem(ncliente.getNombre()+" "+ncliente.getApellido());
                    c411.addItem(ncliente.getNombre()+" "+ncliente.getApellido());
                    modeloLista24.addElement(ncliente);                                        
		}
	//-------------------------
        
        if (evento.getSource()==b231)//Panel23: Regresar
		{			
			panel2.setVisible(true);
			panel23.setVisible(false);
		}


if (evento.getSource()==b233)//PDF VENTAS DE UN CLIENTE
{			
//pdf            
                    pdf1= new JFileChooser();
                    int op=pdf1.showSaveDialog(this);

                    if (op == JFileChooser.APPROVE_OPTION)
                    {            
                        File f = pdf1.getSelectedFile();
                        t411.setText(f.toString());                                                        
                        String ruta = t411.getText();
                        try {
                            FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
                            Document doc = new Document();
                            PdfWriter.getInstance(doc, archivo);
                            doc.open();

                            String z= String.valueOf(c231.getSelectedItem());            
                            String conte="LISTADO DE VENTAS REALIZADAS:  "+z+"\n";
                            doc.add(new Paragraph(conte));
                            int size = modeloLista23.size();
                            for (int i = 0; i < size; i++) {

                                ventas ab = (ventas)modeloLista23.getElementAt(i);        
                                String contenido=i+1 + "  |  "+ ab.getFechaventa()+"    Venta: " +ab.getCodventa()+"     "+ab.getEstado()+"   \n"
                                        +"          Producto: "+ab.getProductov()+"\n"
                                        +"          Precio unitario: Q"+ab.getPreciov()+"\n"
                                        +"          Unidades vendidas: "+ab.getUnidadv()+"\n"
                                        +"          IVA: "+(ab.getTotalv()/1.12)*0.12+"\n"
                                        +"          Total: Q"+ab.getTotalv()+"\n\n";
                                doc.add(new Paragraph(contenido));
                            }
                            doc.close();
                            JOptionPane.showMessageDialog(null,"PDF Creado exitosamente :D");
                        } catch (Exception e) {
                        }
                    }                                            
}        
        
		if (evento.getSource()==b241)//Panel24: Regresar
		{			
			panel2.setVisible(true);
			panel24.setVisible(false);
		}

                if (evento.getSource()==b243)//generar pdf
		{			
            
                    pdf1= new JFileChooser();
                    int op=pdf1.showSaveDialog(this);

                    if (op == JFileChooser.APPROVE_OPTION)
                    {            
                        File f = pdf1.getSelectedFile();
                        t411.setText(f.toString());                                                        
                        String ruta = t411.getText();
                        try {
                            FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
                            Document doc = new Document();
                            PdfWriter.getInstance(doc, archivo);
                            doc.open();

                            String conte="LISTADO DE CLIENTES REGISTRADOS EN LOS UTLIMOS 30 DIAS\n";
                            doc.add(new Paragraph(conte));
                            int size = modeloLista24.size();
                            for (int i = 0; i < size; i++) {

                                clientes ab = (clientes)modeloLista24.getElementAt(i);        
                                String contenido=i+1 + "  |  "+ ab.getNombre()+" " +ab.getApellido()+"   \n"
                                        +"          NIT: "+ab.getNit()+"\n"
                                        +"          CUI: "+ab.getCui()+"\n"
                                        +"          Direccion: "+ab.getDireccion()+"\n"
                                        +"          Edad: "+ab.getEdad()+" años\n"
                                        +"          Fecha de registro: "+ab.getFecha()+"\n"
                                        +"          Consumo: Q"+ab.getConsumo()+"\n\n";
                                doc.add(new Paragraph(contenido));
                            }
                            doc.close();
                            JOptionPane.showMessageDialog(null,"PDF Creado exitosamente");
                        } catch (Exception e) {
                        }
                    }
                }
				
//Botones de Comras
//-------------------------------

				if (evento.getSource()==b301)//regresar
				{			
					panel11.setVisible(true);
					panel3.setVisible(false);
				}
				
				if (evento.getSource()==b302)//nueva compra
				{			
					getContentPane().add(panel31);
					panel31.setVisible(true);
					panel3.setVisible(false);
				}
						if (evento.getSource()==b311)//regresar
						{			
							panel3.setVisible(true);
							panel31.setVisible(false);
						}
						
                                                if (evento.getSource()==b312)//mostrar detalles del producto
						{			
							mostrarproducto1();
						}
						if (evento.getSource()==b311)//regresar
						{			
							getContentPane().add(panel3);
                                                        panel3.setVisible(true);
							panel31.setVisible(false);
						}
						
                                                if (evento.getSource()==b313)//comprar
						{		
                                                    comprarproducto1();

						}
                                                                                                
				if (evento.getSource()==b303)//compras por mes
				{			
					getContentPane().add(panel32);
					panel32.setVisible(true);
					panel3.setVisible(false);
				}

                                        if (evento.getSource()==b321)//regresar
                                        {			
                                                panel3.setVisible(true);
                                                panel32.setVisible(false);
                                        }

if (evento.getSource()==b323)//PDF TODAS LAS COMPRAS
{			
//pdf            
                    pdf1= new JFileChooser();
                    int op=pdf1.showSaveDialog(this);

                    if (op == JFileChooser.APPROVE_OPTION)
                    {            
                        File f = pdf1.getSelectedFile();
                        t411.setText(f.toString());                                                        
                        String ruta = t411.getText();
                        try {
                            FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
                            Document doc = new Document();
                            PdfWriter.getInstance(doc, archivo);
                            doc.open();

                            String z= String.valueOf(c321.getSelectedItem());            
                            String conte="LISTADO DE COMPRAS REALIZADAS: "+z+"\n";
                            doc.add(new Paragraph(conte));
                            int size = modeloLista32.size();
                            for (int i = 0; i < size; i++) {

                                compras ab = (compras)modeloLista32.getElementAt(i);        
                                String contenido=i+1 + "  |  "+ ab.getFechacompra()+"    ||  Compra: " +ab.getCodcompra()+"   \n"
                                        +"          "+ab.getProductoc()+"\n"
                                        +"          Q"+ab.getPreciounit()+"\n"
                                        +"          Unidades adquiridas: "+ab.getUnidadcompra()+"\n"                                        
                                        +"          Total: Q "+ab.getTotalc()+"\n\n";
                                doc.add(new Paragraph(contenido));
                            }
                            doc.close();
                            JOptionPane.showMessageDialog(null,"PDF Creado exitosamente");
                        } catch (Exception e) {
                        }
                    }                                                                                        
}

//Botones de Ventas		
//-------------------------------

				if (evento.getSource()==b401)//regresar
				{			
					panel11.setVisible(true);
					panel4.setVisible(false);
				}
				
				if (evento.getSource()==b402)//nuevo pedido
				{			
					getContentPane().add(panel41);
					panel41.setVisible(true);
					panel4.setVisible(false);
				}
                                if (evento.getSource()==b403)//nuevo pedido
				{			
					getContentPane().add(panel42);
					panel42.setVisible(true);
					panel4.setVisible(false);
				}
                                
						if (evento.getSource()==b411)//regresar
						{			
							panel4.setVisible(true);
							panel41.setVisible(false);
						}

                                                if (evento.getSource()==b412)//mostrar detalles del producto
						{			

                    int indice=c412.getSelectedIndex();
                    productos productos1 = (productos)c412.getItemAt(indice);                                                    

                    int indice2=c411.getSelectedIndex();
                    clientes cliente2 = (clientes)modeloLista.getElementAt(indice2);            

                    int codventa, unidadv;
                    String fechaventa, clientev, productov,estado,direccionv; 
                    double preciov,totalv;

                    int indice1=c413.getSelectedIndex();
                    int compra11 = (int)c413.getItemAt(indice1);
                    
                    int indice3=d42.getSelectedIndex();
                    ventas nventa = (ventas)modeloLista42.getElementAt(indice2);            
                        
                        codventa=nventa.getCodventa()+1;
                        unidadv=compra11;
                        fechaventa="23-sep-2017";
                        clientev= cliente2.getNombre()+" "+cliente2.getApellido();
                        productov=productos1.getProducto();
                        preciov=productos1.getPreciou();
                        totalv=preciov*unidadv;                  
                        estado="Lista para enviar";
                        direccionv=cliente2.getDireccion();
                    ventas venta1= new ventas(codventa, unidadv, fechaventa,clientev,productov,preciov,totalv,estado,direccionv);                

                    modeloLista2.addElement(venta1);	
                    modeloLista42.addElement(venta1);
                    modeloLista43.addElement(venta1);
                    modeloLista43b.addElement(venta1);
                    modeloLista23.addElement(venta1);
                    modeloLista23b.addElement(venta1);
                    modeloLista44.addElement(venta1);
                    modeloLista44b.addElement(venta1);
                    c451.addItem(venta1);
                    JOptionPane.showMessageDialog(this, "Venta exitosa\nTotal: Q"+venta1.getTotalv());
                    nventa.setCodventa(codventa);
                    int nunidad = productos1.getUnidades() - compra11;
                    productos1.setUnidades(nunidad);                    
                    double nconsumo = totalv+cliente2.getConsumo();
                    cliente2.setConsumo(nconsumo);
                    int cantcompra=cliente2.getNumdecompra()+1;
                    cliente2.setNumdecompra(cantcompra);       
                    
						}
                                                                                                
    if (evento.getSource()==b413)//PDF ORDEN DE COMPRA [VARIOS CLIENTE]
    {	
//pdf            
                    pdf1= new JFileChooser();
                    int op=pdf1.showSaveDialog(this);

                    if (op == JFileChooser.APPROVE_OPTION)
                    {            
                        File f = pdf1.getSelectedFile();
                        t411.setText(f.toString());                                                        
                        String ruta = t411.getText();
                        try {
                            FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
                            Document doc = new Document();
                            PdfWriter.getInstance(doc, archivo);
                            doc.open();

                            String conte="ORDENES DE VENTA\n";
                            doc.add(new Paragraph(conte));
                            int size = modeloLista2.size();
                            for (int i = 0; i < size; i++) {

                                ventas ab = (ventas)modeloLista2.getElementAt(i);        
                                String contenido=i+1 + "  |  "+ ab.getFechaventa()+"    Venta: " +ab.getCodventa()+"     "+ab.getEstado()+"   \n"
                                        +"          Cliente: "+ab.getClientev()+"\n"
                                        +"          Producto: "+ab.getProductov()+"\n"
                                        +"          Precio unitario: Q"+ab.getPreciov()+"\n"
                                        +"          Unidades vendidas: "+ab.getUnidadv()+"\n"                                        
                                        +"          IVA: "+(ab.getTotalv()/1.12)*0.12+"\n"
                                        +"          Total: Q"+ab.getTotalv()+"\n\n";
                                doc.add(new Paragraph(contenido));
                            }
                            doc.close();
                            JOptionPane.showMessageDialog(null,"PDF Creado exitosamente");
                        } catch (Exception e) {
                        }
                    }

    }
						if (evento.getSource()==b421)//regresar
						{			
							panel4.setVisible(true);
							panel42.setVisible(false);
						}
    
if (evento.getSource()==b423)//PDF TODAS LAS VENTAS
{			
//pdf            
                    pdf1= new JFileChooser();
                    int op=pdf1.showSaveDialog(this);

                    if (op == JFileChooser.APPROVE_OPTION)
                    {            
                        File f = pdf1.getSelectedFile();
                        t411.setText(f.toString());                                                        
                        String ruta = t411.getText();
                        try {
                            FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
                            Document doc = new Document();
                            PdfWriter.getInstance(doc, archivo);
                            doc.open();

                            String conte="LISTADO DE VENTAS REALIZADAS\n";
                            doc.add(new Paragraph(conte));
                            int size = modeloLista42.size();
                            for (int i = 0; i < size; i++) {

                                ventas ab = (ventas)modeloLista42.getElementAt(i);        
                                String contenido=i+1 + "  |  "+ ab.getFechaventa()+"    Venta: " +ab.getCodventa()+"     "+ab.getEstado()+"   \n"
                                        +"          Cliente: "+ab.getClientev()+"\n"
                                        +"          Producto: "+ab.getProductov()+"\n"
                                        +"          Precio unitario: Q"+ab.getPreciov()+"\n"
                                        +"          Unidades vendidas: "+ab.getUnidadv()+"\n"                                        
                                        +"          IVA: "+(ab.getTotalv()/1.12)*0.12+"\n"
                                        +"          Total: Q"+ab.getTotalv()+"\n\n";
                                doc.add(new Paragraph(contenido));
                            }
                            doc.close();
                            JOptionPane.showMessageDialog(null,"PDF Creado exitosamente");
                        } catch (Exception e) {
                        }
                    }
                                            
                                            
}

						if (evento.getSource()==b431)//regresar
						{			
							panel4.setVisible(true);
							panel43.setVisible(false);
						}
						if (evento.getSource()==b441)//regresar
						{			
							panel4.setVisible(true);
							panel44.setVisible(false);
						}

if (evento.getSource()==b443)//PDF VENTAS DE UN DEPARTAMENTO
{			
//pdf            
                    pdf1= new JFileChooser();
                    int op=pdf1.showSaveDialog(this);

                    if (op == JFileChooser.APPROVE_OPTION)
                    {            
                        File f = pdf1.getSelectedFile();
                        t411.setText(f.toString());                                                        
                        String ruta = t411.getText();
                        try {
                            FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
                            Document doc = new Document();
                            PdfWriter.getInstance(doc, archivo);
                            doc.open();

                            String z= String.valueOf(c441.getSelectedItem());            
                            String conte="LISTADO DE VENTAS REALIZADAS:  "+z+"\n";
                            doc.add(new Paragraph(conte));
                            int size = modeloLista44.size();
                            for (int i = 0; i < size; i++) {

                                ventas ab = (ventas)modeloLista44.getElementAt(i);        
                                String contenido=i+1 + "  |  "+ ab.getFechaventa()+"    Venta: " +ab.getCodventa()+"     "+ab.getEstado()+"   \n"
                                        +"          Cliente: "+ab.getClientev()+"\n"
                                        +"          Producto: "+ab.getProductov()+"\n"
                                        +"          Precio unitario: Q"+ab.getPreciov()+"\n"
                                        +"          Unidades vendidas: "+ab.getUnidadv()+"\n"
                                        +"          IVA: "+(ab.getTotalv()/1.12)*0.12+"\n"
                                        +"          Total: Q"+ab.getTotalv()+"\n\n";
                                doc.add(new Paragraph(contenido));
                            }
                            doc.close();
                            JOptionPane.showMessageDialog(null,"PDF Creado exitosamente");
                        } catch (Exception e) {
                        }
                    }                                            
}        

				if (evento.getSource()==b404)//orden por direccion
				{			
					getContentPane().add(panel43);
					panel43.setVisible(true);
					panel4.setVisible(false);
				}
				if (evento.getSource()==b405)//orden lista
				{			
					getContentPane().add(panel44);
					panel44.setVisible(true);
					panel4.setVisible(false);
				}
				if (evento.getSource()==b406)//modificar orden lista
				{			
					getContentPane().add(panel45);
					panel45.setVisible(true);
					panel4.setVisible(false);
				}
                                if (evento.getSource()==b451)//regresar
				{								
					panel4.setVisible(true);
					panel45.setVisible(false);
				}

                                if (evento.getSource()==b452)//mostrar detalles del la venta
                                {			
                                    mostrarventa45();
                                }                                
                                if (evento.getSource()==b453)//comprar
				{		
                                    cambiarestado();
                		}
                                
                                
                                
                                
//----------inventario                                
                                if (evento.getSource()==b501)//regresar
				{								
					panel11.setVisible(true);
					panel5.setVisible(false);
				}
                                

if (evento.getSource()==b433)//PDF VENTAS LISTAS PARA ENVIAR
{			
//pdf            
                    pdf1= new JFileChooser();
                    int op=pdf1.showSaveDialog(this);

                    if (op == JFileChooser.APPROVE_OPTION)
                    {            
                        File f = pdf1.getSelectedFile();
                        t411.setText(f.toString());                                                        
                        String ruta = t411.getText();
                        try {
                            FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
                            Document doc = new Document();
                            PdfWriter.getInstance(doc, archivo);
                            doc.open();

                            String z= String.valueOf(c431.getSelectedItem());            
                            String conte="LISTADO DE COMPRAS REALIZADAS:   "+z+"\n";
                            doc.add(new Paragraph(conte));
                            int size = modeloLista43.size();
                            for (int i = 0; i < size; i++) {

                               ventas ab = (ventas)modeloLista43.getElementAt(i);        
                               String contenido=i+1 + "  |  "+ ab.getFechaventa()+"    Venta: " +ab.getCodventa()+"     "+ab.getEstado()+"   \n"
                                        +"          Cliente: "+ab.getClientev()+"\n"
                                        +"          Producto: "+ab.getProductov()+"\n"
                                        +"          Precio unitario: Q"+ab.getPreciov()+"\n"
                                        +"          Unidades vendidas: "+ab.getUnidadv()+"\n"                                        
                                        +"          IVA: "+(ab.getTotalv()/1.12)*0.12+"\n"
                                        +"          Total: Q"+ab.getTotalv()+"\n\n";
                                doc.add(new Paragraph(contenido));
                            }
                            doc.close();
                            JOptionPane.showMessageDialog(null,"PDF Creado exitosamente");
                        } catch (Exception e) {
                        }
                    }                                                                                        
}


//----------------------
//---------------INVETARIO                                
if (evento.getSource()==b502)//Detalles
{								
    mostrarproducto2();
}
                            if (evento.getSource()==b503)//comprar
				{								
					getContentPane().add(panel31);
                                        panel31.setVisible(true);
                                        panel5.setVisible(false);
				}
                                
                                
if (evento.getSource()==b504)//Reporte Todos los productos
{								
pdf1= new JFileChooser();
                    int op=pdf1.showSaveDialog(this);

                    if (op == JFileChooser.APPROVE_OPTION)
                    {            
                        File f = pdf1.getSelectedFile();
                        t411.setText(f.toString());                                                        
                        String ruta = t411.getText();
                        try {
                            FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
                            Document doc = new Document();
                            PdfWriter.getInstance(doc, archivo);
                            doc.open();

                            String conte="LISTADO DE TODOS LOS PRODUCTOS\n";
                            doc.add(new Paragraph(conte));
                            int size = c501.getItemCount();
                            for (int i = 0; i < size; i++) {

                                productos ab = (productos)c501.getItemAt(i);                                
                                String contenido=i+1 + "  |  "+ ab.getProducto()+"\n"
                                        +"          Unidades disponibles: "+ab.getUnidades()+"\n"
                                        +"          Precio unitario: Q"+ab.getPreciou()+"\n"
                                        +"          Capital: Q"+ab.getPreciou()*ab.getUnidades()+"\n\n";

                                doc.add(new Paragraph(contenido));
                            }
                            doc.close();
                            JOptionPane.showMessageDialog(null,"PDF Creado exitosamente");
                        } catch (Exception e) {
                        }
                    }
}

if (evento.getSource()==b505)//Reporte productos escasos
{								
					//pdf
pdf1= new JFileChooser();
                    int op=pdf1.showSaveDialog(this);

                    if (op == JFileChooser.APPROVE_OPTION)
                    {            
                        File f = pdf1.getSelectedFile();
                        t411.setText(f.toString());                                                        
                        String ruta = t411.getText();
                        try {
                            FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
                            Document doc = new Document();
                            PdfWriter.getInstance(doc, archivo);
                            doc.open();

                            String conte="LISTADO DE LOS PRODUCTOS ESCASOS\n";
                            doc.add(new Paragraph(conte));
                            int size = c501.getItemCount();
                            for (int i = 0; i < size; i++) {

                                productos ab = (productos)c501.getItemAt(i);
                                String contenido=i+1 + "  |  "+ ab.getProducto()+"\n"
                                        +"          Unidades disponibles: "+ab.getUnidades()+"\n"
                                        +"          Precio unitario: Q"+ab.getPreciou()+"\n"
                                        +"          Capital: Q"+ab.getPreciou()*ab.getUnidades()+"\n\n";

                                if (ab.getUnidades()<200)
                                {
                                    doc.add(new Paragraph(contenido));
                                }
                            }
                            doc.close();
                            JOptionPane.showMessageDialog(null,"PDF Creado exitosamente");
                        } catch (Exception e) {
                        }
                    }
}
        }
                
        private void mostrarcliente()
        {
            int index= d221.getSelectedIndex();
            clientes ncliente=(clientes)modeloLista.getElementAt(index);
            
            l228a.setText(ncliente.getNit());
            l229a.setText(ncliente.getCui());
            l2210a.setText(ncliente.getNombre()+" "+ncliente.getApellido());
            l2211a.setText(ncliente.getEdad()+" años");
            l2212a.setText(ncliente.getDireccion());
            l2213a.setText(ncliente.getFecha());
            l2214a.setText("Q "+String.valueOf(ncliente.getConsumo()));            
        }
            
        private void mostrarcliente30()
        {
            int index= d241.getSelectedIndex();
            clientes ncliente=(clientes)modeloLista24.getElementAt(index);
            
            JOptionPane.showMessageDialog(null, "Nombre: "+ncliente.getNombre()+" "+ncliente.getApellido()+"\n"
                    + "NIT: "+ncliente.getNit()+"\n"
                    + "CUI: "+ncliente.getCui()+"\n"
                    + "Edad: "+ncliente.getEdad()+" años"+"\n"
                    + "Direccion: "+ncliente.getDireccion()+"\n"
                    + "Fechade registro: "+ncliente.getFecha());            
        }


        private void mostrarcliente2()
        {
            //            JLabel l218a,l219a,l2110a,l2111a,l2112a,l2113a;                    
            int indice=c211.getSelectedIndex();
            clientes cliente2 = (clientes)modeloLista.getElementAt(indice);
            
            l214a.setText(cliente2.getNit());
            l215a.setText(cliente2.getCui());
            l216a.setText(cliente2.getNombre()+" "+cliente2.getApellido());
            l218a.setText(cliente2.getEdad()+" años");
            l217a.setText(cliente2.getDireccion());
            l219a.setText(cliente2.getFecha());
            l213a.setText("Q "+String.valueOf(cliente2.getConsumo()));                                              
        }
        

        private void mostrarproducto1()
        {            
            int indice=c311.getSelectedIndex();
            productos productos1 = (productos)c311.getItemAt(indice);
            
            l313a.setText(String.valueOf(productos1.getPreciou()));            
            l314a.setText(String.valueOf(productos1.getUnidades()));                                              
        }

        private void mostrarproducto2()
        {            
            int indice=c501.getSelectedIndex();
            productos productos1 = (productos)c501.getItemAt(indice);
            
            l503a.setText(String.valueOf(productos1.getProducto()));            
            l504a.setText(String.valueOf(productos1.getUnidades()));
            l505a.setText(String.valueOf(productos1.getPreciou()));            
            l506a.setText(String.valueOf(productos1.getUnidades()*productos1.getPreciou()));
            
            if (productos1.getUnidades()<200)
            {
                l507.setVisible(true);
                b503.setVisible(true);
            }
            else
            {
                l507.setVisible(false);
                b503.setVisible(false);
            }
        }

        private void mostrarproducto5()
        {            
            int indice=d5.getSelectedIndex();
            productos productos1 = (productos)modeloLista5.getElementAt(indice);
            
            l503a.setText(String.valueOf(productos1.getProducto()));            
            l504a.setText(String.valueOf(productos1.getUnidades()));
            l505a.setText(String.valueOf(productos1.getPreciou()));            
            l506a.setText(String.valueOf(productos1.getUnidades()*productos1.getPreciou()));
            
            if (productos1.getUnidades()<200)
            {
                l507.setVisible(true);
                b503.setVisible(true);
            }
            else
            {
                l507.setVisible(false);
                b503.setVisible(false);
            }
        }

        private void mostrarcompra23()
        {            
            int indo= d231.getSelectedIndex();
            ventas ga=(ventas)modeloLista23.getElementAt(indo);
            
            JOptionPane.showMessageDialog(null, "Fecha: "+ga.getFechaventa()+"\n"
                    + "Cliente: "+ga.getClientev()+"\n"
                    + "Producto: "+ga.getProductov()+"\n"
                    + "Unidades: "+ga.getUnidadv()+"\n"
                    + "Precio: Q "+ga.getPreciov()+"\n\n"
                    + "Total: Q"+ga.getTotalv(),"Venta "+ga.getCodventa()+"   "+ga.getEstado(), JOptionPane.DEFAULT_OPTION);      
//      JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Titulo", JOptionPane.DEFAULT_OPTION);                        
        }
        
        private void mostrarcompra32()
        {            
            int index= d32.getSelectedIndex();
            compras gg=(compras)modeloLista32.getElementAt(index);
            
            JOptionPane.showMessageDialog(null, "Fecha: "+gg.getFechacompra()+"\n"
                    + "Producto: "+gg.getProductoc()+"\n"
                    + "Unidades: "+gg.getUnidadcompra()+"\n"
                    + "Precio: Q "+gg.getPreciounit()+"\n\n"
                    + "Total: Q"+gg.getTotalc(),"Compra "+gg.getCodcompra(), JOptionPane.DEFAULT_OPTION);      
//      JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Titulo", JOptionPane.DEFAULT_OPTION);                        
        }

        private void mostrarcompra42()
        {            
            int index= d42.getSelectedIndex();
            ventas gg=(ventas)modeloLista42.getElementAt(index);
            
            JOptionPane.showMessageDialog(null, "Fecha: "+gg.getFechaventa()+"\n"
                    + "Cliente: "+gg.getClientev()+"\n"                    
                    + "Producto: "+gg.getProductov()+"\n"
                    + "Unidades: "+gg.getUnidadv()+"\n"
                    + "Precio: Q "+gg.getPreciov()+"\n\n"
                    + "Total: Q"+gg.getTotalv(),"Venta "+gg.getCodventa()+"   "+gg.getEstado(),JOptionPane.DEFAULT_OPTION);            
        }
        private void mostrarventa43()
        {            
            int indo= d43.getSelectedIndex();
            ventas ga=(ventas)modeloLista43.getElementAt(indo);
            
            JOptionPane.showMessageDialog(null, "Fecha: "+ga.getFechaventa()+"\n"
                    + "Cliente: "+ga.getClientev()+"\n"
                    + "Producto: "+ga.getProductov()+"\n"
                    + "Unidades: "+ga.getUnidadv()+"\n"
                    + "Precio: Q "+ga.getPreciov()+"\n\n"
                    + "Total: Q"+ga.getTotalv(),"Venta "+ga.getCodventa()+"   "+ga.getEstado(), JOptionPane.DEFAULT_OPTION);      
//      JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Titulo", JOptionPane.DEFAULT_OPTION);                        
        }        

      private void mostrarventa44()
        {            
            int indo= d44.getSelectedIndex();
            ventas ga=(ventas)modeloLista44.getElementAt(indo);
            
            JOptionPane.showMessageDialog(null, "Fecha: "+ga.getFechaventa()+"\n"
                    + "Cliente: "+ga.getClientev()+"\n"
                    + "Producto: "+ga.getProductov()+"\n"
                    + "Unidades: "+ga.getUnidadv()+"\n"
                    + "Precio: Q "+ga.getPreciov()+"\n\n"
                    + "Total: Q"+ga.getTotalv(),"Venta "+ga.getCodventa()+"   "+ga.getEstado(), JOptionPane.DEFAULT_OPTION);      
//      JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Titulo", JOptionPane.DEFAULT_OPTION);                        
        }

        private void mostrarventa45()
        {            
            int indice=c451.getSelectedIndex();
            ventas venabc = (ventas)c451.getItemAt(indice);
            
            l453a.setText(String.valueOf(venabc.getCodventa()));            
            l454a.setText(venabc.getClientev());            
            l455a.setText(venabc.getProductov());            
            l456a.setText(String.valueOf(venabc.getUnidadv()));            
            l457a.setText(String.valueOf(venabc.getTotalv()));            
            l458a.setText(venabc.getEstado());            
            
            
        }
      
        
        private void comprarproducto1()
        {            
            int indice1=c312.getSelectedIndex();
            int compra11 = (int)c312.getItemAt(indice1);
            
            int indice2=c311.getSelectedIndex();
            productos compra12 = (productos)c311.getItemAt(indice2);
            
            double precio = compra12.getPreciou();
            JOptionPane.showMessageDialog(this, "Compra exitosa\nTotal: Q"+compra11*compra12.getPreciou());
            
            int indice3=c311.getSelectedIndex();
            productos compra13 = (productos)c311.getItemAt(indice3);
            
            int nunidad = (int)c312.getItemAt(indice1)+ compra13.getUnidades();
            compra13.setUnidades(nunidad);
            
            int codcompra=(int)(Math.random()*(10000-5000))+5000;
            int unidadcompra;
            String productoc,fechacompra,mesc;
            double preciounit, totalc;
                codcompra = codcompra+1;
                unidadcompra = (int)c312.getItemAt(indice1);                    
                productoc = compra12.getProducto();
                fechacompra = "23 - sep - 2017";
                mesc = "Septiembre 2017";                    	
                preciounit = compra12.getPreciou();
                totalc = unidadcompra*preciounit;                    
            compras nvc= new compras(codcompra, unidadcompra, productoc, fechacompra, preciounit, totalc,mesc);
            modeloLista32.addElement(nvc);
            modeloLista32b.addElement(nvc);
            
        }


        private void cambiarestado()
        {            
            int indice2=c451.getSelectedIndex();
            ventas venta2 = (ventas)c451.getItemAt(indice2);
            
            venta2.setEstado(String.valueOf(c452.getSelectedItem()));
            
            JOptionPane.showMessageDialog(this, "Estado actualizado");
        }
                
        
        public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Proyecto p=new Proyecto();
			
	}

}
