/*Crear Model de classes
Crea un programa en ​ Java​ amb l’estructura de domini de les classes:


Video: esta format por una URL, un títol i una llista de tags*.
Usuari: esta format per un nom, cognom, password i una data de registre.
Un usuari pot crear nous vídeos i veure un llistat dels seus videos.
*Un tag es un text amb una paraula, tenir en compte que un video pot tenir varis tags.
La estructura no ha de permetre afegir camps buits, en cas de que n’hi hagi ha de retornar una excepció.
*/


import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Video {

    private URL url;
    private String title;
    private List<String> tags;

    //constructor
    public Video(URL url, String title, List<String> tags) throws Exception {
        if (url == null || title == null || tags == null) {
            throw new Exception ("Empty fields are not allowed");
        }
        this.url = url;
        this.title = title;
        this.tags = tags;
    }

    public Video() {
        this.tags = new ArrayList<String>();
    }

    //Setters
    public void setUrl(URL url) throws Exception {
        if (url == null) {
            throw new Exception ("Empty fields are not allowed");
        }
        this.url = url;}

    public void setTitle(String title)throws Exception {
        if (title == null) {
            throw new Exception ("Empty fields are not allowed");
        }
        this.title = title;}

    public void setTags(List<String> tags) throws Exception {
        if (tags == null) {
            throw new Exception ("Empty fields are not allowed");
        }
        this.tags = tags;}

    //Getters
    public URL getUrl() {return url;}
    public String getTitle() {return title;}
    public List<String> getTags() {return tags;}


    public void addTags(String tags) throws Exception {
        if (tags == null) {
            throw new Exception ("Empty fields are not allowed");
        }
        this.tags.add(tags);}

    @Override
    public String toString() {
        return "Video{" +
                "url=" + url +
                ", title='" + title + '\'' +
                ", tags=" + tags +
                '}';
    }
}
