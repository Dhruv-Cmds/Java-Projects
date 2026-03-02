package HangMan.v2_oop_file;

public class HangmanArt{

    public String getHangmanArt (int wrongGuesses){

             return switch (wrongGuesses){

            case 0 -> """
                       


                      """;

            case 1 -> """
                       o


                      """;

            case 2 -> """
                       o
                       |

                      """;

            case 3 -> """
                       o
                      /|

                      """;

            case 4 -> """
                       o
                      /|\\

                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                      """;

            default -> "";
        };
    }

}
