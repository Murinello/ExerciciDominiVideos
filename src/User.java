/*Crear Model de classes
Crea un programa en ​ Java​ amb l’estructura de domini de les classes:
-
-
Video: esta format por una URL, un títol i una llista de tags*.
User: esta format per un name, surname, password i una data de registre.
Un usuari pot crear nous vídeos i veure un llistat dels seus videos.
*Un tag es un text amb una paraula, tenir en compte que un video pot tenir varis tags.
La estructura no ha de permetre afegir camps buits, en cas de que n’hi hagi ha de retornar una excepció.
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//LLISTAT DE VIDEOS, TOTS EL SET

public class User {

    //instance data
    private String name;
    private String surname;
    private String password;
    private Date registrationDate;

    private List<Video> listOfVideos;

    //constructor
    public User(String name, String surname, String password, Date registrationDate, List<Video> listOfVideos) throws Exception {

        if (name == null || surname == null || password == null || registrationDate == null || listOfVideos == null) {
            throw new Exception ("Empty fields are not allowed");
        }

        this.name = name;
        this.surname = surname;
        this.password = password;
        this.registrationDate = registrationDate;

        this.listOfVideos = listOfVideos;
    }


    public User() {
        listOfVideos = new  ArrayList<Video>();
    }


    //Getters
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPassword() {
        return password;
    }
    public Date getRegistrationDate() {
        return registrationDate;
    }

    public List<Video> getListOfVideos() {
        return listOfVideos;
    }


    //Setters
    public void setName(String name) throws Exception {
        if (name == null) {
            throw new Exception ("Empty fields are not allowed");
        }
        this.name = name;
    }
    public void setSurname(String surname) throws Exception {
        if (surname == null) {
            throw new Exception ("Empty fields are not allowed");
        }

        this.surname = surname;
    }
    public void setPassword(String password) throws Exception {
        if (password == null || password.isEmpty()) {
            throw new Exception ("Empty fields are not allowed");
        }

        this.password = password;
    }
    public void setRegistrationDate(Date registrationDate) throws Exception {
        if (registrationDate == null) {
            throw new Exception ("Empty fields are not allowed");
        }
        this.registrationDate = registrationDate;
    }

    public void setListOfVideos(List<Video> listOfVideos) throws Exception {
        if (listOfVideos == null) {
            throw new Exception ("Empty fields are not allowed");
        }
        this.listOfVideos = listOfVideos;
    }

    public void addVideos(Video videos) throws Exception {
        if (videos == null) {
            throw new Exception ("Empty fields are not allowed");
        }
        this.listOfVideos.add(videos);
    }

}
