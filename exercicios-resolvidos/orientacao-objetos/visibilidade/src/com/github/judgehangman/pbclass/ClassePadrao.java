package com.github.judgehangman.pbclass;

class ClassePadrao {

    public static void main (String[] args) {

        System.out.println("Essa classe tem visibilidade padrão");
        System.out.println("Estou no mesmo pacote que a classe publica");
        System.out.println("Crio um objeto da Classe Publica para acessar seus métodos dentro do meu main");

        ClassePublica classePublica = new ClassePublica();

        System.out.println("\nEsses são os métodos acessíveis a mim: ");
        classePublica.fromClassePrivada();
        classePublica.topClassPublicVoidPublic();

        System.out.println("Crio um método para acessar os atributos de mina nested class protegida");
        System.out.println("Esses são os métodos acessíveis a mim: ");
        System.out.println("Sem métodos :(");
        System.out.println("Se tento acessar de uma classe protegida que também é static");
        fromStaticClasseProtegida();

    }

    void fromClasseProtegida(){
        ClasseProtegida classeProtegida = new ClasseProtegida();
        classeProtegida.nestedProtectedDefaultVoid();
        classeProtegida.nestedProtectedPrivateVoid();
        classeProtegida.nestedProtectedPublicVoid();

    }

    static void fromStaticClasseProtegida(){
        ClasseProtegidaStatic classeProtegidaStatic = new ClasseProtegidaStatic();
        classeProtegidaStatic.nestedProtectedDefaultVoid();
        classeProtegidaStatic.nestedProtectedPrivateVoid();
        classeProtegidaStatic.nestedProtectedPublicVoid();

    }

    protected class ClasseProtegida{

        public static void main (String[] args) {
            System.out.println("Essa classe tem visibilidade protegida");
            System.out.println("Estou no mesmo pacote que a classe publica");
            System.out.println("Crio um objeto da Classe Publica para acessar seus métodos dentro do meu main");

        }

        void nestedProtectedDefaultVoid(){
            System.out.println("Protected Nested Class, Default void");
        }

        public void nestedProtectedPublicVoid(){
            System.out.println("Protected Nested Class, Public void");
        }

        private void nestedProtectedPrivateVoid(){
            System.out.println("Protected Nested Class, Private void");
        }

    }

    protected static class ClasseProtegidaStatic{

        public static void main (String[] args) {
            System.out.println("Essa classe tem visibilidade protegida");
            System.out.println("Estou no mesmo pacote que a classe publica");
            System.out.println("Crio um objeto da Classe Publica para acessar seus métodos dentro do meu main");

        }

        void nestedProtectedDefaultVoid(){
            System.out.println("Protected Nested Class, Default void");
        }

        public void nestedProtectedPublicVoid(){
            System.out.println("Protected Nested Class, Public void");
        }

        private void nestedProtectedPrivateVoid(){
            System.out.println("Protected Nested Class, Private void");
        }

    }


}
