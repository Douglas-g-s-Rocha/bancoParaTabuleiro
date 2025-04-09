public class conta {

    private String id;
    private String senha;

    public conta(String id, String senha) {

        this.id = id;
        this.senha = senha;

    }

    public String getId() {

        return id;

    }

    public String getSenha() {
        return senha;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void ids() {
        System.out.println("ID: " + id);
        System.out.println("Senha: " + senha);
    }

}
