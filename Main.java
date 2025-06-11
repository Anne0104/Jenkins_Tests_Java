class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Main <num1> <num2> <operation>");
            System.exit(-1);
        }
        if (args[(args.length - 1)].equals("+")) {
            System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
        } else if (args[(args.length - 1)].equals("-")) {
            System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[1]));
        } else if (args[(args.length - 1)].equals("*")) { // Ajout de la multiplication
            System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
        } else if (args[(args.length - 1)].equals("/")) { // Ajout de la division
            int num2 = Integer.parseInt(args[1]);
            if (num2 != 0) {
                System.out.println(Integer.parseInt(args[0]) / num2);
            } else {
                System.out.println("Erreur : Division par zéro.");
            }
        } else {
            System.out.println("Opération non reconnue. Utilisez +, -, * ou /.");
            System.exit(-1);
        }
    }
}
