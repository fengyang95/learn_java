package designpattern.builder.message;

public class Client {
    public static void main(String[] args){
        Builder welcomeBuilder =new WelcomeBuilder();
        Director director1=new Director(welcomeBuilder);
        director1.construct("12.qq","34.qq");

        Builder goodbyeBuilder=new GoodbyeBuilder();
        Director director2=new Director(goodbyeBuilder);
        director2.construct("34.qq","12.qq");
    }
}
