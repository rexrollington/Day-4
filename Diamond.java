public class DiamondPattern{
  public static void main(String[]args){
    int n=5;
    int mid=n/2;
    for(int row=0;row<n;row++){
      int stars=n-2*Math.abs(mid-row);
      int spaces=n-stars;
      for(int s=0;s<spaces;s++){
        System.out.print(" ");
      }
      for(int s=0;s<stars;s++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
