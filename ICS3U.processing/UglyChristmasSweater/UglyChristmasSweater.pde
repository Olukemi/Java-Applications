/* 
 * Ugly Christmas Sweater
 */
import java.util.*;


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

  for ( int i = 0; i < lines.length; i++ ) {
    
    String newLine = lines[i];
    String [] coordinates = splitTokens(newLine, ", ( ) ");
    print(coordinates[0] + " ");  // Prints "a"
    println(coordinates[1]);  // Prints "b"
  
  }
}
