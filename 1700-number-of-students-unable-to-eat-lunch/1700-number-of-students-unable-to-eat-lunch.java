class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        //tc..0(n);
        Queue<Integer> q = new LinkedList<>();
        for (int student : students) {
            q.add(student);
        }

        int i = 0; 
        int rotate = 0; 
        while (!q.isEmpty() && rotate < q.size()) {
            if (q.peek() == sandwiches[i]) {
                q.poll(); 
                i++;
                rotate = 0; 
            } else {
                q.add(q.poll()); 
                rotate++;
            }
        }

        return q.size();
    }
}