/* 
 * Ugly Christmas Sweater
 */
import java.util.*;

int[][][] data;

void setup() {

  // WINDOW
  size( 600, 600 );

  // BACKGROUND
  background( 255 );

  // READ FILE
  String[] lines = loadStrings( "\\data\\sweater01.txt" );

  // PART 1: PARSE FILE
  parseFile( lines );
  drawUglySweater();
}

void drawUglySweater(){
  int [][] shape;
  for(int shapeCounter = 0;  shapeCounter < data.length; shapeCounter++){
    
    shape = data[shapeCounter];
    
    beginShape();
    for(int pt = 0;  pt < shape.length; pt++){
      vertex(shape[pt][0], shape[pt][1]);
    }
    endShape();
  }
}
  

void parseFile( String[] lines ) {
  
  data = new int[lines.length][][];
  StringTokenizer st;
  int [][] shape;

  for ( int line = 0; line < lines.length; line++ ) {
    
    String newLine = lines[line];
    st = new StringTokenizer(newLine, ", ( ) "); 
    shape = new int[st.countTokens() /2] [2];
    
    for (int coord = 0; coord < shape.length; coord++){
      shape[coord][0] = Integer.parseInt(st.nextToken()); 
      shape[coord][1] = Integer.parseInt(st.nextToken());
    }
    
    println("Max X :" + findMax(shape, 0));
    println("Max Y :" + findMax(shape, 1));
    println("Min X :" + findMin(shape, 0));
    println("Min Y :" + findMin(shape, 1));
    data[line] = shape;
  
  }
}

static int findMax(int[][] values, int col) {
  int max = values[0][0];
  for(int r = 0; r < values.length; r++){
    if (values[r][col] > max) {
        max = values[r][col];
     }
  }
       return max;
}
static int findMin( int[][] values, int col ) {
  int min = values[0][0];
  for(int r = 0; r < values.length; r++){
     if (values[r][col] < min) {
         min = values[r][col];
      }
  }
      return min;
}
