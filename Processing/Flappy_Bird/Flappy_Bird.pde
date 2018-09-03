int birdX= 20;
int birdY=350;

int birdWidth= 24;
int birdHeight = 24;

double velocity= 0;
double gravity= 0.5 ;

int pipeX= 400;
int pipeY= 400;

void setup() {
  size(700, 800);
}
void draw() {
  background(68, 187, 204);

  //ball
  fill(239, 54, 188);
  ellipse(birdX, birdY, birdWidth, birdHeight);

  birdY+= velocity;
  velocity+=gravity;
  //pipe

  fill(25, 35, 67);
  pipeX-=6;
  rect(pipeX, 0, 40, 250);
  rect(pipeX, pipeY, 40, 400);
  if (pipeX<=0) {
     pipeY= (int) random(500, 800);
    pipeX=800;
  }
  fill(25, 35, 67);
  pipeX-=6;
  rect(pipeX, 0, 40, 250);
  rect(pipeX, pipeY, 40, 400);
  if (pipeX<=0) {
     pipeY= (int) random(500, 800);
    pipeX=800;
//  if(intersects(birdX,birdY, pipeX,pipeY,40)){
//    text("YOU HAVE DIED:(", 400, 300);
//exit();
//  }
}
 
}

void keyPressed() {
  if (key=='w') {
    velocity= -10;
  }
}







//boolean intersects(int birdX, int birdY, int pipeX, int pipeY, int pipeWidth) {
//  if (birdY > pipeY - 4 && birdX > pipeX && birdX < pipeX + pipeWidth)
//    return true;
//  else 
//  return false;
//}