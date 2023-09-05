package dispositivos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class Interfaz_grafica extends JFrame {

        public void contador() throws InterruptedException{
        
        Thread.sleep(5000);
    }

    
    public Interfaz_grafica(){
        setTitle("Dispositivos");
        
        setSize(500, 300);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel etiqueta = new JLabel("Dispositivos");
        etiqueta.setFont(new Font("Arial", Font.PLAIN, 24));
        etiqueta.setForeground(Color.BLUE);
        panel.add(etiqueta);


        JTextArea cuadroTexto = new JTextArea();
        cuadroTexto.setRows(5);
        cuadroTexto.setColumns(40);
        cuadroTexto.setEnabled(false);

        panel.add(cuadroTexto);


        JButton botonAccion= new JButton("Iniciar programa");
        ActionListener oyenteDeAccion = new ActionListener() {
            
            public void actionPerformed(ActionEvent ae){
                //Aqui hay que escribir el codigo para actualizar el cuadro de texto
                int horas=0;
                while(horas<=24) {
                    try {
                    //Aqui va la parte del texto de cada funcion de los objetos
                    cuadroTexto.setText("Hola");
                    contador();
                    horas++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    }
                }
            }
        };

        botonAccion.addActionListener(oyenteDeAccion);
        
        JButton botonAccion2= new JButton("Terminar programa");
        
        ActionListener oyenteDeAccion2 = new ActionListener() {
            
            public void actionPerformed(ActionEvent ae)  {
                //Aqui hay que escribir el codigo para actualizar el cuadro de texto
               
            }
        };

        botonAccion2.addActionListener(oyenteDeAccion2);


        panel.add(botonAccion);
        panel.add(botonAccion2);

        add(panel);
    }

    public static void main(String[] args) {
        // Crea una instancia de la ventana
        Interfaz_grafica ventana = new Interfaz_grafica();
        
        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}