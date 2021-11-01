package observer;

import java.util.regex.Pattern;

public class SymbolSubscriber extends StringSubscriber {

    public SymbolSubscriber(String fileName) {
        super.pattern = Pattern.compile("[^0-9a-zA-Z]");
        super.fileName += fileName;
    }
}
