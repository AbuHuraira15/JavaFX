package org.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorMake {
    @FXML
    private Label label1,label2;

    String Type;
    private boolean flag=false;
    int i=0;
    double x=0,y=0;
    char []data=new char[30];
    String dataCalculate,getDataCalculate;
    public void methodPlus(ActionEvent event){
        flag=false;
        if (Type==null){
            Type="+";label1.setText(null);reSet();
            label2.setText(dataCalculate+Type);
        }else {

            if(y!=0){
                result();
                reSet();check();
                Type="+";
                y=0;
                label1.setText(null);
                label2.setText(dataCalculate+Type);
            }else {
                Type="+";
                label2.setText(dataCalculate+Type);
            }

        }

    }
    public void methodSub(){
        flag=false;
        if (Type==null){reSet();
            Type="-";label1.setText(null);
            label2.setText(dataCalculate+Type);
        }else {

            if(y!=0){
                result();
                reSet();check();
                Type="-";
                y=0;
                label1.setText(null);
                label2.setText(dataCalculate+Type);
            }else {
                Type="-";
                label2.setText(dataCalculate+Type);
            }

        }
    }

    public void methodCross(){
        flag=false;

        if (Type==null){reSet();
            Type="*";label1.setText(null);
            label2.setText(dataCalculate+Type);
        }else {
            if(y!=0){
                result();
                reSet();check();
                Type="*";y=0;
                label1.setText(null);
                label2.setText(dataCalculate+Type);
            }
            else {
                Type="*";
                label2.setText(dataCalculate+Type);
            }

        }
    }

    public void methodDivide(){
        flag=false;

        if (Type==null){reSet();
            Type="/";label1.setText(null);
            label2.setText(dataCalculate+Type);
        }else {
            if(y!=0){
                result();
                reSet();check();
                Type="/";y=0;
                label1.setText(null);
                label2.setText(dataCalculate+Type);
            }
            else {
                Type="/";
                label2.setText(dataCalculate+Type);
            }

        }
    }

    public void reSet(){
        data=new char[30];
        i=0;
    }
    public void methodSqure(){
        check();
        label2.setText(dataCalculate+"*"+dataCalculate);
        x=x*x;
        check();
        String s=(String.valueOf(x));
        i=0;
        for(int j=0;j<s.length();j++){
            data[j]=s.charAt(j);i++;
        }
        label1.setText(dataCalculate);
        getDataCalculate=new String();
        Type=null;
        y=0;
    }
    public void methodEqual(){
        label2.setText(dataCalculate+Type+getDataCalculate);
        result();
        check();
        String s=(String.valueOf(x));
        i=0;
        for(int j=0;j<s.length();j++){
            data[j]=s.charAt(j);i++;
        }
        label1.setText(dataCalculate);
        getDataCalculate=new String();
        Type=null;
        y=0;
    }
    public void check(){
        if(x>(int)x){
            dataCalculate=String.valueOf(x);
        }else {
            dataCalculate=String.valueOf((int)(x));
        }
    }
    public void method0(){
        setValue('0');
    }
    public void method1(){
        setValue('1');
    }
    public void method2(){
        setValue('2');
    }
    public void method3(){
        setValue('3');
    }
    public void method4(){
        setValue('4');
    }
    public void method5(){
        setValue('5');
    }
    public void method6(){
        setValue('6');
    }
    public void method7(){
        setValue('7');
    }
    public void method8(){
        setValue('8');
    }
    public void method9(){
        setValue('9');
    }
    public void methodPersent(){
        if(Type=="*"){
            check();
            x=x*(y/100);
            label2.setText(dataCalculate+Type+(y +"/"+"100"));
            check();
            label1.setText(dataCalculate);
        }else {
            flag=false;

            if (Type==null){reSet();
                Type="%";label1.setText(null);
                label2.setText(dataCalculate+Type);
            }else {
                if(y!=0){
                    result();
                    reSet();check();
                    Type="%";y=0;
                    label1.setText(null);
                    label2.setText(dataCalculate+Type);
                }
                else {
                    Type="%";
                    label2.setText(dataCalculate+Type);
                }

            }
        }

    }
    public void methodStop(){
        flag=true;
        setValue('.');

    }

    public void methodClear(){
        label1.setText(null);
        label2.setText(null);
        x=0;y=0;
        reSet();Type=null;
    }
    public void methodDelete(){
        if(Type==null){

            try {
                if((data[i-2]=='.')&&(i>0)){
                    data[i]=0;
                    data[i-1]=0;
                    data[i-2]=0;
                    data[i-3]=0;
                    i=i-3;
                    dataCalculate=String.valueOf(data);
                    x=Double.parseDouble(dataCalculate);
                    label1.setText(dataCalculate);
                }
                else if(i>0){
                    data [--i]=0;
                    dataCalculate=new String(data);
                    label1.setText(dataCalculate);
                    x=Double.parseDouble(dataCalculate);
                }
            }catch (Exception e){
                if(i>0){
                    data [--i]=0;
                    dataCalculate=new String(data);
                    label1.setText(dataCalculate);
                    if(i==0){
                        x=0.0;
                    }else {
                        x=Double.parseDouble(dataCalculate);
                    }
                }

            }



        }else {
            if(i>0){
                --i;
            } if(i==0){
                data[i]=0;
                getDataCalculate=new String(data);
                label1.setText(getDataCalculate);
                y=0.0;
            }else {
                data[i]=0;
                if(data[i-1]=='.'){
                    data[i]=0;
                    data[i-1]=0;
                    data[i--]=0;
                }
                getDataCalculate=new String(data);
                label1.setText(getDataCalculate);
                y=Double.parseDouble(getDataCalculate);
            }
        }
    }
    public void result(){
        switch (Type) {
            case "+" -> {x += y;y=0;}
            case "-" -> {x -= y;y=0;}
            case "*" -> {x *= y;y=0;}
            case "/" -> {
                if(y==0){
                   label2.setText("Infinitive");
                   label1.setText("0");
                   x=0;y=0;
                }
                else{
                    x /= y;
                    y=0;
                }

            }case "%"->{x%=y;y=0;}

        }
        label1.setText(null);
        reSet();
    }

    public void setValue(char value){

            if(Type==null){
                System.out.println("A");
                if (flag){
                    for (char datum : data) {
                        if (datum == '.') {
                            flag = false;
                            break;
                        }
                    }

                }
                if(flag){
                    data[i++]=value;
                }
                else {
                    data[i++]=value;
                }
                dataCalculate=new String(data);
                if((data[i-1]=='.')&&(i==1)){
                    x=0.0;
                    data[0]='0';
                    data[1]='.';
                    i=2;
                }else {
                    x=Double.parseDouble(dataCalculate);
                }
                label1.setText((dataCalculate));

            }else {
                if (flag){
                    for (char datum : data) {
                        if (datum == '.') {
                            flag = false;
                            break;
                        }
                    }

                }
                if(flag){
                    data[i++]=value;
                }
                else {
                    data[i++]=value;
                }
                getDataCalculate=new String(data);
                if((data[i-1]=='.')&&(i==1)){
                    y=0.0;
                    data[0]='0';
                    data[1]='.';
                    i=2;
                }else {
                    y=Double.parseDouble(getDataCalculate);
                }
                label1.setText((getDataCalculate));
            }


    }
}
