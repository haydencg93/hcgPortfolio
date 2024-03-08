import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class wordSearchHelp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the grid of letters
        List<String> grid = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("-")) {
                break;
            }
            grid.add(line);
        }

        // Read the list of words to find
        List<String> words = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("-")) {
                break;
            }
            words.add(line.toUpperCase());
        }

        // Find the words in the grid
        Map<String, List<String>> results = new HashMap<>();
        for (String word : words) {
            List<String> result = new ArrayList<>();
            boolean found = false;
            for (int i = 0; i < grid.size(); i++) {
                String row = grid.get(i);
                for (int j = 0; j < row.length(); j++) {
                    if (row.charAt(j) == word.charAt(0)) {
                        if (search(grid, word, i, j)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("(").append(i + 1).append(",").append(j + 1).append(")");
                            result.add(sb.toString());
                            found = true;
                        }
                    }
                }
            }
            if (found) {
                results.put(word, result);
            } else {
                results.put(word, List.of("Not found."));
            }
        }

        // Print the results
        for (String word : words) {
            List<String> result = results.get(word);
            System.out.print(word + ": " + String.join(" ", result) + "\n");
        }
    }

    private static boolean search(List<String> grid, String word, int row, int col) {
        if (word.length() == 1) {
            return true;
        }
        char c = word.charAt(1);
        if (col > 0 && grid.get(row).charAt(col - 1) == c && search(grid, word.substring(1), row, col - 1)) {
            return true;
        }
        if (col < grid.get(row).length() - 1 && grid.get(row).charAt(col + 1) == c && search(grid, word.substring(1), row, col + 1)) {
            return true;
        }
        if (row > 0 && grid.get(row - 1).charAt(col) == c && search(grid, word.substring(1), row - 1, col)) {
            return true;
        }
        if (row < grid.size() - 1 && grid.get(row + 1).charAt(col) == c && search(grid, word.substring(1), row + 1, col)) {
            return true;
        }
        return false;
    }
}