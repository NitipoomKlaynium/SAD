package creational;

public class JSONBookMetadataExporter extends BookMetadataExporter {

    public JSONBookMetadataExporter() {
        formatter = new JSONBookMetadataFormatter();
    }
}
