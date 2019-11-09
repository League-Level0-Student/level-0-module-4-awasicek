/**
 * @fileoverview Goal: We’re going to make an image with eyes that follow our mouse!
 */
final String IMAGE_FILE_NAME = "sponge_bob.png";
final int LEFT_EYE_X = 213;
final int LEFT_EYE_Y = 303;
final int RIGHT_EYE_X = 373;
final int RIGHT_EYE_Y = 305;
final int EYE_DIAMETER = 80;
final int PUPIL_DIAMETER = 15;
final int Y_ORIGIN_BETWEEN_EYES = 303;
final int X_ORIGIN_BETWEEN_EYES = 294;
 
void setup() {
  size(800, 600);
  PImage face = loadImage(IMAGE_FILE_NAME);
  face.resize(width, height);
  background(face);
}

void draw() {
  if(mousePressed) println("x: " +mouseX+" & y: " + mouseY);
  
  // whites of eyes
  fill(255, 255, 255);
  ellipse(LEFT_EYE_X, LEFT_EYE_Y, EYE_DIAMETER, EYE_DIAMETER);
  ellipse(RIGHT_EYE_X, RIGHT_EYE_Y, EYE_DIAMETER, EYE_DIAMETER);
  
  // pupils
  fill(0, 0, 0);
  int leftPupilPositionX = mouseX;
  int leftPupilPositionY = mouseY;
  int rightPupilPositionX = mouseX;
  int rightPupilPositionY = mouseY;
  
  float mouseDistanceLeft = sqrt(sq(mouseX - LEFT_EYE_X) + sq(mouseY - LEFT_EYE_Y)); // mouse distance from the center of the left eye
  float mouseDistanceRight = sqrt(sq(mouseX - RIGHT_EYE_X) + sq(mouseY - RIGHT_EYE_Y)); // mouse distance from the center of the left eye

  // position axis at left eye
  float angleLeftEye = atan2(mouseY-LEFT_EYE_Y, mouseX-LEFT_EYE_X);
  // position axis at right eye
  float angleRightEye = atan2(mouseY-RIGHT_EYE_Y, mouseX-RIGHT_EYE_X);

  float adjustedHeightLeft = sin(angleLeftEye) * -EYE_DIAMETER/2;
  float adjustedLengthLeft = cos(angleLeftEye) * -EYE_DIAMETER/2;
  
  float adjustedHeightRight = sin(angleRightEye) * -EYE_DIAMETER/2;
  float adjustedLengthRight = cos(angleRightEye) * -EYE_DIAMETER/2;
  
  if(mouseDistanceLeft > EYE_DIAMETER/2 - PUPIL_DIAMETER/2) { // if the mouse is outside the whites
    leftPupilPositionX = LEFT_EYE_X - (int)adjustedLengthLeft;
    leftPupilPositionY = LEFT_EYE_Y - (int)adjustedHeightLeft;
  } 
  
  if(mouseDistanceRight > EYE_DIAMETER/2 - PUPIL_DIAMETER/2) { // if the mouse is outside the whites
    rightPupilPositionX = RIGHT_EYE_X - (int)adjustedLengthRight;
    rightPupilPositionY = RIGHT_EYE_Y - (int)adjustedHeightRight;
  } 

  // pupils of the eyes
  ellipse(leftPupilPositionX, leftPupilPositionY, PUPIL_DIAMETER, PUPIL_DIAMETER);
  ellipse(rightPupilPositionX, rightPupilPositionY, PUPIL_DIAMETER, PUPIL_DIAMETER);
}
