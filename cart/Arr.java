package cart;

public class Arr {
    public static void main(String[] args){
        System.out.println("Array");
        for(int idx = 0; idx < args.length; idx++){
            //System.out.printf("idx = %d\n", idx);
            //System.out.printf("value = %s\n", args[idx]); 
        }

        for(String val : args){
            System.out.printf("value = %s\n", val); 
        }
    }
}
