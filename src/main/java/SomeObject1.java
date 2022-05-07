public class SomeObject1 implements Executable {
    private int i;
    private String s;
    private char c;

    public int getI(){
        return i;
    }

    public String getS(){
        return s;
    }

    public char getC(){
        return c;
    }

    public void setI(int i){
        this.i = i;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public void execute() {
        System.out.println("execute");
    }
}
