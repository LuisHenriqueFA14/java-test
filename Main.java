import java.util.ArrayList;

interface Constants {
    short SALARIO_MINIMO = 1400;
}

class User implements Constants {
    private String nome;
    private byte idade;
    private float salario;
    public boolean casado;

    public User(String nome, byte idade, float salario, boolean casado) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.casado = casado;
    }

    public String primeiroNome() {
        return nome.split(" ")[0];
    }

    public boolean maiorDeIdade() {
        return idade >= 18;
    }

    public byte salariosMinimos() {
        return (byte) Math.round(salario / Constants.SALARIO_MINIMO);
    }
}

public class Main {
    public static void main(String[] args) {
        byte idade = 17;         // byte, short, int, long
        String nome = "Luis";    // String
        float salario = 2890;    // float, double
        boolean casado = false;  // boolean

        User user1 = new User(nome, idade, salario, casado);

        System.out.println(user1.primeiroNome());
        System.out.println(user1.maiorDeIdade());
        System.out.println(user1.salariosMinimos());

        User user2 = new User("Fernanda", (byte) 21, 4300, false);

        User[] userArray = {user1, user2}; // or = new User[2]

        for (User user : userArray) {
            System.out.println(user.primeiroNome());
        }

        ArrayList<User> usersVector = new ArrayList<>();

        usersVector.add(user1);
        usersVector.add(user2);
        usersVector.add(new User("Diego", (byte) 15, 1400, false));

        for (User user : usersVector) {
            System.out.println(user.primeiroNome());
        }

        User newUser = usersVector.get(2);

        System.out.println(newUser.primeiroNome());
    }
}
