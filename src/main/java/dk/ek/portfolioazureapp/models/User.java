package dk.ek.portfolioazureapp.models;

public class User {
    private String username;
    private String password;
    private String fullname;
    private String email;
    private int age;
    private String address;
    private int zipcode;

    /* public User(String unparsedMovie) {
        String[] splitmovie = unparsedMovie.split(";");
        username = splitmovie[0];
        password = splitmovie[1];
        fullname = splitmovie[2];
        email = splitmovie[3];
        age = Integer.parseInt(splitmovie[4]);
        address = splitmovie[5];
        zipcode = Integer.parseInt(splitmovie[6]);
    } */

    public User (String un, String p, String fn, String e, int a, String ad, int zc) {
        username = un;
        password = p;
        fullname = fn;
        email = e;
        age = a;
        address = ad;
        zipcode = zc;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }


    public String getAddress() {
        return address;
    }

    public int getZipCode() {
        return zipcode;
    }

    public void setUserName(String s) {
        username = s;
    }

    public void setPassword(String s) {
        password = s;
    }

    public void setFullName(String s) {
        fullname = s;
    }

    public void setEmail(String s) {
        email = s;
    }

    public void setAge(int i) {
        age = i;
    }


    public void setAddress(String s) {
        address = s;
    }

    public void setZipCode(int i) {
        zipcode = i;
    }

    @Override
    public String toString() {
        return username + ";" + password + ";" + age + ";" + email + ";" + address + ";" + zipcode;
    }
}





