/*
return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
Examples:
ReturnMiddleCharacter.getMiddle("test") should return "es"
ReturnMiddleCharacter.getMiddle("testing") should return "t"
ReturnMiddleCharacter.getMiddle("middle") should return "dd"
ReturnMiddleCharacter.getMiddle("A") should return "A"
*/

import java.util.Scanner;
import java.lang.String;


class ReturnMiddleCharacter {
  public static String getMiddle(String word) {
      if(word.length() % 2 == 0 ){
         word = word.substring((word.length() / 2) - 1, (word.length() / 2) + 1);
      }
      else {
        word = word.substring(word.length() / 2, (word.length() / 2) + 1);
      }   
    return word;
//return (word.length() % 2 == 0 ? word.substring((word.length() / 2) - 1, (word.length() / 2) + 1) : word.substring(word.length() / 2, (word.length() / 2) + 1));
  }
  
}
