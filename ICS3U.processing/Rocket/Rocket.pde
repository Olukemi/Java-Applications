int xLoc = 250;
int yLoc = 200;
int rockHeight = 200;
int rockWidth = 100;

public void setup() {
  
  size(600, 400);
  background(#558AE3);
  frameRate(20);
  
}
public void draw(){
  background(#558AE3);
  
  //rocket body
  fill(200);
  rect(xLoc, yLoc, rockWidth, rockHeight);
  
  //rocket top
  fill(#FA6D49);
  triangle(xLoc, yLoc, xLoc + rockWidth, yLoc, xLoc + rockWidth/2, yLoc - rockHeight/2);
  
  yLoc = yLoc - 2;
    
}
