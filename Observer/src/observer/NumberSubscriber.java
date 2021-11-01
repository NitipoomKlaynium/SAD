package observer;

import java.util.regex.Pattern;

public class NumberSubscriber extends StringSubscriber {

    public NumberSubscriber(String fileName) {
        super.pattern = Pattern.compile("[0-9]");
        super.filePath += fileName;
    }
}
