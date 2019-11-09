/**
 * @fileoverview Goal: Make a program where the user has to find Waldo!
 */

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
final int WALDO_X = 510;
final int WALDO_Y = 288;
final int WALDO_DETECTION_RANGE = 12;

void setup() {
  PImage waldo = loadImage("wheres_waldo.jpg"); // Change this to match your file name.
  size(1024, 768);
  waldo.resize(width, height);
  image(waldo, 0, 0);
  doh = minim.loadSample("homer_doh.mp3"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer_woohoo.mp3"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
      if(mousePressed && 
          (WALDO_X - WALDO_DETECTION_RANGE < mouseX && mouseX < WALDO_X + WALDO_DETECTION_RANGE) &&
          (WALDO_Y - 2*WALDO_DETECTION_RANGE < mouseY && mouseY < WALDO_Y + 2*WALDO_DETECTION_RANGE)
      ) {  
        // If the mouse is on Waldo, print “Waldo found!”
        println("Waldo found!");
        // If Waldo is found, also use the method below to play “Woohoo”
        // Change the name of the sound file if you need to 
        playWoohoo();
      } else if (mousePressed) {
        // If the mouse is pressed and they’re not on Waldo, play “Doh”
        // Change the name of the sound file if you need to 
        playDoh();
      }
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}
