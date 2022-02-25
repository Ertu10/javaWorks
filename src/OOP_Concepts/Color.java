package OOP_Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Color {

    private int[] rgb = new int[3];



    public final static int[] WHITE     = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY      = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
    public final static int[] BLACK     = new int[]{0, 0, 0};
    public final static int[] RED       = new int[]{255, 0, 0};
    public final static int[] PINK      = new int[]{255, 175, 175};
    public final static int[] ORANGE    = new int[]{255, 200, 0};
    public final static int[] YELLOW    = new int[]{255, 255, 0};
    public final static int[] GREEN     = new int[]{0, 255, 0};
    public final static int[] MAGENTA   = new int[]{255, 0, 255};
    public final static int[] CYAN      = new int[]{0, 255, 255};
    public final static int[] BLUE      = new int[]{0, 0, 255};



    public Color(int r, int g, int b){
        this.rgb[0] = r;
        this.rgb[1] = g;
        this.rgb[2] = b;

    }


    public Color() {
        this(255,255,255);
    }


    public String toString() {
        ArrayList<int[]> colors =new ArrayList<>();
        Map <int[],String> colorss = new HashMap<>();
        colorss.put(WHITE,"white");colorss.put(BLACK,"black");colorss.put(PINK,"pink");
        colorss.put(GRAY,"gray");colorss.put(GREEN,"green");
        colorss.put(DARK_GRAY,"dark gray");colorss.put(LIGHT_GRAY,"light gray");
        colorss.put(MAGENTA,"magenta");colorss.put(CYAN,"cyan");colorss.put(RED,"red");

        for (int[] each : colorss.keySet()) {
            if(Arrays.equals(each,this.rgb)) {
                return colorss.get(each);
            }
        }
        return "n/a";

    }

 }

