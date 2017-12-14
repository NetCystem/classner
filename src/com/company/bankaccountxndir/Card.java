package com.company.bankaccountxndir;

public class Card {
    private String id;
    private int cardBallance;
    private boolean cardBlocked;

    public Card(String id, int cardBallance) {
        if (id.contains("0000")&& id.length()==16) {
            this.id = id;
        }else {
            System.out.println("Wrong id");

        }


        this.cardBallance = cardBallance;

        if (this.cardBallance < -1000){
            this.cardBlocked=true;
        }else {
            this.cardBlocked=false;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCardBallance() {
        return cardBallance;
    }

    public void setCardBallance(int cardBallance) {
        this.cardBallance = cardBallance;
    }

    public boolean isCardBlocked() {
        return cardBlocked;
    }

    public void setCardBlocked(boolean cardBlocked) {
        this.cardBlocked = cardBlocked;
    }



    public void carBlockedWarning(){
        if (isCardBlocked()){
            System.out.println("The Card is Blocked");
        }else {
            System.out.println("Have a good day");
        }
    }
}
