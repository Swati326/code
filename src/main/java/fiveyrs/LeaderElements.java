package fiveyrs;

public class LeaderElements {

        public static void main(String[] args) {

            int[] a = {16, 17, 4, 3, 5, 2};

            System.out.println("Leaders are:");

            for (int i = 0; i < a.length; i++) {

                boolean isLeader = true;

                // Compare current element with all elements on its right
                for (int j = i + 1; j < a.length; j++) {

                    if (a[j] >= a[i]) {
                        isLeader = false;
                        break;
                    }
                }

                if (isLeader) {
                    System.out.print(a[i] + " ");
                }
            }
        }

}
