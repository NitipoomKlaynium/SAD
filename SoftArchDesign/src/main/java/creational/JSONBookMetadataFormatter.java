package creational;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONObject jsonObject;
    private JSONArray jsonArray;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        jsonObject = new JSONObject();
        jsonArray = new JSONArray();
        jsonObject.put(Book.class.getSimpleName() + 's' , jsonArray);
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject book = new JSONObject();
        JSONArray authors = new JSONArray();

        book.put(Book.Metadata.ISBN.value, b.getISBN());
        book.put(Book.Metadata.TITLE.value, b.getTitle());
        for (String author : b.getAuthors()) {
            authors.add(author);
        }
        book.put(Book.Metadata.AUTHORS.value, authors);
        book.put(Book.Metadata.PUBLISHER.value, b.getPublisher());
        jsonArray.add(book);
        return this;
    }

    @Override
    public String getMetadataString() {
        return jsonObject.toString();
    }
}
