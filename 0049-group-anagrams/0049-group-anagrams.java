class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            //How # Fixes It
// By adding # before every count value:

// Word A (1 'a', 1 'b'):

// String key with #: "#1#1#0#0..."

// Word B (11 'a's, 0 'b's):

// String key with #: "#11#0#0#0..."

// Now the keys "#1#1#0#0..." and "#11#0#0#0..." are distinct strings, ensuring different character counts never produce the same map key.
            StringBuilder sb = new StringBuilder();
            for (int val : count) {
                sb.append('#').append(val);
            }
            String key = sb.toString();

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         if (strs == null || strs.length == 0) return new ArrayList<>();

//         Map<String, List<String>> map = new HashMap<>();

//         for (String s : strs) {
//             char[] ca = s.toCharArray();
//             Arrays.sort(ca);
//             String key = String.valueOf(ca);

//             map.putIfAbsent(key, new ArrayList<>());
//             map.get(key).add(s);
//         }

//         return new ArrayList<>(map.values());
//     }
// }