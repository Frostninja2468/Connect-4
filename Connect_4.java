//import java.util.*;
public class Connect_4
{
//    static final Scanner s = new Scanner(System.in);
    static boolean play = true;
//                 play = true => player 1  => X 
//                 play = false => player 2 => O
    
    static String[][] grd = {{"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
                             {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
                             {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
                             {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
                             {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},
                             {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"},};
    
                             
    public static void main(String args[])
    {
        System.out.println("\'X\' is player 1");
        System.out.println("\'O\' is player 2");
        System.out.println("");
    }
    public static void enter(char coor)
    {
        int x = (Character.toUpperCase(coor) - 65), l;
        for(l = 0 ; l < 6; l++)
        {
            if(grd[l][x].equals("[X]") || grd[l][x].equals("[O]"))
                break;
        }
        System.out.println(l + " " + x);
        if(l == 0)
            System.out.println("No space left in column " + coor);
        else
            grd[l - 1][x] = (play)?"[X]":"[O]";
    }
    
    public static void display()
    {
        int i, j;
        System.out.println(" A   B   C   D   E   F   G");
        System.out.println("---------------------------");
        for(i = 0 ; i < 6 ; i++)
        {
            for(j = 0 ; j < 7 ; j++)
                System.out.print(grd[i][j] + " ");
            System.out.println();
            System.out.println("---------------------------");
        }
    }
}