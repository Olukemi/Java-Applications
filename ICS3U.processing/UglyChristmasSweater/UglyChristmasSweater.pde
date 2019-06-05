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
  transformingSweater(data);
}

/***************************************
 ** Prase File (PRINT OUT X/Y FOR NOW)
/***************************************/
void transformingSweater(int data[][][], int s[][], int row){
  int data[][][] = data[s][row][0];
     int minX = findMinOfSweater(s[row][0], 0);
     int minY = findMinOfSweater(s[row][0], 1);
     int maxX = findMaxOfSweater(s[row][0], 0);
     int maxY = findMaxOfSweater(s[row][0], 1);
  for (int s = 0; s < data.length; s++){
    for (int row = 0; row < data[s].length; s++) {
      data[s][row][0] = data[s][row][0] + minX;
      data[s][row][1] = data[s][row][1] + minY;
      data[s][row][0] = data[s][row][0] + maxX;
      data[s][row][1] = data[s][row][1] + maxY;

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
    shape[st.countTokens() /2][0] = Integer.parseInt(st.nextToken()); 
    shape[st.countTokens() /2][1] = Integer.parseInt(st.nextToken()); 
    
    //put data into the array
    data[line] = shape;
  
  }
}

void findMaxOfShape(int data[][][], int col) {
  for( int s = 0;  s < data.length; s++){
      //max code!
    }
}
void findMinOfShape(int data[][][], int col) {
  for( int s = 0;  s < data.length; s++){
      //min code!
    }
}
