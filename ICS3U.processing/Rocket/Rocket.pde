int xLoc = 250;
int yLoc = 200;
int rockHeight = 200;
int rockWidth = 100;

public void setup() {
  
  size(600, 400);
  background(#558AE3);
  frameRate(40);
  
}
public void draw(){
  background(#558AE3);
  
  //rocket body
  fill(200);
  rect(xLoc, yLoc, rockWidth, rockHeight);
  
  //rocket top
  fill(#FA6D49);
  triangle(xLoc, yLoc, xLoc + rockWidth, yLoc, xLoc + rockWidth/2, yLoc - rockHeight/2);
  
  //window
  fill(#88DCF0);
  ellipse(xLoc + rockWidth/2, yLoc + rockWidth/2, 75, 75);
  
  //fire 
  noStroke();
  fill(#FF712E);
  triangle(xLoc + rockWidth/10, yLoc + rockHeight, xLoc + rockWidth/2, yLoc + rockHeight - rockHeight/10 + rockWidth, xLoc + rockWidth - rockWidth/10, yLoc + rockHeight);
  fill(#FF972E);
  triangle(xLoc + rockWidth/4, yLoc + rockHeight, xLoc + rockWidth/2, yLoc + rockHeight - rockHeight/4 + rockWidth, xLoc + rockWidth/2 + rockWidth/4, yLoc + rockHeight);
  fill(#FFDC5A);
  triangle(xLoc + rockWidth/4 + rockWidth/8, yLoc + rockHeight, xLoc + rockWidth/2, yLoc + rockHeight - rockHeight/4 - rockHeight/8 + rockWidth, xLoc + rockWidth/2 + rockWidth/4 - rockWidth/8, yLoc + rockHeight);
  
  //ground
  fill(#4AC662);
  ellipse(300, 620, 600, 600);
  
  yLoc = yLoc - 2;
    
}
