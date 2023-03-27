public class CreateLine {
    public static void main(String[] args) {
        int[][] myNumber = {{26, 12, 3}, {4, 9, 4, 20}, {1, 1, 1, 1, 1, 1}};

        // here the code
        for (int i = 0; i < myNumber.length; i++) {
            for (int j = 0; j < myNumber[i].length; j++) {
                System.out.println(myNumber[i][j]);
            }

            // make a line, but before end, it's not showing
            if (i != myNumber.length - 1) {
                System.out.println("------");
            }
        }

    }
}
