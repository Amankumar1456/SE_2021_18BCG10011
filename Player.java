public class Player {
    GridManager gridManager;
    Player(GridManager gridManager)
    {
        this.gridManager=gridManager;
    }
    public boolean isPlayerAlive()
    {
        return true;
    }
    
    public boolean validateMove(String inp)
    {
        try 
        {
            String[] move=inp.split(":");
            String CharName=move[0];
            String moveCount=move[1];
            checkMove();
        } catch (Exception e) {
            System.out.println("Invalid Move");
        }
        checkGridBounds();//out of bound , killing its own
       
        

    }
    void makeMove();
}
