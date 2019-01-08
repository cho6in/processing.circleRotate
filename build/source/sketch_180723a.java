import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_180723a extends PApplet {

float radious = 200;

public void setup() {
  
  
}

public void draw() {
  background(255);
  translate(width/2,height/2,0);
  rotateY(frameCount * 0.1f);
  // rotateX(frameCount * 0.1);

  for (float dphi = 0; dphi < 360; dphi += 10) {
    float phi = radians(dphi);
    float x = radious * cos(phi);
    float y = radious * sin(phi);

    strokeWeight(8);
    point(x,y);
  }



}
  public void settings() {  size(500,500,P3D);  pixelDensity(displayDensity()); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_180723a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
