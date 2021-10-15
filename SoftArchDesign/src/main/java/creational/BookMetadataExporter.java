package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    protected BookMetadataFormatter formatter;

    public void export(PrintStream stream) {
        formatter.reset();
        for (Book book : books) {
            formatter.append(book);
        }
        stream.println(formatter.getMetadataString());
    }
}