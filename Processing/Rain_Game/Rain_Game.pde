 int rainY=35;
 int rainX=(int) random(1000);
 int score=0;
 void setup(){
  size(1000,1000);
 
}
void draw(){
 background(2,45,65); 
  fill(223,223,223);
 ellipse(rainX,rainY,20,30);
 stroke(77,23,65);
rainY+=10;
fill(90,23,899);
rect(mouseX,900,60,70);
checkCatch(rainX);
if(rainY>=1000){
rainX=(int) random(1000);
 rainY=0;
}
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }