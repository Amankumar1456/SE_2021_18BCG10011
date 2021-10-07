import java.util.*;
public class PlayerManager 
{
    Player A ;
    Player B;
    GridManager gridManager;
    Scanner sc = new Scanner(System.in);
    PlayerManager(GridManager temp)
    {
        //initialize player1
        System.out.println("Player1 name=");
        String name1=sc.nextLine();
        A = new Player(gridManager);
        A.setname(name1);
        //initialize player2
        System.out.println("Player2 name=");
        String name2=sc.nextLine();
        B = new Player(gridManager);
        B.setname(name2);
        // grid manager
        gridManager=temp;
    }

    public int addMove(String inp,boolean toogle)
    {
        Player X=setPlayer(toogle);
        // check for  player status, valid move,and make it
        if (X.isPlayerAlive() )
        {
            if(X.validateMove(inp))
            {
                return 1;
            }
            else{
                return 0;
            }
        }
        return -1;

    }
    assignNames()
    {

    }
    Player setPlayer(boolean toggle)
    {
        if(toggle)
        {
            return A;
        }
        return B;
    }
}
