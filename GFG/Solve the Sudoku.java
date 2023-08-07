// Given an incomplete Sudoku configuration in terms of a 9 x 9  2-D square matrix (grid[][]), the task is to find a solved Sudoku. For simplicity, you may assume that there will be only one unique solution.

// A sudoku solution must satisfy all of the following rules:

//     Each of the digits 1-9 must occur exactly once in each row.
//     Each of the digits 1-9 must occur exactly once in each column.
//     Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.

// Zeros in the grid indicates blanks, which are to be filled with some number between 1-9. You can not replace the element in the cell which is not blank.


// Sample Sudoku for you to get the logic for its solution:

// Example 1:

// Input:
// grid[][] = 
// [[3 0 6 5 0 8 4 0 0],
// [5 2 0 0 0 0 0 0 0],
// [0 8 7 0 0 0 0 3 1 ],
// [0 0 3 0 1 0 0 8 0],
// [9 0 0 8 6 3 0 0 5],
// [0 5 0 0 9 0 6 0 0],
// [1 3 0 0 0 0 2 5 0],
// [0 0 0 0 0 0 0 7 4],
// [0 0 5 2 0 6 3 0 0]]
// Output:
// True
// 3 1 6 5 7 8 4 9 2
// 5 2 9 1 3 4 7 6 8
// 4 8 7 6 2 9 5 3 1
// 2 6 3 4 1 5 9 8 7
// 9 7 4 8 6 3 1 2 5
// 8 5 1 7 9 2 6 4 3
// 1 3 8 9 4 7 2 5 6
// 6 9 2 3 5 1 8 7 4
// 7 4 5 2 8 6 3 1 9
// Explanation: 
// There exists a valid Sudoku for the input grid, which is shown in output.

// Your Task:
// You need to complete the two functions:
// SolveSudoku(): Takes a grid as its argument and returns true if a solution is possible and false if it is not.
// printGrid(): Takes a grid as its argument and prints the 81 numbers of the solved Sudoku in a single line with space separation.
// NOTE: Do not give a new line character after printing the grid. It has already been taken care of in the Driver Code.

// Expected Time Complexity: O(9N*N).
// Expected Auxiliary Space: O(N*N).

// Constraints:
// 0 ≤ grid[i][j] ≤ 9


class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(grid[i][j]==0){
                    for(int val=1;val<=9;val++){
                        if(isValid(grid,i,j,val)){
                            grid[i][j] = val;
                            if(SolveSudoku(grid)==true){
                                return true;
                            }
                            else{
                                grid[i][j] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isValid(int[][] grid,int r,int c,int val){
        for(int i=0;i<9;i++){
            if(grid[i][c]==val) return false;
            if(grid[r][i]==val) return false;
            if(grid[3*(r/3)+i/3][3*(c/3)+i%3]==val) return false;
        }
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(grid[i][j]+" ");
            }
        }
    }
}
