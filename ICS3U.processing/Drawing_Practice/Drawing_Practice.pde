/* 
 * Random Drawing!!!!!
 */
import java.util.*;

int[][][] data;

void setup() {

  // WINDOW
  size( 600, 600 );

  // BACKGROUND
  background( 255 );

  // READ FILE
  String[] lines = loadStrings( "coordinates.txt" );

  // PART 1: PARSE FILE
  parseFile( lines );
  transformingDrawing();
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

void transformingDrawing(){
     int minX = findMinOfDrawing(data, 0);
     int minY = findMinOfDrawing(data, 1);
     int maxX = findMaxOfDrawing(data, 0);
     int maxY = findMaxOfDrawing(data, 1);
     println("Min X :" + minX);
     println("Min Y :" + minY);
     println("Max X :" + maxX);
     println("Max Y :" + maxY);

     int widthX = maxX - minX;
     int widthY = maxY - minY;
     
     int factor = Math.min( width/widthX, height/widthY );
     for (int s = 0; s < data.length; s++){
        for (int row = 0; row < data[s].length; row++) {
            data[s][row][0] = (data[s][row][0] + Math.abs( minX - 2) ) * factor;
            data[s][row][1] = height - ( ( data[s][row][1] + Math.abs( minY - 2) ) * factor );
        }
     }
     println( factor );
     println( minX + " " + maxX );
}

void parseFile( String[] lines ) {
  data = new int[lines.length][][];
  StringTokenizer st;
  int [][] shape;
  for (int i = 0; i < lines.length; i++){
    String line = lines[i];
    st = new StringTokenizer(line, ", ( )");
    shape = new int[st.countTokens() /2] [2];
    for (int point = 0; point < shape.length; point++){
      shape[point][0] = Integer.parseInt(st.nextToken());
      shape[point][1] = Integer.parseInt(st.nextToken());
    }
    data[i] = shape;
  } 
}

static int findMaxOfDrawing(int data[][][], int col) {
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

static int findMinOfDrawing(int data[][][], int col) {
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
