import ddf.minim.*;  
Minim minim;
AudioSample sound;
  PImage backgroundImage;
void setup(){
  minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
backgroundImage = loadImage("html-color-codes-color-tutorials-hero-00e10b1f.jpg");
 size(800,800);
 background(0);
 backgroundImage.resize(800,800);
 
}
int speed=7;
int yspeed=7;
  int x=587;
  int y=178;
void draw(){
  sound.trigger();
  background(0);
    image(backgroundImage, 0, 0);

rect(mouseX,700,100,25);

fill(#1B19E0);
stroke(#FFF700);
ellipse(x,y,20,20);
y+= yspeed;
x+=speed;
if(x>=800){
  speed = -speed;
}
if(x<=1){
speed = -speed;
}
if(y>=800){
  yspeed = -yspeed;
}
if(y<=1){
yspeed = -yspeed;
}
if(intersects(x, y, mouseX, 700, 100)){
  yspeed= -yspeed;
}

}


boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}