package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class Controller {
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button start;
    public Button newGame;
    public Label ans;
    public int x = 0;
    public Alert alert = new Alert(Alert.AlertType.INFORMATION);

    public void bt1(ActionEvent event) {
        btn1.setFont(new Font(30));
        if (x % 2 == 0) {
            btn1.setText("O");
        } else {
            btn1.setText("X");
        }
        btn1.setDisable(true);
        x++;
        jud();
    }

    public void bt2(ActionEvent event) {
        btn2.setFont(new Font(30));
        if (x % 2 == 0) {
            btn2.setText("O");
        } else {
            btn2.setText("X");
        }
        btn2.setDisable(true);
        x++;
        jud();
    }

    public void bt3(ActionEvent event) {
        btn3.setFont(new Font(30));
        if (x % 2 == 0) {
            btn3.setText("O");
        } else {
            btn3.setText("X");
        }
        btn3.setDisable(true);
        x++;
        jud();
    }
    public void bt4 (ActionEvent event){
        btn4.setFont(new Font(30));
        if (x%2==0){
            btn4.setText("O");
        }else {
            btn4.setText("X");
        }
        btn4.setDisable(true);
        x++;
        jud();
    }
    public void bt5 (ActionEvent event){
        btn5.setFont(new Font(30));
        if (x%2==0){
            btn5.setText("O");
        }else {
            btn5.setText("X");
        }
        btn5.setDisable(true);
        x++;
        jud();
    }
    public void bt6 (ActionEvent event){
        btn6.setFont(new Font(30));
        if (x%2==0){
            btn6.setText("O");
        }else {
            btn6.setText("X");
        }
        btn6.setDisable(true);
        x++;
        jud();
    }
    public void bt7 (ActionEvent event){
        btn7.setFont(new Font(30));
        if (x%2==0){
            btn7.setText("O");
        }else {
            btn7.setText("X");
        }
        btn7.setDisable(true);
        x++;
        jud();
    }
    public void bt8 (ActionEvent event){
        btn8.setFont(new Font(30));
        if (x%2==0){
            btn8.setText("O");
        }else {
            btn8.setText("X");
        }
        btn8.setDisable(true);
        x++;
        jud();
    }
    public void bt9 (ActionEvent event){
        btn9.setFont(new Font(30));
        if (x%2==0){
            btn9.setText("O");
        }else {
            btn9.setText("X");
        }
        btn9.setDisable(true);
        x++;
        jud();
    }
    public void newG (ActionEvent event){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
        btn5.setDisable(false);
        btn6.setDisable(false);
        btn7.setDisable(false);
        btn8.setDisable(false);
        btn9.setDisable(false);
        ans.setText("");
    }
    public void jud (){
        if (btn1.getText().equals(btn2.getText() )&&btn1.getText().equals(btn3.getText())&&!btn1.getText().equals("")){
            ans.setText(btn1.getText()+"win");}
        if (btn1.getText().equals(btn5.getText() )&&btn1.getText().equals(btn9.getText())&&!btn1.getText().equals("")){
            ans.setText( btn1.getText()+"win");}
        if (btn2.getText().equals(btn5.getText() )&&btn2.getText().equals(btn8.getText())&&!btn2.getText().equals("")){
            ans.setText( btn2.getText()+"win");}
        if (btn3.getText().equals(btn6.getText() )&&btn3.getText().equals(btn9.getText())&&!btn3.getText().equals("")){
            ans.setText( btn3.getText()+"win");}
        if (btn1.getText().equals(btn2.getText() )&&btn1.getText().equals(btn3.getText())&&!btn1.getText().equals("")){
            ans.setText( btn1.getText()+"win");}
        if (btn4.getText().equals(btn5.getText() )&&btn4.getText().equals(btn6.getText())&&!btn4.getText().equals("")){
            ans.setText( btn4.getText()+"win");}
        if (btn7.getText().equals(btn8.getText() )&&btn7.getText().equals(btn9.getText())&&!btn7.getText().equals("")){
            ans.setText( btn7.getText()+"win");}
        if (btn7.getText().equals(btn5.getText() )&&btn7.getText().equals(btn3.getText())&&!btn7.getText().equals("")){
            ans.setText( btn7.getText()+"win");}
    }
}
