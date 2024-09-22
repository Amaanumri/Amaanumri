public class reverse{
    public static void main(String args[]){
      String str = "my name is amaan umri";
      String result = "";

      for(int i = str.length()-1; i>=0; i--)
      result+=str.charAt(i);

      System.out.println(result);

    }
}