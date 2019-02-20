/*Crear Model de classes
Crea un programa en ​ Java​ amb l’estructura de domini de les classes:
-
-
Video: esta format por una URL, un títol i una llista de tags*.
User: esta format per un nom, cognom, password i una data de registre.
Un usuari pot crear nous vídeos i veure un llistat dels seus videos.
*Un tag es un text amb una paraula, tenir en compte que un video pot tenir varias tags.
La estructura no ha de permetre afegir camps buits, en cas de que n’hi hagi ha de retornar una excepció.
*/

import java.net.URL;

/**
 * @author Murinelo
 */
public class DominiVideos {

    public static void main(String[] args) throws Exception {

        Video video1 = new Video();
        video1.setTitle("The best hockey skills ever!");
        video1.setUrl(new URL("https://www.youtube.com/watch?v=nyrXWxcArZI&t"));
        String tags1 = new String("Hockey, Skills, WorldCup");
        video1.addTags(tags1);

        Video video2 = new Video();
        video2.setTitle("Maddie Hinch Hockey Goalkeeper Training and Best Saves");
        video2.setUrl(new URL("https://www.youtube.com/watch?v=yMND1S-c7MI&t"));
        String tags2 = new String("Maddie, Hinch, Goalkeeper, Goalie");
        video2.addTags(tags2);

        User user1 = new User();
        user1.setName("Murinelo");
        user1.addVideos(video1);
        user1.addVideos(video2);

        for (Video v : user1.getListOfVideos()) {
            System.out.println();
            System.out.println("User: " + user1.getName());
            System.out.println("Title: " + v.getTitle());
            System.out.println("URL: " + v.getUrl());
            System.out.println("Tags: " + v.getTags());
        }
    }
}
