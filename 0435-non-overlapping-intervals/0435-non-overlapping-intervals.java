class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 1) return 0;

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> res = new ArrayList<>();
        int count = 0;

        int[] current = intervals[0];
        res.add(current);

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] < current[1]) {
                count++;
                
                current[1] = Math.min(current[1], interval[1]);
            } else {
                current = interval;
                res.add(current);
            }
        }

        return count;
    }
}