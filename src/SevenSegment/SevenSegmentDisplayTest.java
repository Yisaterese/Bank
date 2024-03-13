package SevenSegment;

import InvalidSegmentException.InvalidSegmentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SevenSegmentDisplayTest {
    @Test
    public  void check_sizeofArray(){
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        assertEquals(7,sevenSegmentDisplay.getSize());
    }
    @Test
    public  void check_displaySegmentWithOutBinaryNumbers_throwInvalidSegmentException(){
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        assertThrows(InvalidSegmentException.class,() -> sevenSegmentDisplay.displaySegment("1211121"));
    }

    @Test
    public  void check_displaySegmentWithOutBinaryNumbersOutOfRange_throwInvalidSegmentException(){
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        assertThrows(InvalidSegmentException.class,() -> sevenSegmentDisplay.displaySegment("1111111011"));
    }

    @Test
    public  void lastInputOnSegmentIsZero(){
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        //assertEquals(sevenSegmentDisplay.getSegmentDisplayValue(),sevenSegmentDisplay.displaySegment("1111111010"));
    }
}
