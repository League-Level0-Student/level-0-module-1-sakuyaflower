PImage mr;
void setup(){
mr= loadImage("mushroom.ppm.gif");
size(1000,1000);

}
void draw(){
fill(#F2E03D);
ellipse(400,400,500,500);
fill(#F5112C);
ellipse(400,400,450,450);
fill(#EFF03C);
ellipse(400,400,400,400);
image(mr,400,400,30,30); 
image(mr, 430,430,30,30);
image(mr, 450,450,30,30);
image(mr, 430,470,30,30);
image(mr, 450,490,30,30);
if(mousePressed);{
}
}