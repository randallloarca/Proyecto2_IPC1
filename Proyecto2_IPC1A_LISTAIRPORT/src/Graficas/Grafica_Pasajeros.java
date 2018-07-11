package Graficas;

import Cola_Pasajeros.Nodo_Pasajeros;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Grafica_Pasajeros {

    File f;
    FileWriter fw;
    BufferedWriter bw;
    PrintWriter pr;
    int indice;

    private final String DOT_PATH = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
    private final String TPARAM = "-Tjpg";
    private final String TOPARAM = "-o";

    public void graficar(Nodo_Pasajeros raiz, String nombre) throws IOException {
        String filein;
        String fileout;

        filein = nombre + ".txt";
        fileout = nombre + ".jpg";

        f = new File(filein);
        fw = new FileWriter(f);
        bw = new BufferedWriter(fw);
        pr = new PrintWriter(bw);

        pr.println("digraph G {");
        pr.println("rankdir=TB;");
        pr.println("node [shape=ellipse];");

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

    public void declararNodos(Nodo_Pasajeros raiz) {
        if (raiz != null) {
            indice++;
            if (raiz.siguiente != null) {
                declararNodos(raiz.siguiente);
            }
        }
    }

    public void enlazarNodos(Nodo_Pasajeros raiz, int actual) {
        if (raiz != null) {
            if (raiz.siguiente != null) {
                indice++;
                pr.println("\"Pasajero " + (actual + 1) + " " + "Avion" + raiz.getId_avion() + "\" ->" + "\"Pasajero " + (indice + 1) + " " + "Avion" + raiz.getId_avion() + "\"");
                enlazarNodos(raiz.siguiente, indice);
            }
        }
        pr.println("node" + indice + "[label = " + "\"{<val>Desabordaje Pasajeros}\"" + "] [style=filled];");
    }
}
