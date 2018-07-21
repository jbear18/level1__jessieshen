 int rainY=35;
 void setup(){
  size(1000,1000);
 
}
void draw(){
 background(2,45,65); 
 ellipse(20,rainY,20,30);
 fill(223,223,223);
 stroke(77,23,65);
rainY+=10;

if(rainY>=1000){
 rainY=0;
}
}