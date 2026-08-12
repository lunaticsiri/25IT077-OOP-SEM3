public class PasswordChecker {

    boolean hasLength(String pw) {
        return pw.length() >= 8;
    }

    boolean hasUpper(String pw) {
        return pw.matches(".*[A-Z].*");
    }

    boolean hasDigit(String pw) {
        return pw.matches(".*[0-9].*");
    }

    boolean hasSpecial(String pw) {
        return pw.matches(".*[^a-zA-Z0-9].*");
    }

    String strength(String pw) {

        int count = 0;

        if (hasLength(pw))
            count++;
        if (hasUpper(pw))
            count++;
        if (hasDigit(pw))
            count++;
        if (hasSpecial(pw))
            count++;

        if (count <= 1)
            return "Weak";
        else if (count <= 3)
            return "Medium";
        else
            return "Strong";
    }
}