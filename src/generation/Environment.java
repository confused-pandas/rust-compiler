package generation;

import java.io.IOException;

public class Environment {
    private int environmentSize;

    public Environment(int environmentSize) {
        this.environmentSize = environmentSize;
    }

    public void openEnvironment(BufferedStringBuilder code) throws IOException {
        code
                .append("// Ouverture de l'environnement")
                .append("STW BP, -(SP)")
                .append("LDW BP, SP")
                .append("// Reservation sur la pile des variables")
                .append("LDQ " + environmentSize + ", R0")
                .append("SUB SP, R0, SP");
    }

    public void closeEnvironment(BufferedStringBuilder code) throws IOException {
        code
                .append("// Fermeture de l'environnement")
                .append("LDW SP, BP")
                .append("LDW BP, (SP)+");
    }
}
