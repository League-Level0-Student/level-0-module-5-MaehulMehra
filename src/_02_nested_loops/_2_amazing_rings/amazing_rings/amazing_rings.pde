 int x = 250;
 int speed = 1;
 int x2 = 750;
  /*** Go to the recipe to run the demonstration before starting this program ***/

void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size (1000, 700);
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();
}

void draw() {
background (200, 200, 200);
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/  
        
       
         for (int i = 500; i >= 100; i -= 50){
              ellipse (x, 250, i, i);
         }
         x += speed;
         
        
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
 
        
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
        if (x == 750){
         speed = -speed; 
        }
        else if (x == 250){
        speed = - speed;
        }
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        for (int ring2 = 500; ring2>=100; ring2 -=50){
         ellipse (x2, 250, ring2, ring2); 
        }
        x2 -= speed;
         if (x2 == 250){
         speed = -speed; 
        }
        else if (x2 == 750){
        speed = - speed;
        }
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
}
