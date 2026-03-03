//UC5 implementation
public class UC5_OOPS_Banner_InlineArray {

    public static void main(String[] args) {

        // Inline Declaration + Initialization
        String[] banner = {

                String.join("",
                        "  *****  ",
                        "  *****  ",
                        " ******  ",
                        "  *****  "
                ),

                String.join("",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * "
                ),

                String.join("",
                        "*       *",
                        "*       *",
                        " *     * ",
                        " *       "
                ),

                String.join("",
                        "*       *",
                        "*       *",
                        " ******  ",
                        "  *****  "
                ),

                String.join("",
                        "*       *",
                        "*       *",
                        " *       ",
                        "       * "
                ),

                String.join("",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        " *     * "
                ),

                String.join("",
                        "  *****  ",
                        "  *****  ",
                        " *       ",
                        "  *****  "
                )
        };

        // Enhanced For Loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}