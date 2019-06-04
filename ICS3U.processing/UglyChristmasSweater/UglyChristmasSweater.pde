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
}

/***************************************
 ** Prase File (PRINT OUT X/Y FOR NOW)
/***************************************/
  

void parseFile( String[] lines ) {
  
  data = new int[lines.length][][];
  StringTokenizer st;
  int [][] shape;

  for ( int line = 0; line < lines.length; line++ ) {
    
    String newLine = lines[line];
    st = new StringTokenizer(newLine, ", ( ) ");
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());  
    shape = new int[st.countTokens() /2] [2];
    shape[st.countTokens() /2][0] = x; 
    shape[st.countTokens() /2][1] = y;
    
    //put data into the array
    data[line] = shape;
  
  }
}
