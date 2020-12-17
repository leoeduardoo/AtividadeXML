package com.xmlclass;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class Processador {

    public void processa(File xml, File xsl) throws TransformerException {
        Source arquivoXSL = new StreamSource(xsl);
        Source arquivoXML = new StreamSource(xml);
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformador = factory.newTransformer(arquivoXSL);

        try {
            transformador.transform(arquivoXML, new StreamResult(new File("atividade2_xslt.xml")));
            System.out.println("Seu XSLT foi processado corretamente!");
        } catch (Exception ex) {
            System.out.println("O seguinte erro ocorreu: " + ex.getMessage());
        }
    }
}
