void setup(){
  size( 1000,1000);

background(#FFF41F);
}
    
    
 void draw(){

   for(int i =20; i>0; i--){
   
    if (i%2==0){
    fill(  #000000);
    }
    else{
      fill(#FF0000);
    }
    noStroke();
    ellipse(500, 500, 20*i, 20*i);
   
  }
 }
   
    
    
