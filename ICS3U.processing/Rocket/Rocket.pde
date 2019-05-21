int xLoc = 250;
int yLoc = 200;
int rockHeight = 200;
int rockWidth = 100;

public void setup() {
  
  size(600, 400);
  background(0);
  frameRate(40);
  
}
public void draw(){
  background(0);
  //moon
  fill(255);
  ellipse(500, 40, 100, 100);
  fill(200);
  ellipse(475, 40, 25, 35);
  fill(200);
  ellipse(515, 65, 20, 15);
  fill(200);
  ellipse(530, 20, 30, 25);
  
  //stars
  fill(255);
  ellipse(100, 40, 10, 10);
  ellipse(200, 80, 10, 10);
  ellipse(550, 160, 10, 10);
  ellipse(400, 100, 10, 10);
  ellipse(500, 240, 10, 10);
  ellipse(50, 20, 10, 10);
  ellipse(250, 50, 10, 10);
  ellipse(50, 90, 10, 10);
  ellipse(75, 200, 10, 10);
  ellipse(250, 170, 10, 10);
  ellipse(150, 270, 10, 10);
  ellipse(400, 300, 10, 10);
  ellipse(150, 350, 10, 10);
  ellipse(550, 400, 10, 10);
  
  //rocket body
  fill(200);
  rect(xLoc, yLoc, rockWidth, rockHeight);
  
  //rocket top
  fill(#FA6D49);
  triangle(xLoc, yLoc, xLoc + rockWidth, yLoc, xLoc + rockWidth/2, yLoc - rockHeight/2);
  
  //window
  fill(#88DCF0);
  ellipse(xLoc + rockWidth/2, yLoc + rockWidth/2, rockWidth/2, rockWidth/2);
  
  //fire 
  noStroke();
  fill(#FF712E);
  triangle(xLoc + rockWidth/10, yLoc + rockHeight, xLoc + rockWidth/2, yLoc + rockHeight - rockHeight/10 + rockWidth, xLoc + rockWidth - rockWidth/10, yLoc + rockHeight);
  fill(#FF972E);
  triangle(xLoc + rockWidth/4, yLoc + rockHeight, xLoc + rockWidth/2, yLoc + rockHeight - rockHeight/4 + rockWidth, xLoc + rockWidth/2 + rockWidth/4, yLoc + rockHeight);
  fill(#FFDC5A);
  triangle(xLoc + rockWidth/4 + rockWidth/8, yLoc + rockHeight, xLoc + rockWidth/2, yLoc + rockHeight - rockHeight/4 - rockHeight/8 + rockWidth, xLoc + rockWidth/2 + rockWidth/4 - rockWidth/8, yLoc + rockHeight);
  
  //water
  fill(#3ABBFA);
  ellipse(300, 620, 600, 600);
  
  //ground
  fill(#4AC662);
  ellipse(400, 420, 200, 100);
  ellipse(215, 450, 150, 200);
  ellipse(300, 350, 50, 50);
 
 
}

// Click on the image to give it focus,
// and then press any key.
void keyPressed() {
  if (key == CODED) {
    if (keyCode == UP) {
      yLoc = yLoc - 2;
    } else if (keyCode == DOWN) {
      yLoc = yLoc + 2;
    } else if (keyCode == LEFT){
      xLoc = xLoc - 2;
    } else if (keyCode == RIGHT){
      xLoc = xLoc + 2;
    }
  }
}
