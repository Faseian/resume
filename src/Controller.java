import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import java.io.*;
import java.util.Scanner;

public class Controller {
    @FXML
    private TextField userField;
    @FXML
    private TextField passField;
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String user;
    private String pass;
    private int lCount;
    player u = new player();
    public void start(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void help(ActionEvent e) {
        Help.about();
    }
    public void tomagotchiPage(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("tomagotchigame.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void titlePage(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("titlePage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void shop(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("shopPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void buyLTF(ActionEvent e) throws IOException {
        tomFood lowTF = new tomFood("Food Scraps", 5, 0);
        u.setTomFoods(lowTF, lCount);
        File userSheet = new File("C:\\Users\\nab4n\\IdeaProjects\\bigproject\\src\\userSheet.txt");
        FileWriter fileWriter = new FileWriter(userSheet, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int i = 0; i < u.getTomFoods().length; i++) {
            if (u.getTomFood(i) != null) {
                printWriter.print(u.getTomFood(i).getFoodName() + "!" + u.getTomFood(i).getEnergy() + "!");
            } else {
                i = u.getTomFoods().length;
            }
        }
        printWriter.close();
        lCount++;
    }

    public void signup(ActionEvent e) throws IOException {
        user = userField.getText();
        pass = passField.getText();
        File userSheet = new File("C:\\Users\\nab4n\\IdeaProjects\\bigproject\\src\\userSheet.txt");
        FileWriter fileWriter = new FileWriter(userSheet, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        if (!userSheet.exists()) {
            userSheet.createNewFile();
        }
        u.setUsername(user); u.setPassword(pass); u.setMoney(0);
        printWriter.print(user + "$" + pass + "$" + 10 +"$");
        printWriter.close();

        root = FXMLLoader.load(getClass().getResource("introPage.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void login(ActionEvent e) throws IOException {
        tomFood foodSetter = new tomFood();
        user = userField.getText();
        pass = passField.getText();
        File readLogin = new File("C:\\Users\\nab4n\\IdeaProjects\\bigproject\\src\\userSheet.txt");
        if (readLogin.exists()) {
            Scanner pLogin = new Scanner(readLogin);
            do {
                String lineCatcher = pLogin.nextLine();
                int holder = lineCatcher.indexOf("$");
                int count = 0;
                String foodString = lineCatcher.substring(lineCatcher.indexOf("!"));
                String tUser = lineCatcher.substring(0,holder);
                String tPass = lineCatcher.substring(holder + 1, lineCatcher.indexOf("$",holder + 1));
                if (user.equals(tUser) && pass.equals(tPass)) {
                    holder = lineCatcher.indexOf("$", holder + 1);
                    int mon = Integer.parseInt(lineCatcher.substring(holder + 1, lineCatcher.indexOf("!")));
                    u.setMoney(mon);
                    //foodSetter.setFoodName(foodString.substring(foodString.indexOf("!"+1), foodString.indexOf("!",holder+2)));
                    //u.setTomFoods(foodSetter, count);
                    System.out.println(foodString);
                    root = FXMLLoader.load(getClass().getResource("tomagotchigame.fxml"));
                    stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                    System.out.println("User Found");
                } else {
                    System.out.println("No user found");
                }
            }
                while (pLogin.hasNext());
        }
    }


    public void farmPage(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("farmPage.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}