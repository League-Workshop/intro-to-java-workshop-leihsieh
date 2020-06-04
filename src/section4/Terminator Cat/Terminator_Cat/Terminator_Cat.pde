PImage cat;
int x = 285;
int y = 184;
int accel = 3;
void setup(){
  size(650,500);
  cat = loadImage("catImage.jpg");
  cat.resize(650,500);
  background(cat);
}

void draw(){
  if(mousePressed){
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
  
    }
    
    fill(#FF0313);
    noStroke();
    circle(x,y,40);
    circle(x+79,y,40);
}
void keyPressed() {
x+=4*accel;
y+=4*accel;
if(x >= 650){
  background(cat);
  x = 285;
  y = 184;
}
}
