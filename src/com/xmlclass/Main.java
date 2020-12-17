package com.xmlclass;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

        File atividadeXML = new File("atividade2.xml");
        File atividadeXSD = new File("atividade2.xsd");
        File atividadeXSL = new File("atividade2.xsl");

        Validador validador = new Validador();
        validador.valida(atividadeXML, atividadeXSD);

        Processador processador = new Processador();
        processador.processa(atividadeXML, atividadeXSL);
    }

}
