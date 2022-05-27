public class dataProviderUser {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "dataProviderUser{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
