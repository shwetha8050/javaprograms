//find min and max value in array
class minmax{
    public static int min(int[] num){
        int min=1;
      for(int i=1; i<num.length; i++){
        if(num[i]<min){
            min=num[i];
        }
      }
      return min;
    }
    public static int max(int[] num){
        int max=0;
        for(int i = 0; i < num.length; i++) {

            if(num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
    public static void  main(String args[]){
        int[] num = {4,6,8,0,9,10}; 
        System.out.println(min(num));
        System.out.println(max(num));
    }
}
