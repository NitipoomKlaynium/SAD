package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {

    public CSVBookMetadataExporter() {
        try {
            formatter = new CSVBookMetadataFormatter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
