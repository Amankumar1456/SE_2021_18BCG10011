import java.util.*;
public class Player {
    GridManager gridManager;
    Level1[] pawns;
    String PlayerName;
    Scanner sc = new Scanner(System.in);
    Player(GridManager gridManager)
    {
        this.gridManager=gridManager;

    }
    void setname(String name)
    {
        PlayerName=name;
        setPawns();
    }
    void setPawn(String PawnName,String op)
    {

    }
    void setPawns()
    {
        System.out.println("enter pawns name seperated by ,");
        String[] str=sc.nextLine().split(",");
        for(int i=0;i<gridManager.getSize();i++)
        {
            String temp=str[i];
            pawns[i].setName(temp);
            pawns[i].setI(0);
            pawns[i].setJ(i);
            gridManager.updateGrid(temp,0,i);
        }
    }
    public boolean validateMove(String inp)
    {
        
        String CharName;
        String moveCount;
        try 
        {
            String[] move=inp.split(":");
            CharName=move[0];
            moveCount=move[1];
            
        } catch (Exception e) {
            System.out.println("Invalid Move");
        }
        if(gridManager.checkMove())
        {
            
        }
        checkGridBounds();//out of bound , killing its own

    }
    void makeMove();
    void assignNames(String[] names)
    {
        
        for(int i=0)
    }
    public boolean isPlayerAlive()
    {
        return true;
    }
}
