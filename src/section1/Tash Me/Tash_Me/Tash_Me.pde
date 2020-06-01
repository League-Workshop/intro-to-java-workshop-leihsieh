PImage face;
PImage mustache;

void setup(){
 face = loadImage("face.png");
 size(800,600);
 face.resize(800,600);
 mustache = loadImage("mustache.png");
 mustache.resize(150,400);
}

void draw(){
  background(face);
  if (mousePressed){
    image(mustache,mouseX,mouseY);
  }  
}
