class Solution {
    int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalCol = image[sr][sc];
        if (originalCol == color) return image;

        dfs(image, sr, sc, originalCol, color);
        return image;
        
    }

    private void dfs(int[][] image, int sr, int sc, int originalCol, int color){
        
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != originalCol){
            return;
        }

        image[sr][sc] = color;
        
        for (int[] dir : directions){
            dfs(image, sr + dir[0], sc + dir[1], originalCol, color);
        }
    }

}