public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Esse e o Screen Match!");
        System.out.println("Filme: Barbie: Escola de Princesas");

        int anoDeLancamento = 2011;
        System.out.println("anoDeLançamento : " + anoDeLancamento);
        Boolean incluindoNoPlano = true;
        double notaFilme = 9.0;

        //Média calculada pelas 3 notas da Auany, Fernanda e Isabelle
        double media = (9.0 + 9.5 + 9.0 ) /3;
        System.out.println(media);
        String sinopse = "Blair é uma garota simples e órfã que foi sorteada para estudar na exclusiva Escola de Princesas. A escola é um lugar " +
                "incrível, onde as meninas aprendem dança, etiqueta, arte e outras habilidades indispensáveis a uma princesa. Blair adora suas " +
                "aulas, suas novas fadinhas assistentes e suas novas amigas, as princesas Hadley e Isla. Porém, quand" +
                "o a malvada Dama Devin desconfia que Blair é a princesa e herdeira desaparecida, ela faz de tudo para impedir que Blair assuma" +
                " o trono.";
        System.out.println(sinopse);
        int classcificacao = (int)(media / 9.1);
        System.out.println(classcificacao);
    }
}