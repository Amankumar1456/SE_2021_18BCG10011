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
        setPawnsName();
    }
    void setPawnsName()
    {
        for(int i=0;i<gridManager.getSize();i++)
        {
            String temp=sc.nextLine();
            pawns[i].setName(temp);
            
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
