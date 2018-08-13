package cucumber;

public class Belly {
    public int cukes;
    public int hours;
    public boolean hungry = false;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getCukes() {
        return cukes;
    }

    public void setCukes(int cukes) {
        this.cukes = cukes;
    }

    public void eat(int cukes){
        setCukes(cukes);
    }

    public void wait(int hours){
        setHours(hours);
    }
    public boolean hungry(){

        if (getHours()>= 1 ){
            hungry = true;
        }

        return hungry;
    }

}
