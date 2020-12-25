package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Maze {

    public boolean end = false;
    ArrayList<Point> coordinates = new ArrayList<Point>();

    /**
     *
     * @param myMaze is array used for finding path
     * @param visited to check if current position has been visited
     * @param i is first coordinate in array
     * @param j is second coordinate in array
     * @param end is parameter for checking if maze is finished or not
     * @return false  if any of conditions in if statement are met and return true if given conditions arent met
     */

    public boolean isSafe(int[][] myMaze, int[][] visited, int i, int j, boolean end) {
        if (myMaze[i][j] == 0 || visited[i][j] == 1 || end == true)
            return false;
        else
            return true;

    }

    /**
     *
     * @param myMaze is array used for finding path
     * @param i is first coordinate in array
     * @param j is second coordinate in array
     * @return true if coordinates in maze arent out of bounds and if they are equal or bigger than zero
     */
    public boolean isValid(int[][] myMaze, int i, int j) {
        if (i < myMaze.length && j < myMaze.length && i >= 0 && j >= 0)
            return true;
        else
            return false;
    }


    /**
     *
     * @param myMaze is array used for finding path
     * @param visited
     * @param i is first coordinate in array
     * @param j is second coordinate in array
     * algorithm is returning path from end to beginning
     * method called reversed is used for fixing that issue
     * @return path coordinates in right order
     */
    public ArrayList<Point> findPath(int[][] myMaze, int[][] visited, int i, int j) {

        if (myMaze[i][j] == 3) {
            end = true;
        }

        visited[i][j] = 1;

        if (isValid(myMaze, i + 1, j) && isSafe(myMaze, visited, i + 1, j, end)) {
            findPath(myMaze, visited, i + 1, j);
        }

        if (isValid(myMaze, i, j + 1) && isSafe(myMaze, visited, i, j + 1, end)) {
            findPath(myMaze, visited, i, j + 1);
        }

        if (isValid(myMaze, i - 1, j) && isSafe(myMaze, visited, i - 1, j, end)) {
            findPath(myMaze, visited, i - 1, j);
        }

        if (isValid(myMaze, i, j - 1) && isSafe(myMaze, visited, i, j - 1, end)) {
            findPath(myMaze, visited, i, j - 1);
        }

        if (end) {
            //System.out.print("[ " + i + ","+ j+" ]");
            coordinates.add(new Point(i, j));
        }

        visited[i][j] = 0;

        return reversed(coordinates);
    }


    /**
     *
     * @param alist list of coordinates that are in reversed order
     *  this function gets path solution from end to beginning and reverses the direction so that solution path starts from beginning
     * @return returns revList which is array list with path coordinates in right order
     */
    public ArrayList<Point> reversed(ArrayList<Point> alist) {
        ArrayList<Point> revList = new ArrayList<Point>();
        for (int i = alist.size() - 1; i >= 0; i--) {
            revList.add(alist.get(i));
        }
        return revList;
    }

}
