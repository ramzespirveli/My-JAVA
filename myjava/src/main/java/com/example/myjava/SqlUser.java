package com.example.myjava;

import java.sql.*;
import java.util.Random;

public class SqlUser extends Person {
    private static final String USER = "root";
    private static  final int PORT = 3308;
    private static final String DATABASE_NAME = "student";
    private static  final String PASSWORD = "12345678";
    private  static final  String URL = "jdbc:mysql://localhost:" + PORT + "/" + DATABASE_NAME ;
    Conection conection;


    //
    // მეთოდი რომელიც ამატებს მომხმარებელს ბაზაში
    public void setUser(Person person) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        try {

             conection = new Conection();
            String statement = "insert into studentUser(firstName, lastName, siti, userName, email, age, pasword) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conection.getConection().prepareStatement(statement);

            preparedStatement.setString(1,person.getfName());
            preparedStatement.setString(2,person.getlName());
            preparedStatement.setString(3,person.getCiti());
            preparedStatement.setString(4,person.getUser());
            preparedStatement.setString(5,person.getMail());
            preparedStatement.setInt(6,person.getAge());
            preparedStatement.setString(7,person.getPass());

            preparedStatement.executeUpdate();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ფუნქციას გამოაქვს სახელი და გვარი
    public String get_f_l_name(int id) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        PreparedStatement preparedStatement = null;
        String person = "";
        try {
            conection = new Conection();
            String statement = "select firstName,lastName from studentUser  where id = ?";
            preparedStatement = conection.getConection().prepareStatement(statement);
            preparedStatement.setInt(1,id);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Person p = new Person();
                p.setfName(rs.getString("firstName"));
                p.setlName(rs.getString("lastName"));
               // person = (rs.getString("firstName") + " " + rs.getString("lastName"));
                person = p.getfName() + " " + p.getlName();
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return person;
    }
    //მეთოდი რომელიც ეძებს არისთუარა ამ უზერის პაროლი შეყვანილი ველში,- მონაცემთა ბაზაში ამ უზერის პაროლი;
    public boolean searcPass(String user, String pass) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        PreparedStatement preparedStatement = null;
        boolean var = false;
        try {
            conection = new Conection();
            String statement = "select pasword from studentUser where userName = ?";
            preparedStatement = conection.getConection().prepareStatement(statement);
            preparedStatement.setString(1, user);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                if (rs.getString("pasword").equals(pass))
                    var = true;
            }


        }catch (SQLException e){
            e.printStackTrace();
        }
        preparedStatement.close();
        return var;
    }
    // მეთოდი რომელიც აღადგენს დავიწყებულ პაროლს
    public void sendNewPass(String mail) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        PreparedStatement preparedStatement = null;
        SqlUser sc = new SqlUser();
        try {
            conection = new Conection();
            String statement = "select * from studentUser";
            preparedStatement = conection.getConection().prepareStatement(statement);

            // პირობის თუ შესრულდა, სტატიკური მეთოდი აგზავნის შემთხვევით პაროლს მეილზე და ბაზაში
            if (sc.searchEmail(mail)){
                sendemail(mail);
                preparedStatement.executeQuery();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        preparedStatement.close();
    }
    //პრივატული მეთოდი რომელის აგზავნის გადაცემულ მეილზე ახალ პაროლს და ამ პაროლით ცვლის არსებულ პაროლს
    private static void sendemail(String email) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        PreparedStatement preparedStatement = null;
        Random r = new Random();
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String statement = "UPDATE studentUser SET pasword = ? where email = ?";
            preparedStatement = connection.prepareStatement(statement);

            //აქ გენერირდება ოთხ ციფრიანი შემთხვევითი პაროლი
            int n = 0;
            while (n < 1000){
                n = r.nextInt(9999);
            }
            preparedStatement.setString(1, Integer.toString(n));
            preparedStatement.setString(2, email);
           /* System.out.println("აქ სმს ით   n  შემთხვევით ციფრს ვაგზავნი მეილზე ან მობილურზე " +
                    "რომელიც მანამდე გაიგზავნა ბაზაში და შეცვალა პაროლი");*/

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        preparedStatement.close();
    }
    // მეთოდი რომელიც ცვლის ძველ პაროლს ახლით
    public void updatePass(String myPass, String newPass) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        PreparedStatement preparedStatement = null;
        SqlUser sc = new SqlUser();
        try {
            conection = new Conection();
            String statement = "update studentUser set pasword = ? where pasword = ?";
            preparedStatement = conection.getConection().prepareStatement(statement);
            //ვამოწმებ პაროლს ბაზაში არის უარა
            if (sc.userNoEmty(myPass)){

                preparedStatement.setString(1, newPass);
                preparedStatement.setString(2, myPass);
                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        preparedStatement.close();

    }
    //უზერის საშუალებით გამოაქვს ID
    public int getId(String name) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        PreparedStatement preparedStatement = null;
        int s =0;
        try {
            conection = new Conection();
            String statement = "select id from studentUser where userName = ?";
            preparedStatement = conection.getConection().prepareStatement(statement);
            preparedStatement.setString(1,name);


            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next())
                s = (rs.getInt("id"));


        }
        catch (SQLException e){
            e.printStackTrace();
        }

        preparedStatement.close();
        return s;
    }

    // მეთოდი რომელიც შეამოწმებს არისთუარა ამ პაროლით რეგისტრირებული მომხმარებელი
    public boolean userNoEmty(String pass) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        PreparedStatement preparedStatement = null;
        boolean var = false;
        try {
            conection = new Conection();
            String statement = "select * from studentUser";
            preparedStatement = conection.getConection().prepareStatement(statement);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                if (rs.getString("pasword").equals(pass))
                    var = true;

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        preparedStatement.close();
        return var;

    }

    //მეთოდი რომელიც ეძებს მეილს. თუ არის მსგავსი იმეილი გამოაქვს ჭეშმარიტობა
    public boolean searchEmail(String email) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        PreparedStatement preparedStatement = null;
        boolean var = false;
        try {
            conection = new Conection();
            String statement = "select * from studentUser";
            preparedStatement = conection.getConection().prepareStatement(statement);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                if (rs.getString("email").equals(email))
                    var = true;

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        preparedStatement.close();
        return var;
    }

}
