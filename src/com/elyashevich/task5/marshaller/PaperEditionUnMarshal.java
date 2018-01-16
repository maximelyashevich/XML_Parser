package com.elyashevich.task5.marshaller;

import com.elyashevich.task5.entity.PaperEditionList;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PaperEditionUnMarshal  {

    private static final Logger LOGGER = LogManager.getLogger();
    public PaperEditionList buildPaperListEdition(String filename) {
        PaperEditionList paperEditions = null;
        try {
            LOGGER.log(Level.DEBUG, "Start unmarshalling...");
            JAXBContext jc = JAXBContext. newInstance(PaperEditionList.class);
            Unmarshaller u = jc.createUnmarshaller();
            FileReader reader = new FileReader(filename);
            paperEditions =(PaperEditionList) u.unmarshal(reader);
            LOGGER.log(Level.INFO, "Successful unmarshalling...");
        } catch (JAXBException | FileNotFoundException e) {
            LOGGER.log(Level.ERROR, e.getMessage());
        }
        return paperEditions;
    }
}
