import java.util.zip.ZipFile;

public class Saldo {

    private double saldo = 0.00;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        if ( valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso, Tenham um bom jogo!");
        }else {
            System.out.println("Deposito recusado! Tente novamente!");
        }

    }
}
