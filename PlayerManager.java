import java.util.*;
public class PlayerManager 
{
    Player A ;
    Player B;
    GridManager gridManager;
    PlayerManager(GridManager temp)
    {
       A = new Player(gridManager);
       B = new Player(gridManager);
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
    Player setPlayer(boolean toggle)
    {
        if(toggle)
        {
            return A;
        }
        return B;
    }
}
