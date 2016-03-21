package serviceForKingdom;
/*
    Job :-
        hold the state of ball and compare the bolls
*/

public class Ball {
    private Color color;

    public Ball(Color color) {
        this.color = color;
    }

    public String getColor(){
        return color.toText();
    }

    public boolean equalTo(Color color){
        return color.equals(color);
    }

}
