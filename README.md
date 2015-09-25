# zealous-octo-garbanzo

csvpojomaker.java
Give it the pojo name and the fields names, get the code

# Usage :
Command :
java csvpojomaker Line columnFoo columnBar snakecat

Output :
public class Line {

    private String columnfoo = null ;
    private String columnbar = null ;
    private String snakecat = null ;

    public Line() {}

    public Line(String columnFoo, String columnBar, String snakecat){
        this.setColumnfoo(columnFoo);
        this.setColumnbar(columnBar);
        this.setSnakecat(snakecat);
    }

    public getColumnfoo(){
        return this.columnFoo;
    }

    public setColumnfoo(String columnFoo){
        this.columnFoo=columnFoo;
    }

    public getColumnbar(){
        return this.columnBar;
    }

    public setColumnbar(String columnBar){
        this.columnBar=columnBar;
    }

    public getSnakecat(){
        return this.snakecat;
    }

    public setSnakecat(String snakecat){
        this.snakecat=snakecat;
    }

}

