package Graficas;

import ListaDoblementeEnlazadaAviones.Nodo_LDE_Aviones;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Grafica_Aviones {

    File f;
    FileWriter fw;
    BufferedWriter bw;
    PrintWriter pr;
    int indice;

    private final String DOT_PATH = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
    private final String TPARAM = "-Tjpg";
    private final String TOPARAM = "-o";

    public void graficar(Nodo_LDE_Aviones raiz, String nombre) throws IOException {
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

    public void declararNodos(Nodo_LDE_Aviones raiz) {
        if (raiz != null) {
            //pr.println("node"+indice+"[label = " +"\"{<val>Avión["+ raiz.dato+ "]|<ptr> siguiente}\""+ "];");
            //pr.println("node"+indice+"[label = " +"\"{|<ptr> <val>Avión["+ raiz.dato+ "] |<ptr> siguiente }\""+ "];");
            indice++;
            if (raiz.siguiente != null) {
                declararNodos(raiz.siguiente);
            }

        }
    }

    public void enlazarNodos(Nodo_LDE_Aviones raiz, int actual) {
        if (raiz != null) {
            if (raiz.siguiente != null) {
                indice++;
                pr.println("\"Avión " + (actual + 1) + "\" ->" + "\"Avión " + (indice + 1) + "\"");
                pr.println("\"Avión " + (indice + 1) + "\" ->" + "\"Avión " + (actual + 1) + "\"");
//                pr.println("Victor->Mona [label=”enamorado”];");
//                pr.println("Mona->Victor [label=”posible ayuda”];");

                enlazarNodos(raiz.siguiente, indice);
            }
        }
        pr.println("node" + indice + "[label = " + "\"{Llegadas de Aviones}\"" + "] [style=filled];");
    }
}
