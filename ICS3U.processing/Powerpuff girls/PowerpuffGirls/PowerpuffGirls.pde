public void setup(){
  // changes screen display
  size(600, 400);
  //changes background color
  background(#A9DEFA);
  
  //bubbles
  //hair
  fill(#FFFA58);
  ellipse(100, 150, 40, 40);
  ellipse(200, 150, 40, 40);
  //arms
  fill(#FAE2BB);
  ellipse(130, 250, 40, 10);//left 
  ellipse(170, 250, 40, 10);//right
  //body
  fill(#62C8FA);
  rect(136, 200, 30, 80);
  fill(0);
  rect(136, 255, 30, 10);//stripe
  //shoes
  fill(0);
  ellipse(144, 298, 15, 16);//left
  //legs
  fill(255);
  rect(136, 275, 15, 20);//left
  arc(159, 277, 16, 20, 0, PI + PI, CHORD);//right
  fill(0);
  arc(159, 278, 16, 20, 0, PI, CHORD);//right(shoe)
  //shoe detail
  fill(255);
  arc(144, 298, 8, 11, 0, PI, CHORD);//left
  arc(159, 280, 8, 11, 0, PI, CHORD);//right
  //head
  fill(#FAE2BB);
  ellipse(150, 200, 110, 100);
  //smile
  noFill();
  curve(150, 200, 145, 230, 155, 230, 150, 200);
  //eyes
  fill(255);
  ellipse(120, 200, 50, 50);//left
  ellipse(180, 200, 50, 50);//right
  //eye color
  noStroke();
  fill(#62C8FA);
  ellipse(125, 200, 40, 40);//left
  ellipse(175, 200, 40, 40);//right
  fill(0);
  ellipse(130, 200, 30, 30);//left
  ellipse(170, 200, 30, 30);//right
  //catch light
  fill(255);
  ellipse(135, 200, 10, 10);//left
  ellipse(165, 200, 10, 10);//right
 
  
  //blossom
  //hair
  stroke(2);
  fill(#FC8930);
  rect(270, 85, 60, 100);
  //arms
  fill(#FAE2BB);
  ellipse(275, 150, 40, 10);//left 
  ellipse(345, 60, 10, 40);//right
  //body
  fill(#FC82BD);
  rect(285, 95, 30, 80);
  fill(0);
  rect(285, 155, 30, 10);//stripe
  //shoes
  fill(0);
  ellipse(293, 198, 15, 16);//left
  //legs
  fill(255);
  rect(285, 175, 15, 20);//left
  arc(308, 177, 16, 20, 0, PI + PI, CHORD);//right
  fill(0);
  arc(308, 178, 16, 20, 0, PI, CHORD);//right(shoe)
  //shoe detail
  fill(255);
  arc(293, 198, 8, 11, 0, PI, CHORD);//left
  arc(308, 180, 8, 11, 0, PI, CHORD);//right
  //head
  fill(#FAE2BB);
  ellipse(300, 100, 110, 100);
  //smile
  noFill();
  curve(300, 100, 295, 130, 305, 130, 300, 100);
  //eyes
  fill(255);
  ellipse(270, 100, 50, 50);//left
  ellipse(330, 100, 50, 50);//right
  //eye color
  noStroke();
  fill(#FC82BD);
  ellipse(275, 100, 40, 40);//left
  ellipse(325, 100, 40, 40);//right
  fill(0);
  ellipse(280, 100, 30, 30);//left
  ellipse(320, 100, 30, 30);//right
  //catch light
  fill(255);
  ellipse(285, 100, 10, 10);//left
  ellipse(315, 100, 10, 10);//right
  
  //buttercup
  //hair
  fill(0);
  arc(449, 170, 140, 140, 0, PI, CHORD);
  //arms
  stroke(0);
  fill(#FAE2BB);
  ellipse(430, 250, 40, 10);//left 
  ellipse(470, 250, 40, 10);//right
  //body
  stroke(2);
  fill(#7DD679);
  rect(435, 200, 30, 80);
  fill(0);
  rect(435, 255, 30, 10);//stripe
  //shoes
  fill(0);
  ellipse(443, 298, 15, 16);//left
  //legs
  fill(255);
  rect(435, 275, 15, 20);//left
  arc(458, 277, 16, 20, 0, PI + PI, CHORD);//right
  fill(0);
  arc(458, 278, 16, 20, 0, PI, CHORD);//right(shoe)
  //shoe detail
  fill(255);
  arc(443, 298, 8, 11, 0, PI, CHORD);//left
  arc(458, 280, 8, 11, 0, PI, CHORD);//right
  //head
  fill(#FAE2BB);
  ellipse(450, 200, 110, 100);
  //bangs
  fill(0);
  curve(400, 378, 405, 172, 495, 173, 400, 298);
  //smile
  noFill();
  curve(450, 200, 445, 230, 455, 230, 450, 200);
  //eyes
  fill(255);
  ellipse(420, 200, 50, 50);//left
  ellipse(480, 200, 50, 50);//right
  //eye color
  noStroke();
  fill(#7DD679);
  ellipse(425, 200, 40, 40);//left
  ellipse(475, 200, 40, 40);//right
  fill(0);
  ellipse(430, 200, 30, 30);//left
  ellipse(470, 200, 30, 30);//right
  //catch light
  fill(255);
  ellipse(435, 200, 10, 10);//left
  ellipse(465, 200, 10, 10);//right
  
}
