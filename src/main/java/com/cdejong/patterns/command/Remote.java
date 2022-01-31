package com.cdejong.patterns.command;

/**
 * A Remote with 5 programmable buttons
 */
public class Remote {

    private Command button1;
    private Command button2;
    private Command button3;
    private Command button4;
    private Command button5;

    public void setButton1(Command button1) {
        this.button1 = button1;
    }

    public void pressButton1() {
        if (button1 == null) { // ignore if button has to action/command
            return;
        }
        button1.execute();
    }

    public void setButton2(Command button2) {
        this.button2 = button2;
    }

    public void pressButton2() {
        if (button2 == null) { // ignore if button has to action/command
            return;
        }
        button2.execute();
    }

    public void setButton3(Command button3) {
        this.button3 = button3;
    }

    public void pressButton3() {
        if (button3 == null) { // ignore if button has to action/command
            return;
        }
        button3.execute();
    }

    public void setButton4(Command button4) {
        this.button4 = button4;
    }

    public void pressButton4() {
        if (button4 == null) { // ignore if button has to action/command
            return;
        }
        button4.execute();
    }

    public void setButton5(Command button5) {
        this.button5 = button5;
    }

    public void pressButton5() {
        if (button5 == null) { // ignore if button has to action/command
            return;
        }
        button5.execute();
    }

}
