/**
 * @fileoverview Goal: The player of the game has to click the mouse where the donkey's tail will go. 
 * The problem is, the picture keeps disappearing!
 */
import ddf.minim.*;
AudioSample woohooSound;
boolean playSound = true;

 PImage donkey;
 PImage tail;
 boolean pinned = false;
 int xPinned = 0;
 int yPinned = 0;
 
void setup() {
  Minim minim = new Minim(this);
  woohooSound = minim.loadSample("homer_woohoo.mp3");

  size(800, 600);
  donkey = loadImage("donkey.jpg");
  donkey.resize(width, height);
  tail = loadImage("donkey_tail.png");
  tail.resize(100, 150);
}

void draw() {
  println("X: " + mouseX + ", Y: " + mouseY);
  
  // only show the donkey if the mouse is within the starting bounding box
  // note: actually more of a bounding circle given the way dist() works
  if(pinned || dist(0, 0, mouseX, mouseY) < 30) {
    background (donkey);
  } else {
    background(#000000);
  }
  
  // instructions
  textSize(24);
  text("Try to pin the tail on the donkey!",100,20);
  
  if(mousePressed && !pinned) {
    pinned = true;
    xPinned = mouseX;
    yPinned = mouseY;
  }
  
  // starting bounding box (for debugging)
  //fill(0, 255, 0);
  //rect(0, 0, 30, 30);
  
  // target bounding box (for debugging)
  //rect(580, 220, 40, 60);
  
  // draw the tail -- pin it to a fixed position once the user clicks the mouse
  if(pinned) {
    image(tail, xPinned - 50, yPinned);
  } else {
    image(tail, mouseX - 50, mouseY);
  }
  
  // check win condition
  if((580 < xPinned && xPinned < 620) && (220 < yPinned && yPinned < 280)) {
    // put these lines where you want the sound to play
    if (playSound) {
       woohooSound.trigger();
       playSound = false;
    }
  }


  
}
