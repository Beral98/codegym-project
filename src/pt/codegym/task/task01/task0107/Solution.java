package pt.codegym.task.task01.task0107;

/* 
Sem comentários
*/

public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        y = x * y; //y = 24
        //y = x + y; //y = 14

        x = y - x; // x = 10
        y = y - x; // y = 10

        System.out.println(x);
        System.out.println(y);
    }
}
