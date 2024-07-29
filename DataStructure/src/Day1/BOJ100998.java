package Day1;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ100998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());

        System.out.println(a+b);

    }
}
