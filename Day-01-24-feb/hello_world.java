import java.util.Date;

public class hello_world {
public static void main (String[] args) {

    int i = 1;
    int sum = 1 ;
    int n = 5;

    Date today = new Date();

    for(i=1;i<=n;i++) {
        sum = i+sum ;
        System.out.println("this is the sum inside for"+" "+sum+" "+today);
    }
    do {
        i=i+1;
        System.out.println("This is i inside do loop"+" "+i);
    }

    while(i<n) ;

}
}