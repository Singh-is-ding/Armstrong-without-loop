import java.util.*;
class armstrong
{
    public static void main(String arts[])
    {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int a, b, c;
            System.out.println("enter ur no");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int d, e, f, g;
            d = a * a * a;
            e = b * b * b;
            f = c * c * c;
            g = d + e + f;
            String l, h, i, j, k;

            l = String.valueOf(g);

            h = String.valueOf(a);
            i = String.valueOf(b);
            j = String.valueOf(c);
            k = h + i + j;
            if (l.equals(k)) {
                System.out.println("THIS NO. IS A ARMSTRONG NO.");
            } else {
                System.out.println("THIS NO. IS NOT A ARMSTRONG NO.");

            }
        }

    }
}

