import ddf.minim.*;
Minim minim;
AudioPlayer song;

PImage pictureOfRecord;
int xPosition= 0;
int yPosition= 0;
int imageAngle= 20;
void setup(){
  minim = new Minim(this);
  song = minim.loadFile("song.mp3", 512);
  size(600,600);
pictureOfRecord= loadImage("record.jpg");
pictureOfRecord.resize(height,width);

}

void draw(){

rotateImage(pictureOfRecord,imageAngle);
image(pictureOfRecord,xPosition,yPosition);
if(mousePressed){
imageAngle+=100;
song.play();

}else{
 song.pause();
}
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}