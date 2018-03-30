package MVCPatterns;

public class main {

    public static void main(String[] args) {
        runMain();
    }
    public static void runMain(){
        model model = new model();
        view view = new view(model);
        controller Controller = new controller(model, view);
    }
}