import java.util.HashMap;
import java.util.Map;

/**
 * UC8: Render OOPS Banner using HashMap and Rendering Function
 * Demonstrates Collections Framework and scalable architecture.
 */
public class UC8_OOPS_Banner_MapBased {

    public static void main(String[] args) {

        String message = "OOPS";

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner(message, patternMap);
    }

    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        map.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        map.put('S', new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });

        return map;
    }

    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    sb.append(pattern[row]);
                }
            }

            System.out.println(sb.toString());
        }
    }
}