import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int j;
    Scanner inp=new Scanner(System.in);

        System.out.print("Number Enter :");
        j=inp.nextInt();

    for (int i=1;i<=j;i++){
        if (i%2==0)
        System.out.println(i);

    }
    System.out.println("Loop Finish.");

    }
}
