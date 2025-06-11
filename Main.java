class Main {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Usage: java Main <num1> <num2> <opération (+,-,*,/)>");
            System.exit(-1);
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String op = args[2];

        switch(op) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if(num2 == 0) {
                    System.out.println("Erreur: division par zéro");
                    System.exit(-1);
                }
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Opération non supportée: " + op);
                System.exit(-1);
        }
    }
}
