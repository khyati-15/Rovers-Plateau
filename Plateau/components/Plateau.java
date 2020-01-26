package components;

public class Plateau{
    
    int upperx;
    int uppery;
    int lowerx;
    int lowery;
    
    public Plateau(){
        
        lowerx = 0;
        lowery = 0;
        upperx = 0;
        uppery = 0;
        
    }
    
    public Plateau(int upperx,int uppery){
        
        this.upperx = upperx;
        this.uppery = uppery;
        
    }
    
    public int getLowerX(){
        return lowerx;
    }
    
    public int getLowerY(){
        return lowery;
    }
    
    public int getUpperX(){
        return upperx;
    }
    
    public int getUpperY(){
        return uppery;
    }
    
}