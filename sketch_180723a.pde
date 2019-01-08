float radious = 200;

void setup() {
  size(500,500,P3D);
  pixelDensity(displayDensity());
}

void draw() {
  background(255);
  translate(width/2,height/2,0);
  rotateY(frameCount * 0.1);
  // rotateX(frameCount * 0.1);

  for (float dphi = 0; dphi < 360; dphi += 10) {
    float phi = radians(dphi);
    float x = radious * cos(phi);
    float y = radious * sin(phi);

    strokeWeight(8);
    point(x,y);
  }



}
