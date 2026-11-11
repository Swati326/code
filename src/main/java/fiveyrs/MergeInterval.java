package fiveyrs;

public class MergeInterval {
    public static void main(String[] args) {

        //Merge Intervals (Asked in many product companies)
        //[[1,3],[2,6],[8,10],[15,18]]
        //
        //[[1,6],[8,10],[15,18]]



                int[][] intervals = {
                        {1,3},
                        {2,6},
                        {8,10}
                };

                int initialstart = intervals[0][0];
                int initialend = intervals[0][1];

                for(int i = 1; i < intervals.length; i++) {

                    int currentStart = intervals[i][0];
                    int currentEnd = intervals[i][1];

                    if(currentStart <= initialend) {

                        initialend = Math.max(initialend, currentEnd);

                    } else {

                        System.out.println("[" + initialstart + "," + initialend + "]");

                        initialstart = currentStart;
                        initialend = currentEnd;
                    }
                }

                System.out.println("[" + initialstart + "," + initialend + "]");
            }

}
