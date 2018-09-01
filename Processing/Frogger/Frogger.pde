Car car1= new Car(300,300,50,5);
Car car2= new Car(300, 50,50,4);
Car car3=new Car(300,200,50,3);
Car car4= new Car(300,369, 50,2);

int hopX = width/2;
int hopY = 480;

void setup() {
  size(500, 500);

}

void draw () { 
  background(87, 187, 232);
  drawBackground(); 
  
car1.display();
car2.display();
car3.display();
car4.display();

car1.left();
car3.left();
car2.right();
car4.right();

car1.checkBoundary();
car2.checkBoundary();
car3.checkBoundary();
car4.checkBoundary();


if(intersects(car1)){
  hopY= 480;
}
if(intersects(car2)){
  hopY=480;
  
}
if(intersects(car3)){
  hopY=480;
}
if(intersects(car4)){
  hopY=480;
}
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


public class Car{
int carX; 
int carY;
int carSize;
int carSpeed; 
//constructor
Car(int carX, int carY, int carSize, int carSpeed){
  this.carX=carX;
  this.carY= carY;
  this.carSpeed= carSpeed;
  this.carSize= carSize;
  
}
//methods

void display(){
      fill(255,0,0);
      rect(carX , carY, carSize, 50);
}
void left(){
carX-=carSpeed;    
}
void right(){
  carX+=carSpeed;
}
void checkBoundary(){
  if(carX<=0){
   carX=500; 
  }else if(carX>=width){
    carX=0;
  }
}
int getX(){
  return carX;
}
int getY(){
 return carY; 
}
int getSize(){
  return carSize;
}
}//end car class
boolean intersects(Car car) {
if ((hopY > car.getY() && hopY < car.getY()+50) && (hopX > car.getX() && hopX < car.getX()+car.getSize()))
          return true;
    else 
        return false;
}