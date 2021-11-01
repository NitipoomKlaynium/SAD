package observer;

import java.util.regex.Pattern;

public class AlphabetSubscriber extends StringSubscriber {

    public AlphabetSubscriber(String fileName) {
        super.pattern = Pattern.compile("[a-zA-Z]");
        super.filePath += fileName;
    }
}
