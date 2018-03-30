package MVCPatterns;


import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class controller {
    private view view;
    private model model;
    public controller(model model, view view) {

        this.model = model;
        this.view = view;
        this.view.CloseButtonListener(new controller.cListener());
        System.out.println("I'm the controller, i have both " + model + " and "+ view);
    }

    class cListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                System.exit(0);
            } catch (NumberFormatException ex) {
                System.exit(0);
            }


        }
    }

}