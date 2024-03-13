package SevenSegment;

public class SevenSegmentDisplay {

    private final String[] array = new String[7];

    public int getSize() {
        return array.length;
    }


    public void displaySegment(String segment){

        for (int index = 0; index < array.length; index++){
            array[index] = String.valueOf(segment.charAt(index));
        }
        displaySegmentHorizontally(array[0]);
        displaySegmentVertically(array[5], array[1]);
        displaySegmentHorizontally(array[6]);
        displaySegmentVertically(array[4], array[2]);
        displaySegmentHorizontally(array[3]);

    }
    private  void displaySegmentHorizontally(String segment) {
       if(segment.equals("1")) System.out.println("XXXXXXXX");
    }
    private  void displaySegmentVertically(String segment1, String segment2) {

        for (int index = 0; index < 4; index++) {
            if (segment1.equals("1") && segment2.equals("1")) {
                System.out.println("XX    XX");
            } else if (segment1.equals("0") && segment2.equals("1")) {
                System.out.println("    XX");
            } else if (segment1.equals("1") && segment2.equals("0")) {
                System.out.println("XX    ");

            }
        }
    }

}