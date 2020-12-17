package com.xmlclass;


import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;

public class Validador {

    public void valida(File xml, File xsd) throws Exception {
        Source arquivoSchema = new StreamSource(xsd);
        Source arquivoXML = new StreamSource(xml);
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(arquivoSchema);
        Validator validador = schema.newValidator();

        try {
            validador.validate(arquivoXML);
            System.out.println("Seu XML esta correto!");
        } catch (Exception ex) {
            System.out.println("O seguinte erro ocorreu: " + ex.getMessage());
        }
    }

}