//Displaying the even numbers between 1 to 100 and are multiples of 5
public class EvenNum{
/**
 * @param args
 */
public static void main(String[] args){

for(int x=1; x<100; x++){
    if(x%2==0 && x%5==0){
        System.out.println(x);
    }
}
}
}
