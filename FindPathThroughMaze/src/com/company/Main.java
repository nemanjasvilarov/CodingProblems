package com.company;
import java.awt.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        int[][] myMaze = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 3, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 1, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 1, 2, 1, 1, 1, 0},
                {0, 1, 0, 0, 1, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        int[][] myMaze2 = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 1, 0, 0, 0, 0},
                {2, 1, 1, 1, 1, 1, 1, 1, 3, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 0, 1, 1, 1, 0},
                {0, 1, 0, 0, 1, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0}};

        var myMaze3 = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
                {0, 2, 1, 0, 1, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 1, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 1, 0, 1, 1, 1, 0},
                {0, 1, 0, 0, 1, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        var myMaze4 = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 1, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 1, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        var myMaze5 = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 2, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 1, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        var myMaze6 = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 2, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 1, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 1, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        var myMaze7 = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0, 3, 0, 0},
                {2, 1, 1, 0, 1, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 1, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 1, 0, 1, 1, 1, 0},
                {1, 1, 0, 0, 1, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        var myMaze8 = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {2, 1, 1, 0, 1, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 3, 1, 0, 1, 1, 1, 0},
                {1, 1, 0, 0, 1, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        int[][] visited = new int[10][10];

        Maze maze = new Maze();
        ArrayList<Point> alist =maze.findPath(myMaze8,visited,3, 0);
        for (int i = 0;i <alist.size() ; i++) {
            System.out.println(" "+alist.get(i));
        }



    }
}
