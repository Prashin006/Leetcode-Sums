class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
//         m = no of rows, n = no of columns
        int m = matrix.length, n = matrix[0].length;
        int k = 0, l = 0;
        while(k < m && l < n){
//             left to right
            for(int i = l;i < n;i++){
                list.add(matrix[k][i]);
            }
            k++;
//             top to bottom
            for(int i = k;i < m;i++){
                list.add(matrix[i][n - 1]);
            }
            n--;
//             right to left
            if(k < m){
                for(int i = n - 1;i >= l;i--){
                    list.add(matrix[m - 1][i]);
                }
                m--;
            }
//             bottom to top
            if(l < n){
                for(int i = m - 1;i >= k;i--){
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}