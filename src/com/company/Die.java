package com.company;

public class Die {
private int die;

    public void roll() {
        die=(int)(1+Math.random()*6);
    }
    public int getNumDots(){
        return die;
    }
        public static void main(String[] args) {
            Die die = new Die();
            die.roll();
            System.out.println(die.getNumDots());
        }
}
