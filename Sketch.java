import processing.core.PApplet;

public class Sketch extends PApplet {
	
  boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;
  boolean pour = false;
	float r = 255;
  float g = 255;
  float b = 255;
  float circleX = width/2;
  float cloudcircleX = height/2;
  float circleY = height/2;
  String message = "";
  float water = 0;
  float moveX;
  float moveY = mouseY;
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(300, 300);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(32);
    textSize(36);
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void mouseClicked() {
    float me = random(height/3,height/30*19);
    stroke(0,0,255);
    line(mouseX,height/3*2, mouseX, me);
    fill(random(0,255), random(0,255), random(0,255));
    stroke(0,255,0);
    ellipse(mouseX, me, random(10,20),random(10,20));
  }
  public void mouseDragged() {
    stroke(0,255,0);
    float me = random(height/30*15,height/30*19);
    line(mouseX,height/3*2, mouseX, me);
  }
  public void draw() {
    fill(r,g,b);
      stroke(r,g,b);
      ellipse(cloudcircleX-4,circleY,width/20,height/20);
      ellipse(cloudcircleX-6,circleY,width/20,height/20);
      ellipse(cloudcircleX-4,circleY,width/20,height/20);
      ellipse(cloudcircleX-15,circleY,width/20,height/20);
      ellipse(cloudcircleX-13,circleY,width/20,height/20);
      ellipse(cloudcircleX+2,circleY,width/20,height/20);  
    fill(0,255,0);
    stroke(0);
    rect(0,height/3*2,width,height);
    
    if(key == 'r'){
      r=255;
      g=0;
      b=0;
    }
    if(key == 'g'){
      r=0;
      g=255;
      b=0;
    }
    if(key == 'b'){
      r=0;
      g=0;
      b=255;
    }
    if(key == 'w'){
      r=255;
      g=255;
      b=255;
    }
    if(key == 'n'){
      r=32;
      g=32;
      b=32;
    }
    
    if (upPressed) {
      circleY--;
    }
    if (downPressed) {
      circleY++;
    }
    if (leftPressed) {
      cloudcircleX--;
    }
    if (rightPressed) {
      cloudcircleX++;
    }
  
  }
  
  public void keyPressed() {
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    else if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }
  }
  public void keyReleased() {
    if (keyCode == UP) {
      upPressed = false;
    }
    else if (keyCode == DOWN) {
      downPressed = false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
    }
}
  
  
}