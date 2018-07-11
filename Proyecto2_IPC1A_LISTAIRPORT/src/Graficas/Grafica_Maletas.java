package Graficas;

import ListaDoblementeEnlazdaCircular_Maletas.Nodo_LDEC_Maletas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Grafica_Maletas {

    File f;
    FileWriter fw;
    BufferedWriter bw;
    PrintWriter pr;
    int indice;

    private final String DOT_PATH = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
    private final String TPARAM = "-Tjpg";
    private final String TOPARAM = "-o";
    public Nodo_LDEC_Maletas primero;

    public void graficar(Nodo_LDEC_Maletas raiz, String nombre) throws IOException {
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

    public void declararNodos(Nodo_LDEC_Maletas raiz) {
        if (raiz.siguiente != primero) {
            indice++;
            if (raiz.siguiente != null) {
                declararNodos(raiz.siguiente);
            }

        }

//        if (raiz != null) {
//            indice++;
//            if (raiz.siguiente != null) {
//                declararNodos(raiz.siguiente);
//            }
//
//        }
    }

    public void enlazarNodos(Nodo_LDEC_Maletas raiz, int actual) {
        if (raiz != null) {
            if (raiz.siguiente != primero) {
                indice++;
                pr.println("\"Maleta " + (actual + 1) + "\" ->" + "\"Maleta " + (indice + 1) + "\"");
                pr.println("\"Maleta " + (indice + 1) + "\" ->" + "\"Maleta " + (actual + 1) + "\"");
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
            else{
                            pr.println("\"Maleta " + (primero.id_Maleta) + "\" ->" + "\"Maleta " + (indice +1) + "\"");
                            pr.println("\"Maleta " + (indice +1) + "\" ->" + "\"Maleta " + (primero.id_Maleta) + "\"");
            }
            

//            pr.println("\"Maleta " + (indice + 1) + "\" ->" + "\"Maleta " + (actual + 1) + "\"");
            
        }
        pr.println("node" + indice + "[label = " + "\"{Equipaje}\"" + "] [style=filled];");
    }
}
