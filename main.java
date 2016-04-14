import java.util.Scanner;
import java.lang.String;


class Kata {
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
