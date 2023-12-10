public class SetSum {
    public static void main(String[] args) {
        int[] set1 = {1, 6, 8, 7, 2, 9};
        int[] set2 = {9, 8, 2, 1, 4, 5};
        int[] set3 = new int[set1.length];
        int k = 0;
        int sum = 0;
        for (int j : set1) {
            boolean found = false;
            for (int value : set2) {
                if (j == value) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                set3[k] = j;
                sum += set3[k];
                k++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Set3 elements:");
        for (int i = 0; i < k; i++) {
            System.out.println(set3[i]);
        }
    }
}

