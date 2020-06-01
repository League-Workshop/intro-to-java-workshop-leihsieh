PImage rainbow;
PImage unicorn;
void setup(){
  rainbow = loadImage("rainbow.jpg");
  size(800,600);
  rainbow.resize(800,600);
  unicorn = loadImage("unicorn.png");
  unicorn.resize(300,200);
}
void draw(){
  background(rainbow);
  if(mousePressed) {
    image(unicorn,mouseX-150,mouseY-100);
    }
}
