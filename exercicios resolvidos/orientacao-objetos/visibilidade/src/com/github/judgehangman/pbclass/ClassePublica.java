package com.github.judgehangman.pbclass;

public class ClassePublica{

    ClassePrivada classePrivada = new ClassePrivada();

    void fromClassePrivada(){

        System.out.println("Esse método tem visibilidade padrão e é chamado dentro de uma classe pública");
        System.out.println("Essa classe pública possui uma nested class private e instancia um objeto dela");
        System.out.println("Este método é, então, usado para executar os métodos dessa classe privada");
        System.out.println("Esses são os métodos visíveis para mim: ");
        classePrivada.nestedClassPrivateVoidPrivate();
        classePrivada.nestedClassPrivateVoidPublic();
        classePrivada.nestedClassPrivateVoidDefault();
    }

    private class ClassePrivada {

        public static void main (String[] args) {
            ClassePublica classePublica = new ClassePublica();

            classePublica.topClassPublicVoidPublic();
            classePublica.topClassPublicVoidDefault();
            classePublica.topClassPublicVoidPrivate();
        }

        void nestedClassPrivateVoidDefault(){
            System.out.println("Private Nested Class, Default Void");
        }

        private void nestedClassPrivateVoidPrivate(){
            System.out.println("Private Nested Class, Private Void");
        }

        public void nestedClassPrivateVoidPublic(){
            System.out.println("Private Nested Class, Public Void");
        }
    }

    public void topClassPublicVoidPublic(){
        System.out.println("Public Top Class, Public Void");
    }

    private void topClassPublicVoidPrivate(){
        System.out.println("Public Top Class, Private Void");
    }

    private void topClassPublicVoidDefault(){
        System.out.println("Public Top Class, Default Void");
    }

}
