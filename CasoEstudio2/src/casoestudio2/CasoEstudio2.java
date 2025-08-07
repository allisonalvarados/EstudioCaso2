/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio2;

/**
 *
 * @author 50672
 */
public class CasoEstudio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      

        //declaracion de la matriz que representa el hotel con 5 pisos y 5 habitaciones por piso
        Habitaciones hotel[][] = new Habitaciones[5][5]; 
        
         //numero inicial para asignar a cada habitacion
        int numero = 101;

        //aqui se supone que se llenan las habitaciones
        for (int piso = 0; piso < 5; piso++) {
            for (int hab = 0; hab < 5; hab++) {

                //variables para tipo, precio y estado de cada habitacion
                String tipo;
                double precio;
                String estado = "Libre"; //al iniciar todas las habitaciones estan libres

                if (hab % 2 == 0); { 
                    tipo = "Simple";
                    precio = 40;
                }

                if (hab % 2 == 1); {
                    tipo = "Doble";
                    precio = 60;
                }

                //creamos la habitacion para asignarla
                hotel[piso][hab] = new Habitaciones(numero, tipo, precio, estado);
                numero++;
            }
        }

        //mostramos las habitaciones
        System.out.println("Estado inicial de las habitaciones:");

        for (int piso = 0; piso < 5; piso++) {
           
            System.out.println("PISO " + (5 - piso)); 

            for (int hab = 0; hab < 5; hab++) {
                Habitaciones h = hotel[piso][hab];

           
                System.out.println("Habitaciones " + h.getNumero()); 
                System.out.println("tipo: " + h.getTipo());       
                System.out.println("precio: $" + h.getPrecio());
                System.out.println("estado: " + h.getEstado());  
            }

            System.out.println(); //espacio entre pisos
        }

        
       
        hotel[5][5].setEstado("Ocupada"); 

     
        int libres = 0, ocupadas = 0, sucias = 0;
        double ganancia = 0;

        int total = 0;

        for (int piso = 0; piso < 5; piso++) {
            for (int hab = 0; hab < 5; hab++) {
                Habitaciones h = hotel[piso][hab];
                total++;

               
                if (h.getEstado().equalsIgnoreCase("Libre")) {
                    libres++; 
                } else if (h.getEstado().equalsIgnoreCase("Ocupada")) {
                    ocupadas++;
                    ganancia += h.getPrecio();
                } else if (h.getEstado().equalsIgnoreCase("Sucia")) {
                    sucias++;
                }
            }
        }

        //resumen
        System.out.println("Resumen del estado del hotel:");
        System.out.println("Total habitaciones: " + total);
        System.out.println("Libres: " + libres); 
        String Ocupadas = null;
        System.out.println("Ocupadas: " + Ocupadas);
        String Sucias = null;
        System.out.println("Sucias: " + Sucias);
        String Ganancia = null;
        System.out.println("Ganancia actual: $" + Ganancia);
    }
}


    