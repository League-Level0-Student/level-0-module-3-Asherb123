void setup() {
  size( 1000, 2000);

  background(#FFF41F);
}

int Yee= 100;
int Speed=1;
void draw() {
  
  background(#FFF41F);
Yee+=Speed;
  if(Yee>500){
  Speed=-1;
  }
  
  for (int i =20; i>0; i--) {

    if (i%2==0) {
      fill(  #000000);
    } else {
      fill(#FF0000);
    }
    noStroke();
    ellipse(250+Yee, 500, 20*i, 20*i);
  ellipse(750-Yee, 500, 20*i, 20*i);
}


}
