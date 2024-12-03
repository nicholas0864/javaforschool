public class Sign {
    private String message = null;
    private int width = 0;

    public Sign(String aMessage, int aWidth) {
        message = aMessage;
        width = aWidth;
    }

    public int numberOfLines() {
        if (message == null || message.length() == 0) {
            return 0;
        }
        double lines = (double) message.length() / width;
        return (int) Math.ceil(lines);
    }

    public String getLines() {
        if (message == null || message.length() == 0) {
            return null;
        }

        String output = "";
        int numLines = numberOfLines();
        int starter = 0;
        
        for (int i = 0; i < numLines; i++) {
            if (i == numLines - 1) {
                output += message.substring(starter);
            } else {
                output += message.substring(starter, starter + width) + ";";
            }
            starter += width;
        }
        
        return output;
    }
}
