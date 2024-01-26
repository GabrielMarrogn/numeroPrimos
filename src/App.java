import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine());

        double b = a / Math.log(a);
        double c = 1.25506 * a/Math.log(a);

        System.out.printf("%.1f ",b);
        System.out.printf("%.1f\n", c);
    }
}
