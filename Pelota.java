/*************************************************
* Pelota:                                       *
* @brief  Llenar un contenedor y una caja de    *
*        pelotas y mostrsr menu de operaciones. *
*                                               *
*        Ejecutar: java Pelota                  *
*                                               *
* @author  Ricardo de la Vega Barron            *
*************************************************/

import java.lang.*;
import java.util.*;
import java.text.*;

public class Pelota {
DecimalFormat formatter = new DecimalFormat("\t\t\t####.##cm^3");
public static String dato(){
        String sdato= "";
        Scanner kb = new Scanner(System.in);
        sdato = kb.nextLine();
        return sdato;
}
public static double datoDouble(){
        String sdato = "";
        double valor = 0;
        sdato = dato();
        try{
                valor = Double.parseDouble(sdato);
        } catch(NumberFormatException e) {
                valor = 0;
        }
        return (valor);
}
public static int datoInt(){
        String sdato = "";
        int valor = 0;
        sdato = dato();
        try{
                valor = Integer.parseInt(sdato);
        } catch(NumberFormatException e) {
                valor = -1;
        }
        return (valor);
}
public static void menuCont() {
        Contenedor cont = new Contenedor ();
        DecimalFormat formatter = new DecimalFormat("\t\t\t####.##cm^3");
        int opc = 0;
        do {
                System.out.println("\n\n\n\tElige una opcion: ");
                System.out.println("\n\t\t 1) Agregar pelota");
                System.out.println("\n\t\t 2) Remover pelota");
                System.out.println("\n\t\t 3) Capacidad");
                System.out.println("\n\t\t 4) Total");
                System.out.println("\n\t\t 5) Limpiar");
                System.out.println("\n\t\t 6) Contiene??");
                System.out.println("\n\t\t 0) Regresar...");
                opc = datoInt();

                switch (opc) {
                case 1:
                        System.out.println("\n\t\tAgregar Pelota (ingresa el volumen):");
                        try {
                                cont.agregar(datoDouble());
                        } catch (ExceptionOp e) {
                                System.out.println(e.toString());
                        }
                        break;
                case 2:
                        System.out.println("\n\t\tRemover Pelota (ingresa el volumen):");
                        cont.remover(datoDouble());
                        break;
                case 3:
                        System.out.println("\n\t\tCapacidad del contenedor:");
                        System.out.println(formatter.format(cont.getCapacidad()));
                        break;
                case 4:
                        System.out.format("\n\t\tTotal de pelotas: %d!!!", cont.totalPelotas());
                        break;
                case 5:
                        System.out.println("\n\t\tContenedor vacio!!!");
                        cont.limpiar();
                        break;
                case 6:
                        System.out.println("\n\t\tBuscar Pelota (ingresa el volumen):");
                        if (cont.contiene(datoDouble())) {
                                System.out.println("\n\t\tLa pelota esta en el contenedor!!!");
                        } else {
                                System.out.println("\n\t\tLa pelota NO esta en el contenedor!!!");
                        }
                        break;
                }

        } while (opc != 0);
}
public static void menuCaja() {

        System.out.println("\n\n\t\tIngresa capacidad maxima de la caja");
        double max = datoDouble();

        Caja caja = new Caja (max);
        DecimalFormat formatter = new DecimalFormat("\t\t\t####.##cm^3");
        int opc = 0;
        do {
                System.out.println("\n\n\n\tElige una opcion: ");
                System.out.println("\n\t\t 1) Agregar pelota");
                System.out.println("\n\t\t 2) Listar Pelotas");
                System.out.println("\n\t\t 0) Regresar...");
                opc = datoInt();

                switch (opc) {
                case 1:
                        System.out.println("\n\t\tAgregar Pelota (ingresa el volumen):");
                        try {
                                caja.agregar(datoDouble());
                        } catch (ExceptionOp e) {
                                System.out.println("\n\t\t"+e.toString());
                        }
                        break;
                case 2:
                        caja.listarPelotas();
                        break;
                }

        } while (opc != 0);
}
public static void main(String[] args) {
        int opc = 0;

        do {
                System.out.println("\n\n\n\tElige una opcion: ");
                System.out.println("\n\t\t 1) Contenedor");
                System.out.println("\n\t\t 2) Caja");
                System.out.println("\n\t\t 0) Salir...");
                opc = datoInt();

                switch (opc) {
                case 1:
                        menuCont();
                        break;
                case 2:
                        menuCaja();
                        break;
                }

        } while (opc != 0);
}
}
