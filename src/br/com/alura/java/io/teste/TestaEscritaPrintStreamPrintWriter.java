package br.com.alura.java.io.teste;

import java.io.*;

public class TestaEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        PrintStream ps = new PrintStream(new File("lorem2.txt"));
//        PrintWriter ps = new PrintWriter("lorem2.txt");

        ps.print("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
        ps.println();
        ps.println();
        ps.println();
        ps.println();
        ps.println();
        ps.print("deise santana pereira ");


        ps.close();
    }
}

//Nessa aula, vimos:
//
//Várias alternativas para estabelecer uma saída para um arquivo de texto, como:
//
//A classe FileWriter
//A classe PrintStream
//A classe PrintWriter
