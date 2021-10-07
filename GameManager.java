import java.util.*;
class GameManager
{
    public Scanner sc=new Scanner(System.in);
    public boolean EndGame;
    public static void main(String[] args)
    {
        GameManager gameManager = new GameManager();
        gameManager.start();
    }
    
    private  void start()
    {
        
         
        GridManager gridManger=new GridManager();
        PlayerManager pm=new PlayerManager(gridManger);
        


        boolean toggle=true;
        EndGame=false;
        while(!EndGame)
        {
            String str=sc.nextLine();
            int status= pm.addMove(str,toggle);
            if(status==1)
            {
                toggle=!toggle;
                continue;      
            }
            else if(status==0)
            {
                invalidInput();
                continue;
            }
            else 
            {
                endGame();
            }
        }
    }
   void invalidInput()
   {
       System.out.println("Incorrect format");
       System.out.println("Input move format: <character_name>:<move>  (e.g. P1:L, P2:R, P3:F, P3:B)");
   }
    public void endGame()
    {
        EndGame=true;

    }
}