package fiveyrs;

public class RotateArrayLeftByN {
    public static void main(String[] args) {

        int a[]={4,5,1,2,6};
        int n = 2;
        // Handle cases where n >= array length
        n = n % a.length;

        // Left Rotation
// 1. Reverse first n elements
        reverse(a, 0, n - 1);

// 2. Reverse remaining elements
        reverse(a, n, a.length - 1);

// 3. Reverse complete array
        reverse(a, 0, a.length - 1);

        for (int num : a) {
        System.out.print(num + " ");
                }
            }

                            // Note for reverse right: Whole array → First elm → Remaining elm
                    /*
                        // Right Rotation
                        // 1. Reverse complete array
                        reverse(a, 0, a.length - 1);

                        // 2. Reverse first n elements
                        reverse(a, 0, n - 1);

                        // 3. Reverse remaining elements
                        reverse(a, n, a.length - 1);
                     */
    public static void reverse(int[] a, int start, int end) {

        while (start < end) {

            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }

        }
    }

