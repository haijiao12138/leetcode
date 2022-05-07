package main.java.com.haijiao12138.demo.leetcode.code2022.day_0503;

/**
 * @ClassName 力扣79_单词搜索_中等
 * @Author houyuanbo
 * @Date 2022/5/3 15:45
 * @Description TODO
 * @Version 回溯
 **/
public class 力扣79_单词搜索_中等 {
    public static void main(String[] args) {
        char[][] board ={{'A','B','C','E'},{'S','F','C','S'}, {'A','D','E','E'}};
        String word = "ABCCED";
        boolean exist = exist(board, word);
        System.out.println(exist);
    }

    public static boolean exist(char[][] board,String word){
        for (int i = 0; i < board.length; i++) {//行
            for (int j = 0; j < board[0].length; j++) {//列
                if (search(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean search(char[][] board,String word,int i,int j,int k){
        if (k >= word.length()){//当长度大于要匹配大长度后 认为存在
            return true;
        }
        if (i<0 || i>=board.length || j<0 ||j>=board[0].length || board[i][j] != word.charAt(k)){
            return false;
        }
        board[i][j] += 256;
        boolean result = search(board, word, i, j + 1, k + 1) || search(board,word,i-1,j,k+1) || search(board,word,i+1,j,k+1) || search(board,word,i,j-1,k+1);
        board[i][j] -= 256;
        return result;

    }
}
