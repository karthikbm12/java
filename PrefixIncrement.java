
public class PrefixIncrement{

public static void main(String args[]){
int[] array = {87};
System.out.println("The values before Increment:"+array[0]);
for(int i=0;i<array.length;++i){
++array[i];
System.out.println("The value after Increment is:"+array[i]);
}
}
}