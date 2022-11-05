public class ValidChecker {
    public void checkInputNumber(int number) {
        if (number < 2 || number > 10) throw new RuntimeException("Input number of test cases is not valid");
    }

    public UserRole checkRole(String role) {
        if (role.length() != 6) {
            throw new RuntimeException("Input role is not valid");
        } else if (role.toUpperCase().equals(UserRole.JUNIOR.name())) {
            return UserRole.JUNIOR;
        } else if (role.toUpperCase().equals(UserRole.SENIOR.name())) {
            return UserRole.SENIOR;
        } else return UserRole.GUEST;
    }

    public void checkMoneySpend(int money) {
        if (money < 0 || money > 200) throw new RuntimeException("Input user money spend is not valid");
    }
}
