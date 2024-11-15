import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a sentence");
    String sentence = sc.nextLine();
    String part = "";
    int times = 0;
    String lower = sentence.toLowerCase();
    for (int i = 0; i < sentence.length(); i++){
      if (i + 2 <= sentence.length()){
        part = lower.substring(i, i+2);
        if(part.equals("pa") || part.equals("pe") || part.equals("pi") || part.equals("po") || part.equals("pu")){
          times++;
        }
      }
    }
    System.out.println("the consonant P has been followed by a vowel " + times + " times");

    System.out.println("enter another sentence bucko");
    sentence = sc.nextLine();
    lower = sentence.toLowerCase();
    String finalsetence = "";
    for (int i = 0; i < sentence.length(); i++){
      part = lower.substring(i, i+1);
      if (!(part.equals("e") || part.equals("t") || part.equals("a") || part.equals("i") || part.equals("o"))){
         finalsetence += part;
      }
    }
    System.out.println(finalsetence);

    System.out.println("enter 2 strings of the same length");
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();

    String combine = "";
    if (s1.length() != s2.length()){
      System.out.println("error");
    }
    else{
      for (int i = s1.length(); i > -1; i--){
          if (i - 1 >= 0){
            combine +=  s2.substring(i-1, i) + s1.substring(i-1, i);
        }
    }
    System.out.println(combine);
    sc.close();
    }
  
  }
}

