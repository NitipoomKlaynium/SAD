package creational;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter {

    public XMLBookMetadataExporter() {
        try {
            formatter = new XMLBookMetadataFormatter();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}