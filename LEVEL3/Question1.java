import java.util.Random;

public class Question1 {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); 
        }

        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return sum / (double) heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int minHeight = heights[0];
        for (int height : heights) {
            if (height < minHeight) {
                minHeight = height;
            }
        }
        return minHeight;
    }

    public static int findTallestHeight(int[] heights) {
        int maxHeight = heights[0];
        for (int height : heights) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);
        double meanHeight = findMeanHeight(heights);

        System.out.println("Heights of players (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\n\nShortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + meanHeight + " cm");
    }
}
