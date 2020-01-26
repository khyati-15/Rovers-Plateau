package components;

public class Rover{

    int x;
    int y;
    char direction;
    
//    enum Dir{
//        N,E,S,W;
//    }
//    
//    Dir orientation;
//    
//    
//    public Dir getNext(Dir orientation){
//        
//        int index=orientation.ordinal();
//        Dir vals[]=orientation.values();
//        return vals[(index+1)%vals.length];
//        
//    }
    
    public Rover(){
        
        x=0;
        y=0;
        direction='N';
        
    }
    
    public Rover(int x,int y,char dir){
        
        this.x=x;
        this.y=y;
        direction=dir;
//        initializeOrientation(dir);
        
    }
    
//    public void initializeOrientation(char dir){
//        
//        if(dir=='W')
//            orientation=Dir.W;
//        
//        else if(dir=='S')
//            orientation=Dir.S;
//        
//        else if(dir=='E')
//            orientation=Dir.E;
//        
//        else
//            orientation=Dir.N;
//        
//    }
    
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public char getDir(){
        return direction;
    }
    
    
    public void setOrientation(char dir){
        
        
        if(direction=='N'){
            
            if(dir=='L')
                direction='W';
            else
                direction='E';
            
        }
        
        else if(direction=='S'){
            
            if(dir=='L')
                direction='E';
            else
                direction='W';
            
        }
        
        else if(direction=='E'){
            
            if(dir=='L')
                direction='N';
            else
                direction='S';
            
        }
        
        else if(direction=='W'){
            
            if(dir=='L')
                direction='S';
            else
                direction='N';
            
        }
    }
    
    public void moveRover(int upperx,int uppery){
        
        if(direction=='N'){
            
            if((y+1)<=uppery)
                y++;
            else{
                y=0;
            }
            
        }
        
        else if(direction=='S'){
            
            if((y-1)>=0)
                y--;
            else{
                y=uppery;
            }
            
        }
        
        else if(direction=='E'){
            
            if((x+1)<=upperx)
                x++;
            else{
                x=0;
            }
            
        }
        
        else if(direction=='W'){
            
            if((x-1)>=0)
                x--;
            else{
                x=upperx;
            }
            
        }
       
    }
    
    public void explorePlateau(String dir,int upperx,int uppery){

        for(int j=0;j<dir.length();j++){
                
                char inp=dir.charAt(j);
                
                if(inp=='L' || inp=='R')
                    setOrientation(inp);
            
                else if(inp=='M')
                    moveRover(upperx,uppery);
            
                else
                    System.out.println("Invalid move");
                
            }
        
    }
    
    public void getRoverPosition(){
        
        System.out.println(getX()+" "+getY()+" "+getDir());
        
    }
    
}