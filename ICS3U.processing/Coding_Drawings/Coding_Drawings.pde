int x = 0;
boolean open = true;
public void setup() {
  println("setup()");
  
  size(600, 400);
  
  frameRate(10);
  
  background(200);
  
  noStroke();
  stroke(222, 9, 9);
  strokeWeight(2);
   // ( x, y(pt), x to the right, y down, rounds edge);
  fill(#E89898); 
  rect( 200, 200, 100, 100);
  rectMode(CENTER);
  rect( 200, 200, 100, 100); 
  
  // makes a triangle
  triangle( 0,0,10, height, width, height);
  
  // makes a circle
  ellipse(100, 100, 100, 100);
  
  // makes an arch
  arc(400,200, 150, 150,radians (30), radians(330));
}

public void draw() {
  open = !open;
  background(0);
  arc(400,200, 150, 150,radians (30), radians(330));

}
public void someOtherMethod() {
  println("Good Bye!");
}
