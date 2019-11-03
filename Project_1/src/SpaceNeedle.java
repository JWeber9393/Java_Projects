/**
 * This class illustrates the Seattle Space Needle using ASCII code.
 * This program contains methods that use For Loops and Nested For Loops.
 * I used constant variables that stored integers, they are used to construct 
 * the space needle in varying sizes.  
 * 
 * @author Joseph Weber
 */

public class SpaceNeedle {

    public static final int small = 2;
    public static final int medium = 4;
    public static final int large = 6;

    public static void main(String[] args) {
        drawSpaceNeedle(small);
        drawSpaceNeedle(medium);
        drawSpaceNeedle(large);
    }

    /**
     * This method draws the Space Needle by calling other methods.
     * 
     * @param size is an integer that is passed to each other method that it calls.
     */
    public static void drawSpaceNeedle(int size) {
        spike(size);
        dome(size);
        base(size);
        spike(size);
        fullColumn(size);
        dome(size);
    }

    /**
     * This method produces the thin parts of the tower that are
     *  located above the 'dome' and below the 'base'
     * 
     * @param size is requested from drawSpaceNeedle method, used to dictate the size of the dome
     * 
     * size*3 calculates how many spaces are needed on each line
     */
    public static void spike(int size) {            /* creates the  needle */
        for(int pipe = 1; pipe <= size; pipe++){
            for(int space = 1; space <= size*3; space++){
                System.out.print(" ");
            }
            System.out.print("||");
            System.out.println();
        }
    }

    /**
     * @param size is requested from drawSpaceNeedle method, used to dictate the size of the base
     * 
     * some of the characters did not need to be looped so they are simply printed
     * 
     * (-3*line)+(size*3) calculates how many spaces are needed on each line
     * 
     * (line*3-3) calculates how many colons are generated for each line
     */
    public static void dome(int size) {
        for(int line = 1; line <= size; line++){
            for(int space = 1; space <= ((-3*line)+(size*3)); space++){
                System.out.print(" ");
            }
            System.out.print("__/");
            
            for(int colon = 1; colon <= (line*3-3); colon++){
                System.out.print(':');
            }
            
            System.out.print("||");
            for(int colon = 1; colon <= (line*3-3); colon++){
                System.out.print(':');
            }
            System.out.print("\\__");
            System.out.println();
        }
        System.out.print('|');
        for(int quote = 1; quote <= (size*6); quote++){
            System.out.print('\"');
        }
        System.out.print('|');
        System.out.println();
    }

    /**
     * @param size is requested from drawSpaceNeedle method, used to dictate the size of the base
     * 
     * some of the characters did not need to be looped so they are simply printed
     * 
     * (size-line)*2 calculates how many spaces are needed on each line 
     * 
     * (line*2)+(size-1) calculates how many "/\" are generated for each line
     */
    public static void base(int size) {
        for(int line = size; line >= 1; line--){
            for(int space = 1; space <= ((size-line)*2); space++){
                System.out.print(" ");
            }
            System.out.print("\\_");
            for(int slashes = 1; slashes <= ((line*2)+(size-1)); slashes++){
                System.out.print("/\\");
            }
            System.out.print("_/");
            System.out.println();
        }
    }

    /**
     * @param size is requested from the fullColum method, which is requested
     * from the drawSpaceNeedle method, it is used to dictate the size of half of the column
     * 
     * some of the characters did not need to be looped so they are simply printed
     * 
     * the number of '%' that are generated are simply the size - 2
     */
    public static void halfColumn(int size) {
        System.out.print('|');
        for(int percent = 1; percent <= size-2; percent++){
            System.out.print('%');
        }
        System.out.print('|');
    }

    /**
     * @param size is requested from drawSpaceNeedle method, this is then passed to 
     * the halfColumn method, which dictates the size of the fully generated column
     * 
     * some of the characters did not need to be looped so they are simply printed
     * 
     * (size-line)*2 calculates how many spaces are needed on each line 
     * 
     * line <= size*4 will created a column that is looped 4 times the count of the size param
     * 
     * (size*3+1-size) calculates how many spaces are generated prior to the two halfColumn
     * method calls
     */
    public static void fullColumn(int size) {
        for(int line = 1; line <= size*4; line++){
            for(int space = 1; space <= (size*3+1-size); space++){
                System.out.print(" ");
            }
            halfColumn(size);
            halfColumn(size);
            System.out.println();
        }
    }
}