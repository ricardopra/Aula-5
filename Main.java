public class Main {
    public static void main(String[] args) {
        // Caso de Teste 1
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite a marca do carro:");
        String marca1 = scanner.nextLine();
        System.out.println("Digite o modelo do carro:");
        String modelo1 = scanner.nextLine();
        System.out.println("Digite o ano de fabricação do carro:");
        int ano1 = scanner.nextInt();
        System.out.println("Digite a quilometragem do carro:");
        int km1 = scanner.nextInt();
        Carro carro1 = new Carro(marca1, modelo1, ano1, km1);
        System.out.println("Digite a quantidade para adicionar à quilometragem:");
        int addKm1 = scanner.nextInt();
        carro1.adicionarQuilometragem(addKm1);
        System.out.println("Digite a quantidade para subtrair da quilometragem:");
        int subKm1 = scanner.nextInt();
        carro1.subtrairQuilometragem(subKm1);
        //System.out.println(carro1);

        // Caso de Teste 2
        scanner.nextLine(); // Consumir a nova linha
        System.out.println("Digite a marca do segundo carro:");
        String marca2 = scanner.nextLine();
        System.out.println("Digite o modelo do segundo carro:");
        String modelo2 = scanner.nextLine();
        System.out.println("Digite o ano de fabricação do segundo carro:");
        int ano2 = scanner.nextInt();
        System.out.println("Digite a quilometragem do segundo carro:");
        int km2 = scanner.nextInt();
        Carro carro2 = new Carro(marca2, modelo2, ano2, km2);
        System.out.println("Digite a quantidade para adicionar à quilometragem:");
        int addKm2 = scanner.nextInt();
        carro2.adicionarQuilometragem(addKm2);
        System.out.println("Digite a quantidade para subtrair da quilometragem:");
        int subKm2 = scanner.nextInt();
        carro2.subtrairQuilometragem(subKm2);
        //System.out.println(carro2);

        // Caso de Teste 3
        scanner.nextLine(); // Consumir a nova linha
        Carro carro3 = new Carro();
        System.out.println("Digite a marca do terceiro carro:");
        carro3.setMarca(scanner.nextLine());
        System.out.println("Digite o modelo do terceiro carro:");
        carro3.setModelo(scanner.nextLine());
        System.out.println("Digite o ano de fabricação do terceiro carro:");
        carro3.setAnoFabricacao(scanner.nextInt());
        System.out.println("Digite a quilometragem do terceiro carro:");
        carro3.setQuilometragem(scanner.nextInt());
        System.out.println("Digite a quantidade para adicionar à quilometragem:");
        int addKm3 = scanner.nextInt();
        carro3.adicionarQuilometragem(addKm3);
        System.out.println("Digite a quantidade para subtrair da quilometragem:");
        int subKm3 = scanner.nextInt();
        carro3.subtrairQuilometragem(subKm3);
        //System.out.println(carro3);

        //data output
        //cancelei os system.out em cada teste para apresentar no final conforme exercicio

        System.out.println("\nInformações dos carros:");
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);

        scanner.close();
    }
}

