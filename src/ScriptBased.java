import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class ScriptBased {

    public static void main(String[] args) throws Exception{
        ArrayList words = new ArrayList();
        ArrayList<String> lines = new ArrayList();
        HashMap pattern = new HashMap ();
        String temp;

        byte[] in = Files.readAllBytes(Paths.get("C:\\Users\\school\\IdeaProjects\\ScriptBased\\src\\Inputs"));
        String whole = new String(in);

        ArrayList<String> frames = new ArrayList<String>(Arrays.asList(whole.split("\\'")));

        for(int k = 0; k < frames.size(); k++) {
            lines.add(frames.get(k).split("\\$").toString());

            for (int i = 0; i < lines.size(); i++) {
                words.add(lines.get(i).split("\\(\\)").toString());

//            System.out.println(lines.get(i));

                while (words.size() > 1) {
                    pattern.put(words.get(words.size() - 2), words.get(words.size() - 1));

                    System.out.println(words.get(words.size() - 1));
                    System.out.println(words.get(words.size() - 2));

                    temp = "(" + words.get(words.size() - 2) + " " + words.get(words.size() - 1) + ")";

                    System.out.println(temp);

                    words.remove(words.get(words.size() - 1));
                    words.remove(words.get(words.size() - 2));

                    words.add(temp);


                }

                words.clear();
            }
        }









    }

}
