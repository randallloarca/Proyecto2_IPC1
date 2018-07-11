package Graficas;

import Cola_Pasajeros.Nodo_Pasajeros;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import ListaDoblementeEnlazadaEscritorios.Nodo_Escritorios;
import static Ventana_Principal.Ventana_Principal.cola_pasajeros;
import java.io.IOException;

public class Grafica_Escritorios {

    File f;
    FileWriter fw;
    BufferedWriter bw;
    PrintWriter pr;
    int indice,indice2;

    private final String DOT_PATH = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
    private final String TPARAM = "-Tjpg";
    private final String TOPARAM = "-o";
    public Nodo_Escritorios primero;

    public void graficar(Nodo_Escritorios raiz, String nombre) throws IOException {
        primero = raiz;

        String filein;
        String fileout;

        filein = nombre + ".txt";
        fileout = nombre + ".jpg";

        f = new File(filein);
        fw = new FileWriter(f);
        bw = new BufferedWriter(fw);
        pr = new PrintWriter(bw);

        pr.println("digraph G {");
        pr.println("rankdir=LR;");
        pr.println("node [shape=record];");

        //pasajeros
//        pr.println("rankdir=TB;");
//        declararNodos_pasajeros(primero.cola_pasajeros_escritorios.primero);
//        enlazarNodos_pasajeros(primero.cola_pasajeros_escritorios.primero, 0);
//        primero.cola_pasajeros_escritorios.graficarLista();
//        primero.cola_pasajeros_escritorios.abrir_grafica();
        //declararNodos_pasajeros(raiz.cola_pasajeros_escritorios.primero);
        //enlazarNodos_pasajeros(raiz.cola_pasajeros_escritorios.primero, 0);



        indice = 0;
        declararNodos(raiz);

        indice = 0;
        enlazarNodos(raiz, 0);

        pr.println("}");

        //**
        pr.close();
        bw.close();

        String[] cmd = {DOT_PATH, TPARAM, filein, TOPARAM, fileout};
        Runtime rt = Runtime.getRuntime();
        rt.exec(cmd);
    }
    
    public void declararNodos_pasajeros(Nodo_Pasajeros raiz) {
        if (raiz != null) {
            indice2++;
            if (raiz.siguiente != null) {
                declararNodos_pasajeros(raiz.siguiente);
            }
        }
    }

    public void enlazarNodos_pasajeros(Nodo_Pasajeros raiz, int actual) {
        if (raiz != null) {
            if (raiz.siguiente != null) {
                indice2++;
                pr.println("\"Pasajero " + (actual + 1) + " " + "Avion" + raiz.getId_avion() + "\" ->" + "\"Pasajero " + (indice2 + 1) + " " + "Avion" + raiz.getId_avion() + "\"");
                enlazarNodos_pasajeros(raiz.siguiente, indice2);
            }
        }
        //pr.println("node" + indice2 + "[label = " + "\"{<val>Desabordaje Pasajeros}\"" + "] [style=filled];");
    }

    
    

    public void declararNodos(Nodo_Escritorios raiz) {
        if (raiz.siguiente != null) {
            indice++;
            if (raiz.siguiente != null) {


                
                
                declararNodos(raiz.siguiente);
            }

        }
    }

    public void enlazarNodos(Nodo_Escritorios raiz, int actual) {
        if (raiz != null) {
            if (raiz.siguiente != null) {
                indice++;
                pr.println("\"Escritorio " + raiz.getId_escritorios() + "\" ->" + "\"Escritorio " + raiz.siguiente.getId_escritorios() + "\"");
                pr.println("\"Escritorio " + raiz.siguiente.getId_escritorios() + "\" ->" + "\"Escritorio " + raiz.getId_escritorios() + "\"");
//                                
//                pr.println("\"Maleta " + (actual + 1) + "\n" + "Pasajero" + " " + raiz.getId_pasajero() + "\n" + "Avion" + " " + raiz.getId_avion()
//                        + "\" ->"
//                        + "\"Maleta " + (indice + 1) + "\n" + "Pasajero" + " " + raiz.getId_pasajero() + "\n" + "Avion" + " " + raiz.getId_avion() + "\"");
////                
//                pr.println("\"Maleta " + (indice + 1) + "\n" + "Pasajero" + " " + raiz.getId_pasajero() + "\n" + "Avion" + " " + raiz.getId_avion()
//                        + "\" ->"
//                        + "\"Maleta" + (actual + 1) + "\n" + "Pasajero" + " " + raiz.getId_pasajero() + "\n" + "Avion" + " " + raiz.getId_avion() + "\"");
//                


                enlazarNodos(raiz.siguiente, indice);
            }

        }
        pr.println("node" + indice + "[label = " + "\"{Escritorios}\"" + "] [style=filled];");
    }
}
