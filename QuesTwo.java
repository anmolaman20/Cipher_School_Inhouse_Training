import java.util.*;
public class QuesTwo {
            public static boolean BaseBadlo(int n, int base)

                {

                        int rem = n % base;

                        n = n / base;

                        while (n >= base && (n % base == rem))

                            n = n / base;

                        if (n == rem)

                            return true;

                        return false;
                }

            public static void main (String[]args)

            {
                    System.out.println("\n19EJICS014\n");

                    Scanner scan = new Scanner (System.in);

                    int n = scan.nextInt ();

                    int base = 2;


                    while (BaseBadlo(n, base) != true)

                        base++;

                    System.out.println (base);
                    scan.close();

            }
}