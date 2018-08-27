
//copy this link below for Frogger recipe:

//http://level1.jointheleague.org/Mod4Recipes/Frogger.html

//Friday: create a constructor for the Car class
//continue to work on Frogger
//Goal: Finish Frogger on Friday

int hopX = width/2;
int hopY = 480;

void setup() {
  size(500, 500);

}

void draw () { 
  background(87, 187, 232);
  drawBackground();          //background
  //frog
  fill(26, 95, 26);
  ellipse(hopX, hopY, 20, 20);
  ellipse(hopX-5, hopY-9, 10, 10);
  ellipse(hopX+5, hopY-9, 10, 10);
  fill(0);
  ellipse(hopX-5, hopY-9, 3, 3);
  ellipse(hopX+5, hopY-9, 3, 3);
  noStroke();
  noFill();

}



void drawBackground() {
  background(72, 245, 73);


  fill(51, 52, 51);
  rect(0, 50, 500, 50);
  rect(0, 300, 500, 50);

  fill(239, 247, 32);
  rect(0, 70, 40, 10);
  rect(100, 70, 50, 10);
  rect(200, 70, 50, 10);
  rect(300, 70, 50, 10);
  rect(400, 70, 50, 10);
  rect(500, 70, 50, 10);

  fill(239, 247, 32);
  rect(50, 320, 50, 10);
  rect(150, 320, 50, 10);
  rect(250, 320, 50, 10);
  rect(350, 320, 50, 10);
  rect(450, 320, 50, 10);


  fill(8, 79, 139);
  rect(0, 150, 500, 100);
}






void keyPressed() {
  if (key=='d')
    hopX= hopX+5;
  if (key=='a')
    hopX= hopX - 5;
  if (key=='s')
    hopY= hopY+5;
  if (key=='w')
    hopY= hopY - 5;
}


class Car{
int carX= 400; //these will need to change
int carY=  300;
int carSize= 40;
int carSpeed=5; //5 units per key pressed
//create a constructor for your Car class that initializes each member variable with parameters

void display() 
{
      fill(0,255,0);
      rect(carX , carY, carSize, 50);
}







}