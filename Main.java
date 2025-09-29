public class Main
{
  public static void main(String[] args)
  {
    // write your code here
    
    
    
    lastFirstN("cream", "butter", 3);
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output;
    String firstN;
    String lastN;

    firstN = s2.substring(0, n);
    int startPosition = s1.length() - n;
    lastN = s1.substring(n);


    output = lastN + firstN;
    System.out.println(output);

  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    String firstS;
    firstS = s1.toUpperCase();
    System.out.println(firstS);

    String secondS;
    String firstL;
    String restL;

    firstL = s2.substring(0,1);
    firstL = firstL.toUpperCase();

    restL = s2.substring(1);
    restL = restL.toLowerCase();

    secondS = firstL + restL;
    System.out.println(secondS);

  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    return output;
  }
}
