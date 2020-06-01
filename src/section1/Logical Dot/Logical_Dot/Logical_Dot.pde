void setup() {
  size(600,600);
}

void draw() {
  //fill(#FF0303);
  ellipse(200,200,100,100);
  if(mousePressed) {
    fill(#031DFF);
  } else {
    fill(#05FF03);
  }
}
