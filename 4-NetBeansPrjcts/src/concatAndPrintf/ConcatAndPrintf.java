package concatAndPrintf;

public class ConcatAndPrintf {
    public static void main(String[] args) {
        int i,j,k;
        i=2;
        j=3;
        k=i+j;
        System.out.println("The addition of "+i+" and "+j+" is equal to: "+k);
        System.out.printf("The addition of %d and %d is equal to: %d",i,j,k);
    }
}
