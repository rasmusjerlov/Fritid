//package Klodshans;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//import org.w3c.dom.Text;
//
//public class GUI extends Application {
//    private TextField nameInput;
//    private String name;
//    private String nyDeltager;
//    GridPane pane = new GridPane();
//
//    public void start(Stage stage) {
//        stage.setTitle("Klodshans");
//        this.initContent(pane, stage);
//        stage.setWidth(400);
//        stage.setHeight(400);
//
//        Scene scene = new Scene(pane);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    private void initContent(GridPane pane, Stage stage) {
//        // show or hide grid lines
//        pane.setGridLinesVisible(false);
//        // set padding of the pane
//        pane.setPadding(new Insets(10));
//        // set horizontal gap between components
//        pane.setHgap(10);
//        // set vertical gap between components
//        pane.setVgap(10);
//
//        Label lblName = new Label("Name:");
//        pane.add(lblName, 0, 0);
//
//        nameInput = new TextField();
//        pane.add(nameInput, 0, 1, 2, 1);
//
//        Button submit = new Button("Submit");
//        pane.add(submit, 0, 2);
//        GridPane.setMargin(submit, new Insets(10, 10, 10, 50));
//        submit.setOnAction(event -> submit(stage));
//
//    }
//
//    public void submit(Stage stage) {
//        //Opretter nyt objekt af deltager med input fra TextField nameInput
//        Deltager deltager = new Deltager(nameInput.getText());
//        Label nyDeltager = new Label(deltager.getName() + " blev tilføjet!");
//        pane.add(nyDeltager, 0, 3, 3, 1);
//        Label addWhat = new Label("Hvad har " + deltager.getName() + " klodset?");
//        pane.add(addWhat, 0, 4, 4, 1);
//        Storage.deltagere.add(0, deltager);
//
//        //ØLKNAP
//        Button øl = new Button("Øl");
//        pane.add(øl, 0, 5);
//        øl.setOnAction(event -> addØl(stage));
//        //SHOTSKNAP
//        Button shots = new Button("Shots");
//        pane.add(shots, 1, 5);
//        shots.setOnAction(event -> addShots());
//        //SNUSKNAP
//        Button snus = new Button("Snus");
//        pane.add(snus, 2, 5);
//        snus.setOnAction(event -> addSnus());
//        //PENGEKNAP
//        Button penge = new Button("Penge");
//        pane.add(penge, 3, 5);
//        penge.setOnAction(event -> addPenge());
//    }
//
//    public void addØl(Stage stage) {
//        Label howManyBeers = new Label("Hvor mange øl har " +
//                Storage.deltagere.get(0).getName() + " klodset?");
//        pane.add(howManyBeers, 0, 6);
//        TextField beerAmount = new TextField();
//        pane.add(beerAmount, 0, 7);
//        Button tilføj = new Button("Tilføj");
//        pane.add(tilføj, 0, 8);
//        Label beersAdded = new Label();
//        tilføj.setOnAction(event ->
//                {
//                    Storage.deltagere.get(0).setAntalØl(Integer.parseInt(beerAmount.getText()));
//                    beersAdded = (Storage.deltagere.get(0).getAntalØl() +
//                            " øl blev tilføjet til " + Storage.deltagere.get(0).getName());
//                    pane.add(beersAdded, 0, 9);
//                }
//        );
//
//    }
//
//
//
//    public void addShots() {
//        Label howMany = new Label("Hvor mange shots har " +
//                Storage.deltagere.get(0).getName() + " klodset?");
//        pane.add(howMany, 0, 6);
//    }
//
//    public void addSnus() {
//        Label howMany = new Label("Hvor mange skiver har " +
//                Storage.deltagere.get(0).getName() + " klodset?");
//        pane.add(howMany, 0, 6);
//    }
//    public void addPenge() {
//        Label howMany = new Label("Hvor mange penge har " +
//                Storage.deltagere.get(0).getName() + " klodset?");
//        pane.add(howMany, 0, 6);
//    }
//
//}
