/**
 * @fileoverview Goal: Find the Creeper!
 */
PImage creeper;     //at the top of your program
final int CREEPER_X = 652;
final int CREEPER_Y = 390;
final int CREEPER_WIDTH = 60;
final int CREEPER_HEIGHT = 80;

void setup() {
  size(800, 600);
  
  PImage minecraft = loadImage("minecraft.png");     
  minecraft.resize(width, height);         
  background(minecraft);        
  
  creeper=loadImage("creeper.png");   
  creeper.resize(CREEPER_WIDTH, CREEPER_HEIGHT);
}

void draw() {
  image(creeper, CREEPER_X, CREEPER_Y);   
  if (mousePressed) {
    if (isNear(mouseX, mouseY, CREEPER_X, CREEPER_Y)) {
      fill(255, 255, 255);
      textSize(24);
      text("You found the creeper!", 100, 200);
      fill(0, 0, 255);
    } else {
      fill(255, 0, 0);
    }
    ellipse(mouseX, mouseY, 10, 10);
    println("x: " + mouseX + ", y: " + mouseY);
  }
}

boolean isNear(int xMouse, int yMouse, int xCreeper, int yCreeper) {
  boolean isNear = false;
  final int DETECTION_PADDING = 10;
  if (
  (xMouse > xCreeper - DETECTION_PADDING && xMouse < xCreeper + CREEPER_WIDTH + DETECTION_PADDING) // within X bounds
  && (yMouse > yCreeper - DETECTION_PADDING && yMouse < yCreeper + CREEPER_HEIGHT + DETECTION_PADDING) // within Y bounds
  ) {
       isNear = true;
  }
  return isNear;
}
