package SevenSegment;

import InvalidSegmentException.InvalidSegmentException;

public class SevenSegmentDiplayMain {
    public static void main(String[] args) {
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        try {
            sevenSegmentDisplay.displaySegment("10110111");
        } catch (InvalidSegmentException ex) {
            System.out.println("Segments should be binary");

        }
    }
}
