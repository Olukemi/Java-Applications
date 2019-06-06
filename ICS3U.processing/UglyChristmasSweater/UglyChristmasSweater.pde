/* 
 * Ugly Christmas Sweater!
 */
import java.util.*;

int[][][] data;

void setup() {

  // WINDOW
  size( 600, 600 );

  // BACKGROUND
  background( 255 );

  // READ FILE
  String[] lines = loadStrings( "\\data\\sweater03.txt" );

  // PART 1: PARSE FILE
  parseFile( lines );
  transformingSweater();
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

/***************************************
 ** Prase File (PRINT OUT X/Y FOR NOW)
/***************************************/
void transformingSweater(){
     int minX = findMinOfSweater(data, 0);
     int minY = findMinOfSweater(data, 1);
     int maxX = findMaxOfSweater(data, 0);
     int maxY = findMaxOfSweater(data, 1);
     int deltaX = maxX - minX;
     int deltaY = maxY - minY;
     
     int factor = Math.min( width/deltaX, height/deltaY );
     
     println( factor );
     
     println( minX + " " + maxX );
  
  for (int s = 0; s < data.length; s++){
    for (int row = 0; row < data[s].length; row++) {
      data[s][row][0] = (data[s][row][0] + Math.abs( minX ) ) * factor;
      data[s][row][1] = height - ( ( data[s][row][1] + Math.abs( minY ) ) * factor );
    }
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
static int findMaxOfSweater(int data[][][], int col) {
  int max = data[0][0][0];
  for( int s = 0;  s < data.length; s++){
      for(int r = 0; r < data[s].length; r++){
         if (data[s][r][col] > max) {
           max = data[s][r][col];
         }
      }
   }
   return max;
}
static int findMinOfSweater(int data[][][], int col) {
  int min = data[0][0][0];
  for( int s = 0;  s < data.length; s++){
      for(int r = 0; r < data[s].length; r++){
         if (data[s][r][col] < min) {
            min = data[s][r][col];
         }
      }
   }
   return min;
}
