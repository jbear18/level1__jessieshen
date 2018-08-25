 import ddf.minim.*;
 Minim minim;
 AudioSample sound;
 int rainY=35;
 int rainX=(int) random(1000);
 int score=0;
 String winningMessage= "You have won the game:)";
 void setup(){
   minim = new Minim (this);
   sound = minim.loadSample("waterdropping.wav", 128);
  size(1000,1000);
 
}
void draw(){  
 background(51,102,223); 
  fill(223,223,223);
 ellipse(rainX,rainY,20,30);
 stroke(77,23,65);
rainY+=10;
fill(51,102,223);
rect(mouseX,900,60,70);

if(rainY>=1000){
  checkCatch(rainX);
rainX=(int) random(1000);
 rainY=0;
 sound.trigger();
}
if(score>3){
fill(255,238,278a
text(winningMessage, 500, 500);

}
fill(255, 238, 278);
textSize(30);

  text("Score: " + score, 20, 20);


}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Now your score is: " + score);

 }