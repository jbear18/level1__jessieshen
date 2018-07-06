void setup(){
 size(800,800);
 background(0);
 
}
int speed=7;
int yspeed=7;
  int x=587;
  int y=178;
void draw(){
  background(0);
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
}