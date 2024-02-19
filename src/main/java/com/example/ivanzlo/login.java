public class login {
    private static int id_gen;
    private String name_user;
    private String password;
    private static int id = id_gen++;


    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        login.id = id;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
