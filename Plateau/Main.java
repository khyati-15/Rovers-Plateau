import java.util.*;
import components.*;
class Main{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
                               
        int upperx = sc.nextInt();
        int uppery = sc.nextInt();
        int rovers = sc.nextInt();
        
        Plateau p = new Plateau(upperx,uppery);
                               
        for(int i=0;i<rovers;i++){
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            char orient = sc.next().charAt(0);
            
            String dir = sc.next();
            
            Rover r = new Rover(x,y,orient);
            
            r.explorePlateau(dir,p.getUpperX(),p.getUpperY());
            r.getRoverPosition();
            
        }
    }
    
}