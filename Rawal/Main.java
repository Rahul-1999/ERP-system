package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.stage.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
import java.sql.*;
import javax.swing.*;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root, 1210, 775));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    {


        Flight flight = new Flight(1234);


        FlightDescription obj = new FlightDescription(flight.getFlightNumber(), "28", "12:00", "2:00", "Karachi", 1, "Islamabad", "PIA", 10, 20000);

        TravelAgency travelAgency = new TravelAgency();

        travelAgency.addFlightDescription(obj);

        travelAgency.obtainMembership("2352525", "asad", "house", "03332423");
        travelAgency.displayTravlerList();

        travelAgency.displaySchedule();

        Bank bank = new Bank();
        bank.showList();
        
        MainmenuFrame mainMenuframe = new MainmenuFrame(travelAgency);
        try {
            mainMenuframe.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\Asad\\Desktop\\1474016_324265454381343_878165314_n.jpg")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainMenuframe.pack();
        mainMenuframe.setVisible(true);
        mainMenuframe.setVisible(true);
        
        MainFrame mainfram = new MainFrame(travelAgency);
        mainfram.setVisible(true);


    }

}


class Flight {
    int Flightnum = 0;  //flight number
    int seatNum = 0;
    String Class = new String();

    Flight(int n) {
        Flightnum = n;
    }
    int   getFlightNumber(){
        return Flightnum;
    }
}

class FlightDescription {
         
}

class TravelAgency{
    String s1;
    String s2;
    String s3;
    String s4;
    
    void addFlightDescription(FlightDescription o){
        
    }

    void   obtainMembership(String a,String b,String c,String d){
        this.s1=a;
        this.s2=b;
        this.s3=c;
        this.s4=d;
    }

    void displayTravlerList(){
        System.out.println(s1 + s2 +s3 + s4);
    }
   void displaySchedule() {
       System.out.println("Schedule");
   }
}


class Bank {
   void showList(){
    }

}

class MainmenuFrame{
    
    MainmenuFrame(TravelAgency t) {
   
    }
   void  setContentPane() {
    
    }
    
    void pack() {
    
    }
    void setVisible(Boolean b){
    
    }
}

class MainFrame{
MainFrame(TravelAgency t) {  
    
}
    void setVisible(Boolean b){

    }
}

