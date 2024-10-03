public class App {
    public static void main(String[] args) throws Exception {
        utilizando_static();

            //Instancia de um objeto
            Veiculo v = new Veiculo();
            
            //Chamando variaveis publicas
            v.marca="Ford";
            v.modelo="KA";

            Veiculo v1 = new Veiculo();
            v1.marca="Fiat";
            v1.modelo"Uno";

            final String teste_final;
            teste_final="Meu primeiro valor";
            teste_final="Meu segundo valor";

        public static void utilizando_static(){
            Produto.inteiro1 = 10;
            Produto.inteiro2 = 20;

            Produto.inteiro1=15;
        }
        public static void utilizando_static(){
        String st, st2, st3;
        float real, real2;
        int inteiro1, inteiro2;
        }

        //String para Real
        st = "1.2";
        real = (float) (new Float(st).floatValue());
        //real = 
        System.out.println("String para Real: " + real);

        //String para Real
        real2= 1.3f;
        st2 = new Float(real2).toString();
        //ou
        //st2 = String.valueOF(real12);

        System.out.println("Real para String: "+st2);

        //String Inteiro
        st3="15";
        inteiro1 = Integer.parseInt(st3);
        System.out.println("Strig para inteiro: " +inteiro1);

        //Inteiro para String
        inteiro2 = 25;
        String st4 = Integer.toString(inteiro2);
        //ou
        //st4 = String.ValueOF(inteiro2);
        //ou
        // st4 = "" + inteiro2;
        System.out.println("Inteiro para String: "+st4);



    }
}
